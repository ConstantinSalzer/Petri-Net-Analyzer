package datenstruktur;

/**
 * Klasse die Kanten in Petrinetzen darstellt und dafür von normalen Kanten-Objekten erbt
 */
public class PetrinetzKante extends Kante{
	
	//variablen der Klasse
	
	private Stelle stelle;
	private Transition transition;
	private boolean stelleIstQuelle;
	private boolean transitionIstQuelle;
	
	
	/**
	 * Konstruktor der Klasse
	 * 
	 * @param id
	 * 			ID, die der Kante zugewiesen werden soll
	 * @param stelle
	 * 			Stelle, von der die Kante ausgeht oder zu der sie führt
	 * @param transition
	 * 			Transition, von der die Kante ausgeht oder zu der sie führt
	 * @param stelleIstQuelle
	 * 			boolean Wert der Angibt ob die Stelle oder die Transition die Quelle der Kante ist		
	 */
	public PetrinetzKante (String id, Stelle stelle, Transition transition, boolean stelleIstQuelle) {
		super(id);
		this.stelle = stelle;
		this.transition = transition;
		this.stelleIstQuelle= stelleIstQuelle;
		this.transitionIstQuelle = !stelleIstQuelle;
	}
	
	/**
	 * getter der Klasse
	 * @return
	 * 		gibt die Stelle zurück
	 */
	public Stelle getStelle() {
		return stelle;
	}
	
	/**
	 * getter für Transition
	 * @return
	 * 		gibt die Transition zurück
	 */
	public Transition getTransition() {
		return transition;
	}
	
	/**
	 * gibt an ob die Stelle die Quelle ist
	 * @return
	 * 		gibt den boolean Wert zurück
	 */
	public boolean stelleIstQuelle() {
		return stelleIstQuelle;
	}
	
	/**
	 * gibt an ob die Transition die Quelle ist
	 * @return
	 * 		gibt den boolean Wert zurück
	 */
	public boolean transitionIstQuelle() {
		return transitionIstQuelle;
	}
}
