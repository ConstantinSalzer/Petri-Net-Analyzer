package exceptions;

/**
 * Fehlermeldung falls einem Element keine Position zugewiesen wurde
 */
public class PositionNichtVorhandenException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	/**
	 * Konstruktor der Exception, der die passende Fehlermeldung ausgibt
	 * @param id
	 * 		ID des Elements, dass die Fehlermeldung ausgelöst hat
	 */
	public PositionNichtVorhandenException (String id) {
		super("Für das Element mit der ID: " + id + " wurde keine Position festgelegt!");
	}

}
