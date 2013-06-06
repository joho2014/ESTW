
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
    /*
    public List wegErstellen(int st, int zi)
    //Bahnhof -> int:
    //Lindau : 1
    //Zerbst: 2
    //Barby : 3
    //Prödel : 4
    {
        
        
        //Lindau - Zerbst:
        List listLZ = new List();
        listLZ.append(null); listLZ.append(getGleisstueck(17)); listLZ.append(getGleisstueck(18)); listLZ.append(getGleisstueck(29)); listLZ.append(getGleisstueck(19)); listLZ.append(getGleisstueck(20)); listLZ.append(getGleisstueck(24)); listLZ.append(getGleisstueck(25)); listLZ.append(getGleisstueck(26)); listLZ.append(getGleisstueck(7)); listLZ.append(getGleisstueck(6)); listLZ.append(getGleisstueck(27)); listLZ.append(getGleisstueck(5));
        
        //Lindau - Barby:
        List listLB = new List(null);
        listLZ.append(null); listLB.append(getGleisstueck(17)); listLB.append(getGleisstueck(18)); listLB.append(getGleisstueck(29)); listLB.append(getGleisstueck(19)); listLB.append(getGleisstueck(20)); listLB.append(getGleisstueck(21)); listLB.append(getGleisstueck(22)); listLB.append(getGleisstueck(4)); listLB.append(getGleisstueck(28)); listLB.append(getGleisstueck(2));
        
        //Lindau - Prödel:
        List listLP = new List();
        listLZ.append(null); listLB.append(getGleisstueck(17)); listLP.append(getGleisstueck(18)); listLP.append(getGleisstueck(29)); listLP.append(getGleisstueck(23)); listLP.append(getGleisstueck(24)); listLP.append(getGleisstueck(25)); listLP.append(getGleisstueck(26)); listLP.append(getGleisstueck(12)); 
        
        //Zerbst - Barby:
        List listZB = new List();
        listLZ.append(null); listLB.append(getGleisstueck(9)); listZB.append(getGleisstueck(27)); listZB.append(getGleisstueck(1)); listZB.append(getGleisstueck(2));
        
        //Zerbst - Prödel:
        List listZP = new List(datenmodell.getGleisstueck(9));
        listLZ.append(null); listZP.append(getGleisstueck(10)); listZP.append(getGleisstueck(11)); listZP.append(getGleisstueck(26)); listZP.append(getGleisstueck(12));
        
        //Prödel - Barby:
        List listPB = new List(datenmodell.getGleisstueck(8));
        listPB.append(getGleisstueck(7)); listPB.append(getGleisstueck(6)); listPB.append(getGleisstueck(27)); listPB.append(getGleisstueck(1)); listPB.append(getGleisstueck(2));
     
	//Zerbst - Lindau:
	List listZL = new List(datenmodell.getGleisstueck(9));
	listLZ.append(null); listZL.append(getGleisstueck(27)); listZL.append(getGleisstueck(1)); listZL.append(getGleisstueck(28)); listZL.append(getGleisstueck(3)); listZL.append(getGleisstueck(16)); listZL.append(getGleisstueck(15)); listZL.append(getGleisstueck(14)); listZL.append(getGleisstueck(13)); 

	//Barby - Lindau:
	List listBL = new List(datenmodell.getGleisstueck(2));
	listLZ.append(null); listBL.append(getGleisstueck(3)); listZL.append(getGleisstueck(16)); listZL.append(getGleisstueck(15)); listZL.append(getGleisstueck(14)); listZL.append(getGleisstueck(13)); 

	//Prödel - Lindau:
	List listPL = new List(datenmodell.getGleisstueck(8));
	listLZ.append(null); listPL.append(getGleisstueck(7)); listZL.append(getGleisstueck(6)); listZL.append(getGleisstueck(1)); listZL.append(getGleisstueck(28)); listZL.append(getGleisstueck(3)); listZL.append(getGleisstueck(16)); listZL.append(getGleisstueck(15)); listZL.append(getGleisstueck(14)); listZL.append(getGleisstueck(13)); 

	//Barby - Zerbst:
	List listBZ = new List(datenmodell.getGleisstueck(2));
	listLZ.append(null); listBZ.append(getGleisstueck(28)); listZL.append(getGleisstueck(3)); listZL.append(getGleisstueck(22)); listZL.append(getGleisstueck(25)); listZL.append(getGleisstueck(26)); listZL.append(getGleisstueck(7)); listZL.append(getGleisstueck(6)); listZL.append(getGleisstueck(27)); listZL.append(getGleisstueck(5)); 

	//Prödel - Zerbst:
	List listZP = new List(datenmodell.getGleisstueck(8));
	listLZ.append(null); listBZ.append(getGleisstueck(7)); listZL.append(getGleisstueck(27)); listZL.append(getGleisstueck(5)); 

	//Barby - Prödel:
	List listBP = new List(datenmodell.getGleisstueck(2));
	listLZ.append(null); listBP.append(getGleisstueck(28)); listZL.append(getGleisstueck(3); listZL.append(getGleisstueck(22)); listZL.append(getGleisstueck(25)); listZL.append(getGleisstueck(26)); listZL.append(getGleisstueck(12)); 


        
        return null;
    }
    
    }
    */
    
}
