package datenstruktur;

/**
 * Klasse, die Positionen von Elementen in Graphen darstellt
 */
public class Position {
	
	//variablen der Klasse 
	
	int xposition;
	int yposition;
	
	/**
	 * Konstruktor der Klasse
	 * @param xposition
	 * 		x-Position die eingestellt werden soll
	 * @param yposition
	 * 		y-Position die eingestellt werden soll
	 */
	public Position (int xposition, int yposition) {
		this.xposition=xposition;
		this.yposition=yposition;
	}
	
	//getter und setter der Klasse
	
	/**
	 * getter der x-Position
	 * @return
	 * 		gibt die x-Position zurück
	 */
	public int getXposition() {
		return (xposition);
	}
	
	/**
	 * getter der y-Position
	 * @return
	 * 		gibt die y-Position zurück
	 */
	public int getYposition() {
		return (-yposition);
	}
}
