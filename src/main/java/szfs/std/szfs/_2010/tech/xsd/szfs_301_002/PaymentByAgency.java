//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2017.06.28 ʱ�� 09:53:29 AM CST 
//


package szfs.std.szfs._2010.tech.xsd.szfs_301_002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PaymentByAgency complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PaymentByAgency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}GroupHeader1"/>
 *         &lt;element name="PmtByAgcyInf" type="{urn:szfs:std:szfs:2010:tech:xsd:szfs.301.002.01}PaymentByAgencyInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentByAgency", propOrder = {
    "grpHdr",
    "pmtByAgcyInf"
})
public class PaymentByAgency {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "PmtByAgcyInf", required = true)
    protected PaymentByAgencyInformation pmtByAgcyInf;

    /**
     * ��ȡgrpHdr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader1 }
     *     
     */
    public GroupHeader1 getGrpHdr() {
        return grpHdr;
    }

    /**
     * ����grpHdr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader1 }
     *     
     */
    public void setGrpHdr(GroupHeader1 value) {
        this.grpHdr = value;
    }

    /**
     * ��ȡpmtByAgcyInf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PaymentByAgencyInformation }
     *     
     */
    public PaymentByAgencyInformation getPmtByAgcyInf() {
        return pmtByAgcyInf;
    }

    /**
     * ����pmtByAgcyInf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentByAgencyInformation }
     *     
     */
    public void setPmtByAgcyInf(PaymentByAgencyInformation value) {
        this.pmtByAgcyInf = value;
    }

}