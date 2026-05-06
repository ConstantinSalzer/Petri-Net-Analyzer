package datenstruktur;

/**
 * Diese Klasse implementiert Kanten in Erreichbarkeitsgraphen und erbt dafür von der Klasse Kante
 */
public class EGKante extends Kante{
	
	//Knoten der die Quelle der Kante darstellt
	private EGKnoten quelle;
	
	//Knoten der das Ziel der Quelle darstellt
	private EGKnoten ziel;
	
	//die Transition, die man schalten muss um von der Quelle zum Ziel zu kommmen
	private Transition transition;
	
	//Konstruktor mit der Objekte der Klasse erzeugt werden
	
	EGKante(Transition transition, EGKnoten quelle, EGKnoten ziel) {
		super (transition.getId() + quelle.getId() + ziel.getId());
		this.transition = transition;
		this.quelle=quelle;
		this.ziel=ziel;
	}
	
	/**
	 * getter für die Id des Quell-Knotens
	 * @return
	 * 			gibt die ID als String zurück
	 */
	public String getQuellID() {
		return quelle.getId();
	}
	
	
	/**
	 * getter für die Id des Ziel-Knotens
	 * @return
	 * 			gibt die ID als String zurück
	 */
	public String getZielID() {
		return ziel.getId();
	}
	
	//getter für die Transition
	
	Transition getTransition() {
		return transition;
	}
	
	
	/**
	 * methode, mit der der Name für die graphische Darstellung anhand der Variablen ausgegeben wird
	 * @return
	 * 			gibt den erstellten Namen zurück
	 */
	public String getKantenBeschriftung() {
		return "[" + transition.getId() + "] " + transition.getName();
	}
}