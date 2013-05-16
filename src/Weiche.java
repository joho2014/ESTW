public class Weiche
{
    private boolean stellung; /**true= +/waagerecht; false= -/schraeg*/
    private Gleisstueck naechsterP;/**naechstes Gleisstueck in Plusstellung*/
    private Gleisstueck naechsterM;/**naechstes Gleisstueck in Minusstellung*/
    private Gleisstueck anfang;/**Eingangsgleis der Weiche*/
    private String bezeichnung;
    private boolean gesperrt;/**true= Stellung kann nicht veraendert werden; false= Stellung kann veraendert werden*/
    
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
    }
    
    /** Datenmodell:
     * Stellung der Weiche wird gesetzt.
     * @param s Weichenstellung
     */
    public void setStellung(boolean s)
    {
        stellung=s;
    }
    
    /** Datenmodell:
     * Ausgabe der Weichenstellung.
     * @return boolean Weichenstellung
     */
    public boolean getStellung ()
    {
        return stellung;
    }
    
    /** Datenmodell:
     * Stellung des naechsten Gleisstuecks in Plusstellung wird gesetzt.
     * @param g Naechstes Gleisstueck in Plusstellung
     */
    public void setNaechsterP(Gleisstueck g)
    {
        naechsterP=g;
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
        anfang=g;
    }
    
    /** Datenmodell:
     * Ausgabe des Anfangsgleisstuecks.
     * @return Gleisstueck Anfangsgleisstuecks
     */
    public Gleisstueck getAnfang ()
    {
        return anfang;
    }
    
    /** Datenmodell:
     * Die Bezeichnung wird gesetzt.
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
    
    /** Datenmodell:
     * Die Weiche wird gesperrt/entsperrt.
     * @param g Weiche sperren
     */
    public void setGesperrt(boolean g)
    {
        gesperrt=g;
    }
    
    /** Datenmodell:
     * Ausgabe der Sperrung.
     * @return boolean Status
     */
    public boolean getGesperrt ()
    {
        return gesperrt;
    }
}