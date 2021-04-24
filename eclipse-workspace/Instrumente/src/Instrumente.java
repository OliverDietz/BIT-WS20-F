
public class Instrumente {

  private String Name;
  private String Ton;
  
//method to set var text
  public void setTon(String Ton) {
	Ton=Ton;  
}
  
  
  public String abspielen() {
	  return Ton;
}

  //method to set var Wiederholungen
  public void setAnzahl(int Wiederholungen) {
	  anzahl=Wiederholungen;
	    
}
  
//method to get var anzahlWiederholungen
  public int getAnzahl() {
	  return anzahl;
}
  
  
  public void abspielen() {
	  for(int i=1; i<=anzahl; i++) {
		  System.out.println(i+" "+text);
	  }
	  
}
}
}
