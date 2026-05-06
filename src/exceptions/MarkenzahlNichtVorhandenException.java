package exceptions;

/**
 * Exception falls einer Stelle keine Markenzahl zugewiesen wurde
 */
public class MarkenzahlNichtVorhandenException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	/**
	 * Konstruktor der Exception, der die passende Fehlermeldung ausgibt
	 * @param id
	 * 		ID des Elements, dass die Fehlermeldung ausgelöst hat
	 */
	public MarkenzahlNichtVorhandenException (String id) {
		super ("Für die Stelle mit der ID: " + id + " wurde die Markenzahl nicht festgelegt!");
	}
}
