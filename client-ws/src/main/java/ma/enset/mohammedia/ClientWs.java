package ma.enset.mohammedia;

import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

import java.util.List;

public class ClientWs {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWs().getBanqueServicePort();
        System.out.println("********************** Conversion DH to EURO to DH **************************");
        System.out.println(proxy.conversionEuroToDh(10));


        Compte cp = proxy.consulter(4);
        System.out.println("********************** Consulter le compte Numero 4 **************************");
        System.out.println(cp.getCode());
        System.out.println(cp.getDateCration());
        System.out.println(cp.getSolde());
        System.out.println("********************** Consulter llist des comptes **************************");
        List<Compte> compteList = proxy.listComptes();
        compteList.forEach(c -> {
            System.out.println(c.getCode());
            System.out.println(c.getDateCration());
            System.out.println(c.getSolde());
        });}
}
