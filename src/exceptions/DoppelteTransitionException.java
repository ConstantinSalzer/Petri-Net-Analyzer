package exceptions;

//
/**
 * Exception falls Transition mit der selben ID bereits existiert
 */
public class DoppelteTransitionException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	/**
	 * Konstruktor der Exception, der die passende Fehlermeldung ausgibt
	 * @param id
	 * 		ID des Elements, dass die Fehlermeldung ausgelöst hat
	 */
	public DoppelteTransitionException(String id) {
		super ("Transition mit ID: " + id + " existiert bereits!");
	}

}
