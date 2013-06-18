public class Gleisstueck
{
    private String bezeichnung;
    private Zug current;
    private Zug sperrer;
    private double laenge;
    private Weiche anfang;
    private Weiche ende;
    
    /** Datenmodell:
     * Konstruktor Gleisstueck
     * @param b Bezeichnung 
     * @param l Laenge
     * @param a Anfangsweiche
     * @param e Endweiche
     */
    public Gleisstueck(String b, double l, Weiche a, Weiche e) {
        bezeichnung = b;
        current = null;
        sperrer = null;
        laenge = l;
        anfang = a;
        ende = e;
    }
    
    /** Datenmodell:
     * Bezeichnung wird gesetzt.
     * @param b Bezeichnung
     */
    public void setBezeichnung(String b)
    {
        bezeichnung=b;
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
     * Laenge wird gesetzt.
     * @param l Laenge
     */
    public void setLaenge(double l)
    {
        laenge = l;
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
     * Endweiche wird gesetzt.
     * @param e Endweiche
     */
    public void setEnde(Weiche e)
    {
        ende=e;
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
     * Anfangsweiche wird gesetzt.
     * @param e Anfangsweiche
     */
    public void setAnfang(Weiche a)
    {
        anfang=a;
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
        if(current == null && sperrer == z){
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

    public Zug getSperrer(){
        return sperrer;
    }

    public String toString(){
        return bezeichnung;
    }
}