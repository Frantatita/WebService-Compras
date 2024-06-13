
package xx.mx.uv.consumo.wsdl;

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
 *         &lt;element name="agregarPresupuestoResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "agregarPresupuestoResult"
})
@XmlRootElement(name = "agregarPresupuestoResponse")
public class AgregarPresupuestoResponse {

    @XmlElement(required = true, nillable = true)
    protected String agregarPresupuestoResult;

    /**
     * Obtiene el valor de la propiedad agregarPresupuestoResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgregarPresupuestoResult() {
        return agregarPresupuestoResult;
    }

    /**
     * Define el valor de la propiedad agregarPresupuestoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgregarPresupuestoResult(String value) {
        this.agregarPresupuestoResult = value;
    }

}
