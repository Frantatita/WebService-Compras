
package xx.mx.uv.consumo.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="alcanzaElPresupuestoResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "alcanzaElPresupuestoResult"
})
@XmlRootElement(name = "alcanzaElPresupuestoResponse")
public class AlcanzaElPresupuestoResponse {

    protected boolean alcanzaElPresupuestoResult;

    /**
     * Obtiene el valor de la propiedad alcanzaElPresupuestoResult.
     * 
     */
    public boolean isAlcanzaElPresupuestoResult() {
        return alcanzaElPresupuestoResult;
    }

    /**
     * Define el valor de la propiedad alcanzaElPresupuestoResult.
     * 
     */
    public void setAlcanzaElPresupuestoResult(boolean value) {
        this.alcanzaElPresupuestoResult = value;
    }

}
