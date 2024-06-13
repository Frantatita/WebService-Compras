package com.example.compras;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.entidades.Carrito;
import com.example.entidades.OrdenCompra;
import com.example.entidades.Producto;
import com.example.entidades.SeguimientoCompra;
import com.example.repositorios.CarritoRepository;
import com.example.repositorios.OrdenCompraRepository;
import com.example.repositorios.ProductoRepository; // Importa tu repositorio de Producto
import com.example.repositorios.SeguimientoCompraRepository;

import mx.uv.t4is.compras.AgregarProductoAlCarritoRequest;
import mx.uv.t4is.compras.AgregarProductoAlCarritoResponse;
import mx.uv.t4is.compras.GenerarOrdenCompraRequest;
import mx.uv.t4is.compras.GenerarOrdenCompraResponse;
import mx.uv.t4is.compras.SeguimientoCompraRequest;
import mx.uv.t4is.compras.SeguimientoCompraResponse;

@Endpoint
public class ComprasEndPoint {

    @Autowired
    private ProductoRepository productoRepository; // Inyecta tu repositorio de Producto

    @Autowired
    private CarritoRepository carritoRepository; // Inyecta tu repositorio de Carrito

    @Autowired
    private OrdenCompraRepository ordenCompraRepository; // Inyecta tu repositorio de OrdenCompra

    @Autowired
    private SeguimientoCompraRepository ordenSeguimientoRepository; // Inyecta tu repositorio de SeguimientoCompra

    @PayloadRoot(localPart = "AgregarProductoAlCarritoRequest", namespace = "t4is.uv.mx/compras")
    @ResponsePayload
    public AgregarProductoAlCarritoResponse productoAlCarrito(@RequestPayload AgregarProductoAlCarritoRequest request) {
        AgregarProductoAlCarritoResponse response = new AgregarProductoAlCarritoResponse();

        // Buscar el producto por id
        Producto producto = productoRepository.findById(request.getProductoId()).orElse(null);
        if (producto == null) {
            response.setMensaje("Producto no encontrado");
            return response;
        }

        // Crear una nueva entrada en el carrito
        Carrito carrito = new Carrito();
        carrito.setProducto(producto);
        carrito.setNombre(producto.getNombre());
        carrito.setPrecio(producto.getPrecio());
        carrito.setCantidad(request.getCantidad());

        // Guardar el carrito
        carritoRepository.save(carrito);

        // Crear la respuesta
        response.setMensaje("Producto agregado al carrito   " + "Producto: " + producto.getNombre() + ", Cantidad: "
                + request.getCantidad()
                + ", Precio Unitario: " + producto.getPrecio());
        return response;
    }

    @PayloadRoot(localPart = "GenerarOrdenCompraRequest", namespace = "t4is.uv.mx/compras")
    @ResponsePayload
    public GenerarOrdenCompraResponse generarOrden(@RequestPayload GenerarOrdenCompraRequest request) {
        // Crear una nueva instancia de OrdenCompra
        OrdenCompra ordenCompra = new OrdenCompra();
        ordenCompra.setNombreCliente(request.getCliente());
        ordenCompra.setFecha(request.getFechaOrden().toGregorianCalendar().getTime());
        ordenCompra.setEstado("Activa");

        // Buscar el carrito asociado
        Optional<Carrito> carritoOpt = carritoRepository.findById(request.getIdCarritoque());
        if (!carritoOpt.isPresent()) {
            GenerarOrdenCompraResponse response = new GenerarOrdenCompraResponse();
            response.setOrden("Carrito no encontrado con ID: " +
                    request.getIdCarritoque());
            return response;
        }
        Carrito carrito = carritoOpt.get();
        ordenCompra.setCarrito(carrito);
        ordenCompra.setNombre(carrito.getNombre());
        ordenCompra.setPrecio(carrito.getPrecio());
        ordenCompra.setCantidad(carrito.getCantidad());

        // Guardar la orden de compra en la base de datos
        ordenCompraRepository.save(ordenCompra);

        // Crear la respuesta
        GenerarOrdenCompraResponse response = new GenerarOrdenCompraResponse();
        response.setOrden("Orden de compra generada con carrito ID: " +
                request.getIdCarritoque() +
                ", Cliente: " + request.getCliente() +
                ", Fecha: " + request.getFechaOrden());
        System.out.println("Orden de compra generada");
        return response;
    }

    @PayloadRoot(localPart = "SeguimientoCompraRequest", namespace = "t4is.uv.mx/compras")
    @ResponsePayload
    public SeguimientoCompraResponse seguimientoCompra(@RequestPayload SeguimientoCompraRequest request) {

        SeguimientoCompraResponse response = new SeguimientoCompraResponse();

        // Obtener datos de la solicitud
        Integer idOrdenCompra = request.getIdOrden();
        
        // Convertir el idOrdenCompra de Integer a Long
        Long idOrdenCompraLong = Long.valueOf(idOrdenCompra);
        
        // Buscar la OrdenCompra por ID utilizando el repositorio directamente
        Optional<OrdenCompra> ordenOpt = ordenCompraRepository.findById(idOrdenCompraLong);
        if (!ordenOpt.isPresent()) {
            response.setEstado("Orden de compra no encontrada con ID: " + idOrdenCompra);
            return response;
        }
        
        OrdenCompra ordenCompra = ordenOpt.get();
        
        // Crear una nueva entrada de SeguimientoCompra
        SeguimientoCompra seguimientoCompra = new SeguimientoCompra();
        seguimientoCompra.setOrdenCompra(ordenCompra);
        seguimientoCompra.setEstado(ordenCompra.getEstado());
        seguimientoCompra.setFecha(new java.sql.Date(ordenCompra.getFecha().getTime()));
        seguimientoCompra.setNombre(ordenCompra.getNombreCliente());
        
        // Guardar el seguimiento
        ordenSeguimientoRepository.save(seguimientoCompra);

        // Construir la respuesta
        //  response.setEstado("Seguimiento de compra creado exitosamente");
        response.setEstado("Estado: " + seguimientoCompra.getEstado() +
                ", Fecha: " + seguimientoCompra.getFecha() +
                ", Nombre: " + seguimientoCompra.getNombre());
        return response;
    }

}
