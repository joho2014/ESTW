
/**
 * Ein Zug des Bahnhofs
 * 
 * @author Florian,Fabio,Tobi,Norbert 
 * @version 02.05.2013
 */
public class Zug
{
    private int position,start,ziel;
    private String name;
    private int Weg;
    
    /**
     * Erstellt einen Zug
     */
    public Zug(int s, int z, String n)
    {
        position = s;
        start = s;
        ziel = z;
        name = n;
        Weg = 3;
    }
    
    // -------------------------------------------Get-Methoden---------------------------------------------

    /**
     * getPosition: gibt Position zurück
     * 
     * @return     position
     */
    public int getPosition()
    {
        return position;
    }
    
    /**
     * getZiel: gibt Ziel zurück
     * 
     * @return     ziel 
     */
    public int getZiel()
    {
        return ziel;
    }
    
    /**
     * getStart: gibt Start zurück
     * 
     * @return     start
     */
    public int getStart()
    {
        return start;
    }
    
    /**
     * getName: gibt Name zurück
     * 
     * @return     name
     */
    public String getName()
    {
        return name;
    }
    
    //-------------------------------------------Set-Methoden---------------------------------------------
    
    /**
     * setPosition: setzt Postion auf einen Parameter pneu
     * 
     * @param  pneu  neue Postion
     */
    public void setPosition(int pneu)
    {
        position = pneu;
    }
    
    /**
     * wegErstellen: setzt Weg, indem durch die Variablen mit bekannten Strecken abgeglichen wird
     *               und  eine passende zurückgegeben wird
     * @param st     zum abgleichen
     *        zi      zum abgleichen
     *        
     * @return      Weg
     */
    public String wegErstellen(int st, int zi)
    {
        return null; //dummy
    }
    
}
