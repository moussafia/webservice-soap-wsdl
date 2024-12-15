
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _Consulter_QNAME = new QName("http://ws.mohammedia.enset.ma/", "Consulter");
    private static final QName _ConsulterResponse_QNAME = new QName("http://ws.mohammedia.enset.ma/", "ConsulterResponse");
    private static final QName _ConversionEuroToDh_QNAME = new QName("http://ws.mohammedia.enset.ma/", "ConversionEuroToDh");
    private static final QName _ConversionEuroToDhResponse_QNAME = new QName("http://ws.mohammedia.enset.ma/", "ConversionEuroToDhResponse");
    private static final QName _ListComptes_QNAME = new QName("http://ws.mohammedia.enset.ma/", "ListComptes");
    private static final QName _ListComptesResponse_QNAME = new QName("http://ws.mohammedia.enset.ma/", "ListComptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Consulter }
     * 
     * @return
     *     the new instance of {@link Consulter }
     */
    public Consulter createConsulter() {
        return new Consulter();
    }

    /**
     * Create an instance of {@link ConsulterResponse }
     * 
     * @return
     *     the new instance of {@link ConsulterResponse }
     */
    public ConsulterResponse createConsulterResponse() {
        return new ConsulterResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDh }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToDh }
     */
    public ConversionEuroToDh createConversionEuroToDh() {
        return new ConversionEuroToDh();
    }

    /**
     * Create an instance of {@link ConversionEuroToDhResponse }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToDhResponse }
     */
    public ConversionEuroToDhResponse createConversionEuroToDhResponse() {
        return new ConversionEuroToDhResponse();
    }

    /**
     * Create an instance of {@link ListComptes }
     * 
     * @return
     *     the new instance of {@link ListComptes }
     */
    public ListComptes createListComptes() {
        return new ListComptes();
    }

    /**
     * Create an instance of {@link ListComptesResponse }
     * 
     * @return
     *     the new instance of {@link ListComptesResponse }
     */
    public ListComptesResponse createListComptesResponse() {
        return new ListComptesResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Consulter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Consulter }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.mohammedia.enset.ma/", name = "Consulter")
    public JAXBElement<Consulter> createConsulter(Consulter value) {
        return new JAXBElement<>(_Consulter_QNAME, Consulter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsulterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.mohammedia.enset.ma/", name = "ConsulterResponse")
    public JAXBElement<ConsulterResponse> createConsulterResponse(ConsulterResponse value) {
        return new JAXBElement<>(_ConsulterResponse_QNAME, ConsulterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDh }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.mohammedia.enset.ma/", name = "ConversionEuroToDh")
    public JAXBElement<ConversionEuroToDh> createConversionEuroToDh(ConversionEuroToDh value) {
        return new JAXBElement<>(_ConversionEuroToDh_QNAME, ConversionEuroToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDhResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDhResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.mohammedia.enset.ma/", name = "ConversionEuroToDhResponse")
    public JAXBElement<ConversionEuroToDhResponse> createConversionEuroToDhResponse(ConversionEuroToDhResponse value) {
        return new JAXBElement<>(_ConversionEuroToDhResponse_QNAME, ConversionEuroToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.mohammedia.enset.ma/", name = "ListComptes")
    public JAXBElement<ListComptes> createListComptes(ListComptes value) {
        return new JAXBElement<>(_ListComptes_QNAME, ListComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.mohammedia.enset.ma/", name = "ListComptesResponse")
    public JAXBElement<ListComptesResponse> createListComptesResponse(ListComptesResponse value) {
        return new JAXBElement<>(_ListComptesResponse_QNAME, ListComptesResponse.class, null, value);
    }

}
