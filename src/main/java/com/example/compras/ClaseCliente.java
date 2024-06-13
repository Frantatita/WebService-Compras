package com.example.compras;

import java.math.BigDecimal;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import xx.mx.uv.consumo.wsdl.SustraerPresupuesto;
import xx.mx.uv.consumo.wsdl.SustraerPresupuestoResponse;

public class ClaseCliente extends WebServiceGatewaySupport {

    public SustraerPresupuestoResponse quitarPresupuesto(int id, BigDecimal monto) {
        SustraerPresupuesto presupuesto = new SustraerPresupuesto();
        presupuesto.setId(id);
        presupuesto.setMonto(monto);
        SustraerPresupuestoResponse respuesta = (SustraerPresupuestoResponse)
        // docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}} -
        // {{range $p, $conf := .NetworkSettings.Ports}}{{(index $conf 0).HostPort}}
        // {{end}}' $(docker ps -aq)
        getWebServiceTemplate().marshalSendAndReceive(
                "https://presupuestodespliege-production.up.railway.app/Presupuesto.dran", presupuesto,
                new SoapActionCallback("http://tempuri.org/sustraerPresupuesto"));
        return respuesta;
    }
}