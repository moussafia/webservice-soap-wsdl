package ma.enset.mohammedia.ws;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date dateCration;

    public Compte() {
    }

    public Compte(int code, Date dateCration, double solde) {
        this.code = code;
        this.dateCration = dateCration;
        this.solde = solde;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCration() {
        return dateCration;
    }

    public void setDateCration(Date dateCration) {
        this.dateCration = dateCration;
    }
}
