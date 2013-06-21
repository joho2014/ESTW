public class Weiche
{
    private boolean stellung;
    private Gleisstueck naechsterP;
    private Gleisstueck naechsterM;
    private Gleisstueck anfang;
    private String bezeichnung;
    private Zug sperrer;
    
    /** Datenmodell:
     * Konstruktor Weiche 
     * @param b Stellung
     * @param np Naechstes Gleisstueck Plusstellung
     * @param nm Naechstes Gleisstueck Minusstellung
     * @param a Anfang des Gleisstuecks
     */
    public Weiche(String b, Gleisstueck np, Gleisstueck nm, Gleisstueck a) {
        stellung = true;
        naechsterP = np;
        naechsterM = nm;
        anfang = a;
        bezeichnung = b;
        sperrer = null;
    }
    
    /** Datenmodell:
     * Stellung des naechsten Gleisstuecks in Plusstellung wird gesetzt.
     * @param g Naechstes Gleisstueck in Plusstellung
     */
    public void setNaechsterP(Gleisstueck g)
    {
       naechsterP = g;
    }
    
    /** Datenmodell:
     * Ausgabe des folgenden Gleisstuecks in Plusstellung.
     * @return Gleisstueck naechstes Gleisstueck in Plusstellung
     */
    public Gleisstueck getNaechsterP ()
    {
        return naechsterP;
    }
    
    /** Datenmodell:
     * Stellung des naechsten Gleisstuecks in Minusstellung wird gesetzt.
     * @param g Naechstes Gleisstueck in Minusstellung
     */
    public void setNaechsterM(Gleisstueck g)
    {
        naechsterM=g;
    }
    
    /** Datenmodell:
     * Ausgabe des folgenden Gleisstuecks in Minusstellung.
     * @return Gleisstueck naechstes Gleisstueck in Minusstellung
     */
    public Gleisstueck getNaechsterM ()
    {
        return naechsterM;
    }
    
    /** Datenmodell:
     * Das Anfangsgleisstuecks wird gesetzt.
     * @param g Anfangsgleisstueck
     */
    public void setAnfang(Gleisstueck g)
    {
        anfang = g;
    }
    
    /** Datenmodell:
     * Ausgabe des Anfangsgleisstuecks.
     * @return Gleisstueck Anfangsgleisstuecks
     */
    public Gleisstueck getAnfang()
    {
        return anfang;
    }
    
    /** Datenmodell:
     * Die Bezeichnung wird gesetzt.
     * @param b Bezeichnung
     */
    public void setBezeichnung(String b)
    {
        bezeichnung = b;
    }
    /** Datenmodell:
     * Ausgabe der Bezeichnung.
     * @return String Bezeichnung
     */
    public String getBezeichnung ()
    {
        return bezeichnung;
    }
    
    public String toString()
    {
        return bezeichnung;
    }

    public boolean sperren(Zug z){
        if(sperrer == null){
            sperrer = z;
            return true;
        }
        else return false;
    }

    public boolean entsperren(Zug z){
        if(sperrer == z){
            sperrer = null;
            return true;
        }
        else return false;
    }

    public boolean stellen(Gleisstueck o, Gleisstueck d, Zug z){
        if(((o == anfang && d == naechsterP)||(d == anfang && o == naechsterP)) && (sperrer == null || sperrer == z)){
            stellung = true;
            return true;
        }
        else if(sperrer == null || sperrer == z){
            stellung = false;
            return true;
        }
        return false;
    }

    public boolean getStellung(){
        return stellung;
    }

    public boolean setStellung(boolean b){
        if (sperrer == null){
            stellung = b;
            return true;
        }
        else return false;
    }

    public boolean befahrbar(Gleisstueck o, Gleisstueck d, Zug z){
        if(z == sperrer){
            if(stellung == true){
                if ((o == anfang && d == naechsterP)||(d == anfang && o == naechsterP)) return true;
            }
            else{
                if ((o == anfang && d == naechsterM)||(d == anfang && o == naechsterM)) return true;
            }
        }
        return false;
    }

    public boolean gesperrt(){
        if(sperrer != null) return true;
        else return false;
    }

    public boolean erreichbar(Gleisstueck g){
        if(g == anfang || g == naechsterP || g == naechsterM) return true;
        return false;
    }
}