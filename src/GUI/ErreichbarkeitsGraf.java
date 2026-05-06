package GUI;


import org.graphstream.graph.Edge;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.spriteManager.Sprite;
import org.graphstream.ui.spriteManager.SpriteManager;

import datenstruktur.EGKante;
import datenstruktur.EGKnoten;
import datenstruktur.pEG;


/**
 * Klasse für die Graphische Darstellung von Erreichbarkeitsgrafen
 */
public class ErreichbarkeitsGraf extends MultiGraph{
	
	//variablen die für die Graphische Darstellung relevant sind 
	
	private static String CSS_FILE = "url(" + PetriGraf.class.getResource("/graph.css") + ")";
	private pEG peg;
	private SpriteManager spriteMan;
	
	
	/**
	 * Konstruktor der grafischen Darstellung von Erreichbarkeitsgrafen
	 * @param peg
	 * 		Datenstruktur des partiellen Erreichbarkeitsgrafen, auf der die grafische Darstellung beruht
	 */
	public ErreichbarkeitsGraf(pEG peg) {
		super("pEG");
		spriteMan = new SpriteManager(this);
		this.peg = peg;
		this.setAttribute("ui.stylesheet", CSS_FILE);
	}
	
	//initialisierung des Erreichbarkeitsgraphen indem der Anfangsknoten hinzugefügt wird
	
	void initilisiere() {
		Node node = this.addNode(peg.getAnfangsKnoten().getId());
		node.setAttribute("ui.class", "markierterAnfangsKnotenEG");
		node.setAttribute("ui.label", peg.getAnfangsKnoten().getName());
	}
	
	//Methode, die dem Grafen neue Knoten und Kanten hinzufügt und unterschiedliche grafische hervorhebungen ermöglicht
	
	void updateGraf(String transition, String aktuelleMarkierung, boolean knotenKantenMarkierung, boolean unbeschraenktheitMarkierung) {
		
		//Datenstruktur wird nach nicht hinzugefügten Knoten durchsucht, diese werden hinzugefügt
		
		for (EGKnoten knoten: peg.getEGKnoten().values()) {
			if (this.getNode(knoten.getId())== null) {
				Node node = this.addNode(knoten.getId());
				node.setAttribute("ui.label", knoten.getName());
			}
		}
		
		//Datenstruktur wird nach nicht hinzugefügten Kanten durchsucht, diese werden hinzugefügt
		
		for (EGKante kante: peg.getEGKanten().values()) {
			if (this.getEdge(kante.getId())== null) {
				Edge edge = this.addEdge(kante.getId(), this.getNode(kante.getQuellID()),this.getNode(kante.getZielID()), true);
				Sprite sprite = spriteMan.addSprite(kante.getId());
				sprite.attachToEdge(edge.getId());
				sprite.setPosition(0.5);
				sprite.setAttribute("ui.class", "edgeLabel");
				sprite.setAttribute("ui.label", kante.getKantenBeschriftung());
			}
		}
		
		//falls nur die aktuelle Markierung und die zuletzt geschaltene Transition hervorgehoben werden soll, passiert das hier
		
		if (knotenKantenMarkierung) {
			
			//Knoten wird markiert
			this.markiereKnoten(aktuelleMarkierung);
			
			//passende Kante zu geschaltener Transition wird gesucht und markiert
			this.edges().forEach(edge -> {
				if (edge.getId().contains(transition) && edge.getId().endsWith(aktuelleMarkierung)) {
					this.getEdge(edge.getId()).setAttribute("ui.class", "fett");
				}
			});
		}
		
		//wenn die Knoten m, m' und der Pfad vom Anfangsknoten über m nach m' markiert werden soll, passiert das hier
		
		if (unbeschraenktheitMarkierung) {
			
			//alle knoten werden durchlaufen
			this.nodes().forEach(node -> {
				
				//der Anfangsknoten wird markiert, falls er m ist, sonst nimmt er seine "normale" Grafik an
				if(node.getId().equals(peg.getAnfangsKnoten().getId())) {
					if (node.getId().equals(peg.getm().getId()) || node.getId().equals(peg.getmm().getId())) {
						node.setAttribute("ui.class","markierterAnfangsKnotenEG");
					} else {
						node.setAttribute("ui.class", "anfangsKnotenEG");
					}
				} else {
					
					//normale Knoten werden darauf kontrolliert, ob sie m oder m' sind, dementsprechend wird die grafische Darstellung verändert 
					if (node.getId().equals(peg.getm().getId()) || node.getId().equals(peg.getmm().getId())) {
						node.setAttribute("ui.class", "markierterKnotenEG");
					} else {
						node.setAttribute("ui.class", "node");
					}
				}
			});
			
			//Die Kanten werden darauf kontrolliert, ob sie am Pfad vom Anfangsknoten über m nach m' liegen und dementsprechend grafisch verändert
			this.edges().forEach(edge -> {
				if (peg.getPfad().contains(edge.getId())) {
					this.getEdge(edge.getId()).setAttribute("ui.class", "fett");
				}
			});
		}
	}
	
	//Methode mit der nur ein einzelner Knoten hervorgehoben wird
	
	void markiereKnoten(String id) {
		this.nodes().forEach(node -> {
			//alle knoten werden zuerst darauf kontrolliert, ob sie der anfangsknoten sind, da dieser so oder so eine spezielle grafische darstellung benötigt
			if(node.getId().equals(peg.getAnfangsKnoten().getId())) {
				node.setAttribute("ui.class", "anfangsKnotenEG");
			} else {
				node.setAttribute("ui.class", "node");
			}
			
			//nach der ersten kontrolle werden nun sämtliche anderen knoten grafisch verändert
			if(id.equals(peg.getAnfangsKnoten().getId())) {
				this.getNode(id).setAttribute("ui.class", "markierterAnfangsKnotenEG");
			} else {
				this.getNode(id).setAttribute("ui.class", "markierterKnotenEG");
			}
		});
		
		//da nur der knoten markiert sein soll, werden hier alle kanten auf die klassische darstellung zurückgesetzt
		this.edges().forEach(edge -> {
			this.getEdge(edge.getId()).setAttribute("ui.class", "edge");
		}); 
	}
}
