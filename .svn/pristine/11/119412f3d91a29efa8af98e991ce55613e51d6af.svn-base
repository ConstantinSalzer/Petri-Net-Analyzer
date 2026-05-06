package GUI;

import org.graphstream.ui.view.ViewerListener;


/**
 * Listener, der auf Klicks in Graphen reagiert
 */
public class ClickListener implements ViewerListener{
	
	//referenz auf den Grafen, dessen Klicks bearbeitet werden sollen
	
	private Rahmen rahmen;
	
	
	/**
	 * Konstruktor der Klasse
	 * @param rahmen
	 * 		Rahmen auf dessen Klicks die Klasse reagieren soll
	 */
	public ClickListener(Rahmen rahmen) {
		this.rahmen = rahmen;
	}
	
	//Methode, die Informationen an den Grafen weiterleitet
	
	@Override
	public void buttonPushed(String id) {
		System.out.println("ClickListener - buttonPushed: ");
		rahmen.KnotenGedruckt(id);
	}

	//restliche, nicht veränderte und verwendete Methoden
	
	@Override
	public void viewClosed(String viewName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buttonReleased(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseOver(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseLeft(String id) {
		// TODO Auto-generated method stub
		
	}

}
