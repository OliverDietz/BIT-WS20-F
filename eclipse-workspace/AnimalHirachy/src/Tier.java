import java.util.ArrayList;

public class Tier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tier> Animal=new ArrayList<Tier>();
		Tiger Jan = new Tiger();
		Animal.add(Jan);
		Katze Milana = new Katze();
		Animal.add(Milana);
		Hund Oli = new Hund();
		Animal.add(Oli);
		
		for(Tier singleTier:Animal) {
			singleTier.bewegen();
			singleTier.geräuscheMachen();
			singleTier.essen();
			singleTier.schlafen();
			
		}
	}
	public String bild;
	public String nahrung;
	public String hunger;
	public String grenzen;
	public String ort;
	
	public void geräuscheMachen() {
		System.out.println("#Geräusch");
	}
	
	public void essen() {
		System.out.println("#Mampf");
	}
	
	public void schlafen() {
		System.out.println("#Sleep");
	}
	
	public void bewegen() {
		System.out.println("#MyMoves");
	}
	

}
