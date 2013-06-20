/**
 * Steuerung f�r den Zug
 * 
 * @author (Florian A., Tobias, Norbert, Fabio) 
 * @version (02.05.2013)
 */
public class Steuerung
{
    
    private List trains;
    private DieGrafik anzeige;
    private Datenmodell datenmodell;
    private Test test;
    

    /**
     * Constructor for objects of class Steuerung
     */
    public Steuerung(){
        trains = new List();
        datenmodell = new Datenmodell();
        anzeige = new DieGrafik(datenmodell,this);
        test = new Test(this,datenmodell,anzeige);
    }

    public Test getTest(){
        return test;  
    }
    
    /**
     * Jeder Zug wird auf den n�chsten Gleisabschnitt bewegt, falls m�glich
     *
     */
    public void blockFahren(){
        Node node = trains.getHead();
        while(node != null){
            Zug t = (Zug)node.getDatum();
            if (t.nextTrack()) cleanup(t);
            node = node.next();
        }
        anzeige.update();
        System.out.println(trains);
    }
    
    /**
     * Erstellt einen Zug
     * 
     * @param   start       Legt den Startbahnhof fest
     *          ziel        Legt den Zielbahnhof fest
     *          name        Legt den Namen des Zuges fest
     * @return     Einen Zug
     */
    public Zug zugErstellen(int start, int ziel, String name){
        Zug n = new Zug(start,ziel,name, datenmodell);
        trains.append(n);
        wiederSperren();
        figureSignals();
        return n;
    }
    
    /**
     * Realtime
     */
    public void fahren(){}

    public void cleanup(Zug z){
        z.wegFreimachen();
        trains.delete(z);
        wiederSperren();
        figureSignals();
    }

    public void figureSignals(){
        int i = 0;
        while(datenmodell.getSignal(i) != null){
            datenmodell.getSignal(i).figureState();
            i++;
        }
    }

    public void wiederSperren(){
        Node node = trains.getHead();
        while(node != null){
            ((Zug)node.getDatum()).reservieren();
            node = node.next();
        }
    }
}
