package datenstruktur;


/**
 * Klasse für Transitionen
 */
public class Transition extends Knoten{
	
	//variablen für Transitionen
	
	Position position;
	boolean aktiviert;
	
	
	/**
	 * Konstruktor
	 * @param id
	 * 		ID, die für die Transition gelten soll
	 */
	public Transition (String id) {
		super(id);
	}
	
	
	/**
	 * Methode um eine Transition zu aktivieren
	 */
	public void aktiviere() {
		this.aktiviert= true;
	}
	
	
	/**
	 * Methode um eine Transition zu deaktivieren
	 */
	public void deaktiviere () {
		this.aktiviert = false;
	}
	
	
	/**
	 * gibt zurück, ob die Transition aktiviert oder deaktiviert ist
	 * @return
	 * 		gibt die boolean variable zurück
	 */
	public boolean istAktiviert() {
		return aktiviert;
	}
	
	//getter und setter
	
	void setPosition(Position position) {
		this.position = position;
	}
	
	/**
	 * getter für die Position der Transition
	 * @return
	 * 		gibt die Position zurück
	 */
	public Position getPosition () {
		return position;
	}
}
