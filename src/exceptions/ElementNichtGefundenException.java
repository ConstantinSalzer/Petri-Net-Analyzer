package exceptions;

/**
 * Exception, falls versucht wird etwas bei einem nicht existierenden Element einzustellen
 */
public class ElementNichtGefundenException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	/**
	 * Konstruktor der Exception, der die passende Fehlermeldung ausgibt
	 * @param id
	 * 		ID des Elements, dass die Fehlermeldung ausgelöst hat
	 */
	public ElementNichtGefundenException (String id) {
		super ("Element mit ID: " + id + " wurde nicht gefunden!");
	}

}
