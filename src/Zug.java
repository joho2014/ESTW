
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
    private List weg;
    
    /**
     * Erstellt einen Zug
     */
    public Zug(int s, int z, String n)
    {
        position = s;
        start = s;
        ziel = z;
        name = n;
        weg = null;
    }
    
    // -------------------------------------------Get-Methoden---------------------------------------------

    /**
     * getPosition: gibt Position zur�ck
     * 
     * @return     position
     */
    public int getPosition()
    {
        return position;
    }
    
    /**
     * getZiel: gibt Ziel zur�ck
     * 
     * @return     ziel 
     */
    public int getZiel()
    {
        return ziel;
    }
    
    /**
     * getStart: gibt Start zur�ck
     * 
     * @return     start
     */
    public int getStart()
    {
        return start;
    }
    
    /**
     * getName: gibt Name zur�ck
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
     *               und  eine passende zur�ckgegeben wird
     * @param st     zum abgleichen
     *        zi      zum abgleichen
     *        
     * @return      Weg
     */
    public List wegErstellen(int st, int zi)
    //Bahnhof -> int:
    //Lindau : 1
    // Zerbst: 2
    //Barby : 3
    //Pr�del : 4
    {
        return null; //damits compiled
    }
    
}
