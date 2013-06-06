
/**
 * Ein Zug des Bahnhofs
 * 
 * @author Florian,Fabio,Tobi,Norbert 
 * @version 02.05.2013
 */
public class Zug
{
    private int start,ziel;
    private String name;
    private List weg;
    private Datenmodell datenmodell;
    private Gleisstueck position;
    
    /**
     * Erstellt einen Zug
     */
    public Zug(int s, int z, String n,Datenmodell d)
    {
        start = s;
        ziel = z;
        name = n;
        weg = null;
        datenmodell = d;
        position= (Gleisstueck)weg.head();
    }
    
    // -------------------------------------------Get-Methoden---------------------------------------------

    /**
     * getPosition: gibt Position zurück
     * 
     * @return     position
     */
    public Gleisstueck getPosition()
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
     * fahrEinsWeiter: ändert Position auf nächstes Gleisstueck in der Wegliste
     * 
     */
    public void fahrEinsWeiter()
    {
        weg = weg.tail();
        position = (Gleisstueck)weg.head();
    }
    
    /**
     * wegErstellen: setzt Weg, indem durch die Variablen mit bekannten Strecken abgeglichen wird
     *               und  eine passende zurückgegeben wird
     * @param st     zum abgleichen
     *        zi      zum abgleichen
     *        
     * @return      Weg
     */
    /*
    public List wegErstellen(int st, int zi)
    //Bahnhof -> int:
    //Lindau : 1
    //Zerbst: 2
    //Barby : 3
    //Prödel : 4
    {
        // DAS DARF NICHT ADD() SONDERN APPEND() HEIßEN !!    (wird in kürze geändert)
        
        //Lindau - Zerbst:
        List listLZ = new List(datenmodell.getWeiche(17));
        Node node = list.getHead();
        listLZ.add(getWeiche(18)); listLZ.add(getWeiche(29)); listLZ.add(getWeiche(19)); listLZ.add(getWeiche(20)); listLZ.add(getWeiche(24)); listLZ.add(getWeiche(25)); listLZ.add(getWeiche(26)); listLZ.add(getWeiche(7)); listLZ.add(getWeiche(6)); listLZ.add(getWeiche(27)); listLZ.add(getWeiche(5));
        
        //Lindau - Barby:
        List listLB = new List(datenmodell.getWeiche(17));
        Node node = list.getHead();
        listLB.add(getWeiche(18)); listLB.add(getWeiche(29)); listLB.add(getWeiche(19)); listLB.add(getWeiche(20)); listLB.add(getWeiche(21)); listLB.add(getWeiche(22)); listLB.add(getWeiche(4)); listLB.add(getWeiche(28)); listLB.add(getWeiche(2));
        
        //Lindau - Prödel:
        List listLP = new List(datenmodell.getWeiche(17));
        Node node = list.getHead();
        listLP.add(getWeiche(18)); listLP.add(getWeiche(29)); listLP.add(getWeiche(23)); listLP.add(getWeiche(24)); listLP.add(getWeiche(25)); listLP.add(getWeiche(26)); listLP.add(getWeiche(12)); 
        
        //Zerbst - Barby:
        List listZB = new List(datenmodell.getWeiche(9));
        Node node = list.getHead();
        listZB.add(getWeiche(27)); listZB.add(getWeiche(1)); listZB.add(getWeiche(2));
        
        //Zerbst - Prödel:
        List listZP = new List(datenmodell.getWeiche(9));
        Node node = list.getHead();
        listZP.add(getWeiche(10)); listZP.add(getWeiche(11)); listZP.add(getWeiche(26)); listZP.add(getWeiche(12));
        
        //Prödel - Barby:
        List listPB = new List(datenmodell.getWeiche(8));
        Node node = list.getHead();
        listPB.add(getWeiche(7)); listPB.add(getWeiche(6)); listPB.add(getWeiche(27)); listPB.add(getWeiche(1)); listPB.add(getWeiche(2));
       
        
        return null;
    }
    */
    
}
