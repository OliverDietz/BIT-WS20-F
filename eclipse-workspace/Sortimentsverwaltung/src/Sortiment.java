import java.util.*;

public class Sortiment {

    private static ArrayList<Produkt> meinSortiment=new ArrayList<Produkt>();
    
    public void anlegenProdukt(int a, String name, double preis) {
    	Produkt produkt = new Produkt();
    	produkt.setProduktName(name);
    	produkt.setProduktNummer(a);
    	produkt.setProduktPreis(preis);
    	meinSortiment.add(produkt);

    }

    public static void anzeigenProdukte() {
        for (Produkt currentProduct:meinSortiment) {
            if (meinSortiment.size() != 0) {
                System.out.println(currentProduct.toString());
            }
        }
    }
}