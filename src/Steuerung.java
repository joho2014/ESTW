/**
 * Steuerung für den Zug
 * 
 * @author (Florian A., Tobias, Norbert, Fabio) 
 * @version (02.05.2013)
 */
public class Steuerung
{
    
    private List zuglist;
    private DieGrafik anzeige;          //by Phillip für Testzwecke
    private Datenmodell datenmodell;    //by Phillip für Testzwecke

    /**
     * Constructor for objects of class Steuerung
     */
    public  Steuerung()
    {
        datenmodell = new Datenmodell();                //by Phillip für Testzwecke
        anzeige = new DieGrafik(datenmodell,this);      //by Phillip für Testzwecke
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
    public void fahren() // Wird ganz am Ende falls möglich gemacht
    {
        
    }
    
    public static void main(String[] s)     //by Phillip für Testzwecke
    {
        Steuerung st = new Steuerung();
    }
}
