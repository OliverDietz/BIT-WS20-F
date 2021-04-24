import java.util.*;

public class Produkt {
    private int produktNummer;
    private String produktName;
    private double produktPreis;

    public int getProduktNummer() {
        return produktNummer;
    }

    public void setProduktNummer(int produktNummer) {
        this.produktNummer = produktNummer;
    }

    public double getProduktPreis() {
        return produktPreis;
    }

    public void setProduktPreis(double produktPreis) {
        this.produktPreis = produktPreis;
    }

    public String getProduktName() {
        return produktName;
    }

    public void setProduktName(String produktName) {
        this.produktName = produktName;
    }
    
    public void produktErfassen() {
    	Scanner eingabe=new Scanner(System.in);
    	System.out.println("Eingabe Produktnummer...");
    	produktNummer=eingabe.nextInt();
    	System.out.println("Eingabe Produktname...");
    	produktName=eingabe.nextLine();
    	System.out.println("Eingabe Produktpreis...");
    	produktPreis=eingabe.nextDouble();
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "produktNummer=" + produktNummer +
                ", produktName='" + produktName + '\'' +
                ", produktPreis=" + produktPreis +
                '}';
    }
}