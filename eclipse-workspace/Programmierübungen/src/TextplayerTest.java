
public class TextplayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bitte geben Sie den Text ein.");
		String textEingabe= StaticTastatur.eingabeString();
		
		System.out.println("Bitte geben Sie die Anzahl der Wiederholungen ein.");
		int anzahlWiederholungen=StaticTastatur.eingabeInt();
		
		String textBack;
		int anzahlBack=0;
		//create Object
		Textplayer text=new Textplayer();
		
		//set Text in new Object
		text.setText(textEingabe);
		
		//get Text from Object
		textBack=text.getText();
		
		//set Anzahl from Object
		text.setAnzahl(anzahlWiederholungen);
		
		//get Anzahl from Object
		anzahlBack=text.getAnzahl();
		
		//text ausgeben
		text.abspielen();
		
		//print results from get methods
		System.out.println("Folgender Text wurde gesetzt:" +textBack);
		System.out.println("Folgende Anzahl wurde gesetzt:" +anzahlBack);
	}

}
