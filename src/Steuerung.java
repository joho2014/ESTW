
/**
 * Zweite Steuerung die mit nur einem Zug und Fahrstraßen arbeitet.
 * 
 * @author Huber Norbert 
 * @version 26.06.2013
 */
public class Steuerung
{
    private Zug zug;
    private Datenmodell dm;
    private DieGrafik az;
    public Steuerung()
    {
        zug = null;
        dm = new Datenmodell();
        az = new DieGrafik(dm,this);
    }

    public void ZugErstellen(String start,String ziel){
        if(zug != null){
            System.out.println("Es ist bereits ein Zug vorhanden");
        }
        else{
            zug = new Zug();
            zug.ZugErstellen(start,ziel);
        }
    }
    
    public void ZugLöschen(){
        zug = null;
    }
    
    public void blockfahren(){
        if (zug == null){
            System.out.println("Es befindet sich kein Zug im Bahnhof")
        
    }
    
    
}