
public class Textplayer {
  private String text;
  private int anzahl;
  
//method to set var text
  public void setText(String Text) {
	text=Text;  
}
  
  
  public String getText() {
	  return text;
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