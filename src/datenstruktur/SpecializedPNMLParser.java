package datenstruktur;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import exceptions.*;

import propra.pnml.PNMLWopedParser;


/**
 * Parserklasse für pnml-Dateien
 */
public class SpecializedPNMLParser extends PNMLWopedParser{
	
	private Petrinetz petrinetz;
	private List<String[]> kantenListe;
	
	
	
	/**
	 * Konstruktor des Parsers
	 * @param pnml
	 * 		Eingelesen Datei
	 */
	public SpecializedPNMLParser(final File pnml) {
		super(pnml);
		this.petrinetz = new Petrinetz();
		kantenListe = new ArrayList<>();
	}
	
	
	/**
	 * Methode, mit der man das fertige Petrinetz bekommt
	 * @return
	 * 		gibt das fertige Petrinetz zurück
	 */
	public Petrinetz getfertigesPetrinetz () {
		machKantenFertig();
		petrinetz.setzeAnfangsmarkierung();
		petrinetz.überprüfeAktivierbarkeit();
		petrinetz.setzeErstenEGKnoten();
		return petrinetz;
	}
	
	//Methode, mit der die Kanten in das Petrinetz hinzufügt
	
	private void machKantenFertig() {
		for (String[] kantenDaten: kantenListe) {
			if (petrinetz.Stellen.containsKey(kantenDaten[1]) && petrinetz.Transitionen.containsKey(kantenDaten[2]) && !petrinetz.Kanten.containsKey(kantenDaten[0])) {
				PetrinetzKante kante = new PetrinetzKante(kantenDaten[0], petrinetz.Stellen.get(kantenDaten[1]), petrinetz.Transitionen.get(kantenDaten[2]), true);
				petrinetz.addKanten(kante);
			} else if (petrinetz.Transitionen.containsKey(kantenDaten[1]) && petrinetz.Stellen.containsKey(kantenDaten[2]) && !petrinetz.Kanten.containsKey(kantenDaten[0])){
				PetrinetzKante kante = new PetrinetzKante (kantenDaten[0], petrinetz.Stellen.get(kantenDaten[2]), petrinetz.Transitionen.get(kantenDaten[1]), false);
				petrinetz.addKanten(kante);
			} else {
				throw new UngültigeKanteException(kantenDaten[0]);
			}
		}
	}
	
	//Überschriebene Methoden der Überklasse
	
	@Override
	public void newTransition(final String id) {
		if (!petrinetz.Transitionen.containsKey(id)) {
			petrinetz.addTransition(new Transition(id));
		} else {
			throw new DoppelteTransitionException(id);
		}
	}
	
	@Override
	public void newPlace (final String id) {
		if (!petrinetz.Stellen.containsKey(id)) {
			petrinetz.addStelle(new Stelle(id));
		} else {
			throw new DoppelteStelleException(id);
		}
	}
	
	@Override
	public void newArc (final String id, final String source, final String target) {
		String[] Liste = new String[3];
		Liste[0] = id;
		Liste[1] = source;
		Liste[2] = target;
		kantenListe.add(Liste);
	}
	
	@Override
	public void setPosition (final String id, final String x, final String y) {
		if (!petrinetz.Transitionen.containsKey(id) && !petrinetz.Stellen.containsKey(id)) {
			throw new ElementNichtGefundenException(id);
		}
		
		if (x == null || y == null) {
			throw new FehlerhaftePositionException(id);
		}
		Position positoin = new Position (Integer.parseInt(x), Integer.parseInt(y));
		if (petrinetz.Stellen.containsKey(id)) {
			petrinetz.Stellen.get(id).setPosition(positoin);
		} else {
			petrinetz.Transitionen.get(id).setPosition(positoin);
		}
	}
	
	@Override
	public void setName(final String id, final String name) {
		if (petrinetz.Stellen.containsKey(id)) {
			petrinetz.Stellen.get(id).setName(name);
		} else  if (petrinetz.Transitionen.containsKey(id)){
			petrinetz.Transitionen.get(id).setName(name);
		} else {
			throw new ElementNichtGefundenException(id);
		}
	}
	
	@Override
	public void setTokens(final String id, final String tokens) {
		if (!petrinetz.Stellen.containsKey(id)) {
			throw new ElementNichtGefundenException(id);
		}
		if (Integer.parseInt(tokens)>0) {
			petrinetz.Stellen.get(id).setMarkenzahl(Integer.parseInt(tokens));
		} else {
			throw new NegativeMarkenZahlException(id);
		}
	}
}
