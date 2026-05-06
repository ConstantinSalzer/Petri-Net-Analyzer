package datenstruktur;


/**
 * Mutterklasse für alle Knoten in Petrinetzen und Erreichbarkeitsgraphen
 */
/**
 * 
 */
public class Knoten {
	
	//variable des Namens des Knotens
	private String name;
	
	//variable der id des Knotens
	private String id;
	
	
	/**
	 * Konstruktor der Klasse 
	 * @param id
	 * 			String Parameter für die ID des zu erstellenden Knoten
	 */
	public Knoten (String id) {
		this.id = id;
	}

	
	/**
	 * getter für die Id-Variable
	 * @return
	 * 			gibt die ID als String zurück
	 */
	public String getId() {
		return id;
	}
	
	//setter für den Namen von Objekten
	
	void setName(String name) {
		this.name= name;
	}

	/**
	 * getter für den Namen von Objekten
	 * @return
	 * 			gibt den Namen als String zurück
	 */
	public String getName() {
		return name;
	}
}
