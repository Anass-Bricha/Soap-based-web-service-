
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Convert_QNAME = new QName("http://ws/", "Convert");
    private final static QName _ConvertResponse_QNAME = new QName("http://ws/", "ConvertResponse");
    private final static QName _Compte_QNAME = new QName("http://ws/", "compte");
    private final static QName _CompteList_QNAME = new QName("http://ws/", "compteList");
    private final static QName _CompteListResponse_QNAME = new QName("http://ws/", "compteListResponse");
    private final static QName _GetCopte_QNAME = new QName("http://ws/", "getCopte");
    private final static QName _GetCopteResponse_QNAME = new QName("http://ws/", "getCopteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Convert }
     * 
     * @return
     *     the new instance of {@link Convert }
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     * @return
     *     the new instance of {@link ConvertResponse }
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link CompteList }
     * 
     * @return
     *     the new instance of {@link CompteList }
     */
    public CompteList createCompteList() {
        return new CompteList();
    }

    /**
     * Create an instance of {@link CompteListResponse }
     * 
     * @return
     *     the new instance of {@link CompteListResponse }
     */
    public CompteListResponse createCompteListResponse() {
        return new CompteListResponse();
    }

    /**
     * Create an instance of {@link GetCopte }
     * 
     * @return
     *     the new instance of {@link GetCopte }
     */
    public GetCopte createGetCopte() {
        return new GetCopte();
    }

    /**
     * Create an instance of {@link GetCopteResponse }
     * 
     * @return
     *     the new instance of {@link GetCopteResponse }
     */
    public GetCopteResponse createGetCopteResponse() {
        return new GetCopteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Convert")
    public JAXBElement<Convert> createConvert(Convert value) {
        return new JAXBElement<>(_Convert_QNAME, Convert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConvertResponse")
    public JAXBElement<ConvertResponse> createConvertResponse(ConvertResponse value) {
        return new JAXBElement<>(_ConvertResponse_QNAME, ConvertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompteList }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compteList")
    public JAXBElement<CompteList> createCompteList(CompteList value) {
        return new JAXBElement<>(_CompteList_QNAME, CompteList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompteListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compteListResponse")
    public JAXBElement<CompteListResponse> createCompteListResponse(CompteListResponse value) {
        return new JAXBElement<>(_CompteListResponse_QNAME, CompteListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCopte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCopte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCopte")
    public JAXBElement<GetCopte> createGetCopte(GetCopte value) {
        return new JAXBElement<>(_GetCopte_QNAME, GetCopte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCopteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCopteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCopteResponse")
    public JAXBElement<GetCopteResponse> createGetCopteResponse(GetCopteResponse value) {
        return new JAXBElement<>(_GetCopteResponse_QNAME, GetCopteResponse.class, null, value);
    }

}
