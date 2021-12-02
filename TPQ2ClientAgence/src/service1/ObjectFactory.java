
package service1;

import java.util.HashMap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service1 package. 
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

    private final static QName _PrixChoisiResponse_QNAME = new QName("http://service/", "prixChoisiResponse");
    private final static QName _GetAllCombinationsResponse_QNAME = new QName("http://service/", "getAllCombinationsResponse");
    private final static QName _GetHotelNom_QNAME = new QName("http://service/", "getHotelNom");
    private final static QName _GetHotelNomResponse_QNAME = new QName("http://service/", "getHotelNomResponse");
    private final static QName _GetAgenceIdentifiant_QNAME = new QName("http://service/", "getAgenceIdentifiant");
    private final static QName _AgenceLogin_QNAME = new QName("http://service/", "agenceLogin");
    private final static QName _PrixChoisi_QNAME = new QName("http://service/", "prixChoisi");
    private final static QName _GetAllCombinations_QNAME = new QName("http://service/", "getAllCombinations");
    private final static QName _AgenceLoginResponse_QNAME = new QName("http://service/", "agenceLoginResponse");
    private final static QName _GetAgenceIdentifiantResponse_QNAME = new QName("http://service/", "getAgenceIdentifiantResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HashMapWrapper }
     * 
     */
    public HashMapWrapper createHashMapWrapper() {
        return new HashMapWrapper();
    }

    /**
     * Create an instance of {@link HashMapWrapper.AllCombinations }
     * 
     */
    public HashMapWrapper.AllCombinations createHashMapWrapperAllCombinations() {
        return new HashMapWrapper.AllCombinations();
    }

    /**
     * Create an instance of {@link Agence }
     * 
     */
    public Agence createAgence() {
        return new Agence();
    }

    /**
     * Create an instance of {@link Agence.HotelPartenaireTarif }
     * 
     */
    public Agence.HotelPartenaireTarif createAgenceHotelPartenaireTarif() {
        return new Agence.HotelPartenaireTarif();
    }

    /**
     * Create an instance of {@link GetAllCombinations }
     * 
     */
    public GetAllCombinations createGetAllCombinations() {
        return new GetAllCombinations();
    }

    /**
     * Create an instance of {@link AgenceLogin }
     * 
     */
    public AgenceLogin createAgenceLogin() {
        return new AgenceLogin();
    }

    /**
     * Create an instance of {@link PrixChoisi }
     * 
     */
    public PrixChoisi createPrixChoisi() {
        return new PrixChoisi();
    }

    /**
     * Create an instance of {@link GetAgenceIdentifiant }
     * 
     */
    public GetAgenceIdentifiant createGetAgenceIdentifiant() {
        return new GetAgenceIdentifiant();
    }

    /**
     * Create an instance of {@link GetHotelNomResponse }
     * 
     */
    public GetHotelNomResponse createGetHotelNomResponse() {
        return new GetHotelNomResponse();
    }

    /**
     * Create an instance of {@link GetAllCombinationsResponse }
     * 
     */
    public GetAllCombinationsResponse createGetAllCombinationsResponse() {
        return new GetAllCombinationsResponse();
    }

    /**
     * Create an instance of {@link GetHotelNom }
     * 
     */
    public GetHotelNom createGetHotelNom() {
        return new GetHotelNom();
    }

    /**
     * Create an instance of {@link PrixChoisiResponse }
     * 
     */
    public PrixChoisiResponse createPrixChoisiResponse() {
        return new PrixChoisiResponse();
    }

    /**
     * Create an instance of {@link GetAgenceIdentifiantResponse }
     * 
     */
    public GetAgenceIdentifiantResponse createGetAgenceIdentifiantResponse() {
        return new GetAgenceIdentifiantResponse();
    }

    /**
     * Create an instance of {@link AgenceLoginResponse }
     * 
     */
    public AgenceLoginResponse createAgenceLoginResponse() {
        return new AgenceLoginResponse();
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link Lit }
     * 
     */
    public Lit createLit() {
        return new Lit();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link HashMap }
     * 
     */
    public HashMap createHashMap() {
        return new HashMap();
    }

    /**
     * Create an instance of {@link HashMapWrapper.AllCombinations.Entry }
     * 
     */
    public HashMapWrapper.AllCombinations.Entry createHashMapWrapperAllCombinationsEntry() {
        return new HashMapWrapper.AllCombinations.Entry();
    }

    /**
     * Create an instance of {@link Agence.HotelPartenaireTarif.Entry }
     * 
     */
    public Agence.HotelPartenaireTarif.Entry createAgenceHotelPartenaireTarifEntry() {
        return new Agence.HotelPartenaireTarif.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrixChoisiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "prixChoisiResponse")
    public JAXBElement<PrixChoisiResponse> createPrixChoisiResponse(PrixChoisiResponse value) {
        return new JAXBElement<PrixChoisiResponse>(_PrixChoisiResponse_QNAME, PrixChoisiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCombinationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllCombinationsResponse")
    public JAXBElement<GetAllCombinationsResponse> createGetAllCombinationsResponse(GetAllCombinationsResponse value) {
        return new JAXBElement<GetAllCombinationsResponse>(_GetAllCombinationsResponse_QNAME, GetAllCombinationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelNom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getHotelNom")
    public JAXBElement<GetHotelNom> createGetHotelNom(GetHotelNom value) {
        return new JAXBElement<GetHotelNom>(_GetHotelNom_QNAME, GetHotelNom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHotelNomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getHotelNomResponse")
    public JAXBElement<GetHotelNomResponse> createGetHotelNomResponse(GetHotelNomResponse value) {
        return new JAXBElement<GetHotelNomResponse>(_GetHotelNomResponse_QNAME, GetHotelNomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenceIdentifiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAgenceIdentifiant")
    public JAXBElement<GetAgenceIdentifiant> createGetAgenceIdentifiant(GetAgenceIdentifiant value) {
        return new JAXBElement<GetAgenceIdentifiant>(_GetAgenceIdentifiant_QNAME, GetAgenceIdentifiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgenceLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "agenceLogin")
    public JAXBElement<AgenceLogin> createAgenceLogin(AgenceLogin value) {
        return new JAXBElement<AgenceLogin>(_AgenceLogin_QNAME, AgenceLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrixChoisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "prixChoisi")
    public JAXBElement<PrixChoisi> createPrixChoisi(PrixChoisi value) {
        return new JAXBElement<PrixChoisi>(_PrixChoisi_QNAME, PrixChoisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCombinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAllCombinations")
    public JAXBElement<GetAllCombinations> createGetAllCombinations(GetAllCombinations value) {
        return new JAXBElement<GetAllCombinations>(_GetAllCombinations_QNAME, GetAllCombinations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgenceLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "agenceLoginResponse")
    public JAXBElement<AgenceLoginResponse> createAgenceLoginResponse(AgenceLoginResponse value) {
        return new JAXBElement<AgenceLoginResponse>(_AgenceLoginResponse_QNAME, AgenceLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgenceIdentifiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAgenceIdentifiantResponse")
    public JAXBElement<GetAgenceIdentifiantResponse> createGetAgenceIdentifiantResponse(GetAgenceIdentifiantResponse value) {
        return new JAXBElement<GetAgenceIdentifiantResponse>(_GetAgenceIdentifiantResponse_QNAME, GetAgenceIdentifiantResponse.class, null, value);
    }

}
