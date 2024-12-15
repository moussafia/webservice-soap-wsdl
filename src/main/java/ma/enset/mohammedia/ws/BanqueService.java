package ma.enset.mohammedia.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWs")
public class BanqueService {

    @WebMethod(operationName = "ConversionEuroToDh")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt*11;
    }

    @WebMethod
    public Compte Consulter(@WebParam(name = "code") int code) {
        return new Compte(code, new Date(), Math.random()*80000);
    }

    @WebMethod
    public List<Compte> ListComptes() {
        return List.of(
                new Compte(1, new Date(), 80000*Math.random() + 10000),
                new Compte(2, new Date(), 80000*Math.random() + 10000),
                new Compte(3, new Date(), 80000*Math.random() + 10000),
                new Compte(4, new Date(), 80000*Math.random() + 10000)
        );
    }
}
