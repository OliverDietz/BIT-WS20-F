public class Test {
    public static void main(String[] args) {
        //produktTest();
        Sortiment meinSortiment = new Sortiment();
        meinSortiment.anlegenProdukt(0,"Apfel",2.99);
        meinSortiment.anlegenProdukt(1,"Mango",4.99);
        meinSortiment.anzeigenProdukte();

    }
    /* public static void produktTest() {
        int produktNummber = 1;
        Produkt apfel = new Produkt();
        Produkt mango = new Produkt();

        System.out.println("Produkte werden angelegt...");
        apfel.setProduktNummer(produktNummber++);
        apfel.setProduktName("Apfel");
        apfel.setProduktPreis(2.99);
        mango.setProduktNummer(produktNummber++);
        mango.setProduktName("Mango");
        mango.setProduktPreis(4.99);

        System.out.println("Produkte werden nun ausgegeben..");
        System.out.println(apfel.toString());
        System.out.println(mango.toString());
    }*/
}