package datenstruktur;


/**
 * Klasse für Stellen
 */
public class Stelle extends Knoten{
	
	//variablen von Stellen
	
	private int markenzahl;
	private int anfangsmarkierungMarkenzahl;
	private Position position;
	
	/**
	 * Konstruktor
	 * @param id
	 * 		ID parameter, der für die neue Stelle verwendet wird
	 */
	public Stelle(String id) {
		super(id);
	}
	
	
	/**
	 * getter und setter
	 * @param markenzahl
	 * 		Die für die Stelle einzusetzende Markenzahl
	 */
	public void setMarkenzahl(int markenzahl) {
		this.markenzahl = markenzahl;
	}
	
	/**
	 * Methode, mit der in der Stelle die in der Anfangsmarkierung für diese Stelle geltende Markenzahl gespeichert wrid
	 */
	public void setzeAnfangsmarkierung() {
		this.anfangsmarkierungMarkenzahl = markenzahl;
	}
	
	/**
	 * getter für die Markenzahl
	 * @return
	 * 		gibt die Markenzahl als integer Wert zurück
	 */
	public int getMarkenzahl () {
		return markenzahl;
	}
	
	/**
	 * Methode mit der die Position der Stelle festgelegt wird
	 * @param position
	 * 		die einzusetzende Position
	 */
	public void setPosition(Position position) {
		this.position = position;
	}
	
	/**
	 * Methode die die Position zurückgibt
	 * @return
	 * 		gibt die Position zurück
	 */
	public Position getPosition () {
		return position;
	}
	
	//setzt die Markenzahl der Stelle auf die der Anfangsmarkierung zurück
	
	void zuruckzurAnfangsmarkierung() {
		this.markenzahl = anfangsmarkierungMarkenzahl;
	}
	
	/**
	 * erhöht die Markenzahl der Stelle
	 * @return
	 * 		gibt die erhöhte Markenzahl zurück
	 */
	public int erhöheMarkenzahl() {
		markenzahl++;
		return markenzahl;
	}
	
	
	/**
	 * verringert die Markenzahl der Stelle
	 * @return
	 * 		gibt die verringerte Markenzahl zurück
	 */
	public int verringereMarkenzahl() {
		markenzahl--;
		return markenzahl;
	}
}
