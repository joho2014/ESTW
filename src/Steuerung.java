/**
 * Steuerung f�r den Zug
 * 
 * @author (Florian A., Tobias, Norbert, Fabio) 
 * @version (02.05.2013)
 */
public class Steuerung
{
    
    private List zuglist;
    private DieGrafik anzeige;          //by Phillip f�r Testzwecke
    private Datenmodell datenmodell;    //by Phillip f�r Testzwecke

    /**
     * Constructor for objects of class Steuerung
     */
    public  Steuerung()
    {
        datenmodell = new Datenmodell();                //by Phillip f�r Testzwecke
        anzeige = new DieGrafik(datenmodell,this);      //by Phillip f�r Testzwecke
    }


    /**
     * Jeder Zug wird auf den n�chsten Gleisabschnitt bewegt, falls m�glich
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
     * Z�ge fahren komplette Strecke
     */
    public void fahren() // Wird ganz am Ende falls m�glich gemacht
    {
        
    }
    
    public static void main(String[] s)     //by Phillip f�r Testzwecke
    {
        Steuerung st = new Steuerung();
    }
}
