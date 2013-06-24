public class Gleisstueck
{
    private String bezeichnung;
    private Zug current;
    private Zug sperrer;
    private double laenge;
    private Weiche anfang;
    private Weiche ende;
    private Signal endSignal;
    private Signal anfangsSignal;
    
    /** Datenmodell:
     * Konstruktor Gleisstueck
     * @param b Bezeichnung 
     * @param l Laenge
     * @param a Anfangsweiche
     * @param e Endweiche
     */
    public Gleisstueck(String b, double l) {
        bezeichnung = b;
        current = null;
        sperrer = null;
        laenge = l;
        anfang = null;
        ende = null;
        endSignal = null;
        anfangsSignal = null;
    }

    public void setWeichen(Weiche a, Weiche e){
        anfang = a;
        ende = e;
    }

    public boolean setSignal(Signal s){
        if(s.ende() && endSignal == null){
            endSignal = s;
            return true;
        }
        else if(!s.ende() && anfangsSignal == null){
            anfangsSignal = s;
            return true;
        }
        return false;
    }

    /** Datenmodell:
     * Ausgabe der Bezeichnung.
     * @return String Bezeichnung
     */
    public String getBezeichnung ()
    {
        return bezeichnung;
    }
    
    public boolean gesperrt(){
        if(sperrer != null) return true;
        else return false;
    }

    public boolean belegt(){
        if(current != null) return true;
        else return false;
    }

    
    /** Datenmodell:
     * Ausgabe der Laenge.
     * @return double Laenge
     */
    public double getLaenge ()
    {
        return laenge;
    }
    
    /** Datenmodell:
     * Ausgabe der Endweiche.
     * @return Weiche Endweiche
     */
    public Weiche getEnde ()
    {
        return ende;
    }
    
    /** Datenmodell:
     * Ausgabe der Anfangsweiche.
     * @return Weiche Anfangsweiche
     */
    public Weiche getAnfang ()
    {
        return anfang;
    }

    public boolean sperren(Zug z){
        if(current == null && sperrer == null){
            sperrer = z;
            return true;
        }
        else return false;
    }

    public boolean entsperren(Zug z){
        if(current == null && sperrer == z){
            sperrer = null;
            return true;
        }
        else return false;
    }

    public boolean befahren(Zug z){
        if(current == null && sperrer == z && sperrer != null){
            current = z;
            return true;
        }
        else return false;

    }

    public boolean verlassen(Zug z){
        if(current == z && sperrer == z){
            current = null;
            return true;
        }
        else return false;
    }

    public boolean befahrbar(Zug z){
        if(current == null && sperrer == z && sperrer != null){
            return true;
        }
        return false;
    }

    public Zug getSperrer(){
        return sperrer;
    }

    public Weiche nextW(Weiche w){
        if(anfang == w) return ende;
        else return anfang;
    }

    public Weiche verbindung(Gleisstueck g){
        if(anfang != null && anfang.erreichbar(g)) return anfang;
        else if(ende != null && ende.erreichbar(g)) return ende;
        return null;
    }

    public String toString(){
        return bezeichnung;
    }
}