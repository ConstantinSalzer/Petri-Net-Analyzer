package datenstruktur;


/**
 * Klasse mit methoden, die in mehreren Klassen benötigt werden
 */
public class Werkzeuge {
	
	/**
	 * Methode, die eine Markierungs-Bezeichnung als reines integer array zurückgibt
	 * @param markierung
	 * 		String markierung, die in ein integer array umgewandelt werden soll
	 * @return
	 * 		gibt das fertige int array zurück
	 */
	public static int [] getMarkierungAsInt(String markierung) {
		
		//alle aufgehenden Klammern werden gelöscht
		markierung = markierung.replaceAll("\\(","");
		
		//alle Trennungsstriche werden gelöscht
		markierung = markierung.replaceAll("\\|", "");
		
		//alle schließenden Klammern werden gelöscht
		markierung = markierung.replaceAll("\\)","");
		
		//der restliche String wird verarbeitet und als integer array zurückgegeben
		String[] markierungarray = markierung.split("");
		int [] intarray = new int[markierungarray.length];
		for (int i = 0; i<markierungarray.length; i++) {
			intarray[i] = Integer.parseInt(markierungarray[i]);
		}
		return intarray;
	}
	
	/**
	 * Methode die Exceptions in fertige Fehlermeldungen umwandelt
	 * @param e
	 * 		die Exception die bearbeitet werden soll
	 * @return
	 * 		gibt die fertige String Fehlermeldung zurück
	 */
	public static String Fehlermeldung (Exception e) {
		return new String ("[Fehler] " + e.getClass().getSimpleName() + " : " + e.getMessage());
	}
}
