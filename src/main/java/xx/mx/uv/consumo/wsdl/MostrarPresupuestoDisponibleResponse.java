
package xx.mx.uv.consumo.wsdl;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mostrarPresupuestoDisponibleResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mostrarPresupuestoDisponibleResult"
})
@XmlRootElement(name = "mostrarPresupuestoDisponibleResponse")
public class MostrarPresupuestoDisponibleResponse {

    @XmlElement(required = true)
    protected BigDecimal mostrarPresupuestoDisponibleResult;

    /**
     * Obtiene el valor de la propiedad mostrarPresupuestoDisponibleResult.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMostrarPresupuestoDisponibleResult() {
        return mostrarPresupuestoDisponibleResult;
    }

    /**
     * Define el valor de la propiedad mostrarPresupuestoDisponibleResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMostrarPresupuestoDisponibleResult(BigDecimal value) {
        this.mostrarPresupuestoDisponibleResult = value;
    }

}
