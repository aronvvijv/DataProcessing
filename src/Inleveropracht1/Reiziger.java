package Inleveropracht1;

import java.sql.Date;

public class Reiziger {
    private int reizigerID;
    private String voorletters;
    private String tussenvoegsel;
    private String achterNaam;
    private Date gbdatum;

    public Reiziger(int reizigerID, String voorletters, String tussenvoegsel, String achterNaam, Date gbdatum) {
        this.reizigerID = reizigerID;
        this.voorletters = voorletters;
        this.tussenvoegsel = tussenvoegsel;
        this.achterNaam = achterNaam;
        this.gbdatum = gbdatum;
    }

    public String getNaam() {
        String naam = voorletters;
        if (tussenvoegsel != null) {
            naam += " " + tussenvoegsel;
        }
        naam += " " + achterNaam;
        return naam;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public void setAchterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }

    public void setGbdatum(Date gb){
        this.gbdatum = gb;
    }

    public Date getGbdatum() {
        return this.gbdatum;
    }


    public int getReizigerID() {
        return reizigerID;
    }

    public void setReizigerID(int reizigerID) {
        this.reizigerID = reizigerID;
    }


    public String toString() {
        return "Reiziger " + reizigerID + " met naam " + getNaam() + " is geboren op " + gbdatum;
    }
}
