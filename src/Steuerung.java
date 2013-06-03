/**
 * Steuerung für den Zug
 * 
 * @author (Florian A., Tobias, Norbert, Fabio) 
 * @version (02.05.2013)
 */
public class Steuerung
{
	
	private List zuglist;
	private DieGrafik anzeige;
	private Datenmodell datenmodell;

	/**
	 * Constructor for objects of class Steuerung
	 */
	public Steuerung()
	{
		datenmodell = new Datenmodell();
		anzeige = new DieGrafik(datenmodell,this);
	}


	/**
	 * Jeder Zug wird auf den nächsten Gleisabschnitt bewegt, falls möglich
	 *
	 */
	public void blockFahren()
	{
		
	}
	
	/**
	 * Erstellt einen Zug
	 * 
	 * @param   start       Legt den Startbahnhof fest
	 *          ziel        Legt den Zielbahnhof fest
	 *          name        Legt den Namen des Zuges fest
	 * @return     Einen Zug
	 */
	public Zug zugErstellen(int start, int ziel, String name)
	{
		return new Zug(start,ziel,name);
	}
	
	/**
	 * Züge fahren komplette Strecke
	 */
	public void fahren()
	{
		
	}
}
