package datenstruktur;


/**
 * Mutterklasse für Kanten in Petrinetzen und Erreichbarkeitsgraphen
 */
public class Kante {
	
	//variabel für die id der Kante
	private String id;
	
	
	
	/**
	 * Konstruktor der Klasse
	 * @param id
	 * 				String für die ID der zu erstellenden Kante
	 */
	public Kante(String id) {
		this.id= id;
	}
	
	
	/**
	 * getter der Id-Variable
	 * @return
	 * 			gibt die ID als String zurück
	 */
	public String getId() {
		return id;
	}
}