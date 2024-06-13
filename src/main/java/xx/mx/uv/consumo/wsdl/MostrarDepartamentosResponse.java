
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
 *         &lt;element name="mostrarDepartamentosResult" type="{http://schemas.datacontract.org/2004/07/departamento}ArrayOfDepartamento"/&gt;
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
    "mostrarDepartamentosResult"
})
@XmlRootElement(name = "mostrarDepartamentosResponse")
public class MostrarDepartamentosResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfDepartamento mostrarDepartamentosResult;

    /**
     * Obtiene el valor de la propiedad mostrarDepartamentosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDepartamento }
     *     
     */
    public ArrayOfDepartamento getMostrarDepartamentosResult() {
        return mostrarDepartamentosResult;
    }

    /**
     * Define el valor de la propiedad mostrarDepartamentosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDepartamento }
     *     
     */
    public void setMostrarDepartamentosResult(ArrayOfDepartamento value) {
        this.mostrarDepartamentosResult = value;
    }

}
