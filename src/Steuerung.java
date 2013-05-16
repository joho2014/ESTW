/**
 * Steuerung für den Zug
 * 
 * @author (Florian A., Tobias, Norbert, Fabio) 
 * @version (02.05.2013)
 */
public class Steuerung
{
    
    private List zuglist;

    /**
     * Constructor for objects of class Steuerung
     */
    public  Steuerung(){}


    /**
     * Jeder Zug wird auf den nächsten Gleisabschnitt bewegt, falls möglich
     *
     */
    public void blockFahren()
    {
        if (
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
}
