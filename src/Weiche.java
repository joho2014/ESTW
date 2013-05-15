public class Weiche
{
    private boolean stellung;
    private Gleisstück nächsterP;
    private Gleisstück nächsterM;
    private Gleisstück anfang;
    private String bezeichnung;
    private boolean gesperrt;
    
    /** Datenmodell:
     * Konstruktor Weiche 
     * @param b Stellung
     * @param np Nächstes Gleisstück Plusstellung
     * @param nm Nächstes Gleisstück Minusstellung
     * @param a Anfang des Gleisstücks
     */
    public Weiche(String b, Gleisstück np, Gleisstück nm, Gleisstück a) {
        stellung = true;
        nächsterP = np;
        nächsterM = nm;
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
     * Stellung des nächsten Gleisstücks in Plusstellung wird gesetzt.
     * @param g Nächstes Gleisstück in Plusstellung
     */
    public void setNächsterP(Gleisstück g)
    {
        nächsterP=g;
    }
    
    /** Datenmodell:
     * Ausgabe des folgenden Gleisstücks in Plusstellung.
     * @return Gleisstück nächstes Gleisstück in Plusstellung
     */
    public Gleisstück getNächsterP ()
    {
        return nächsterP;
    }
    
    /** Datenmodell:
     * Stellung des nächsten Gleisstücks in Minusstellung wird gesetzt.
     * @param g Nächstes Gleisstück in Minusstellung
     */
    public void setNächsterM(Gleisstück g)
    {
        nächsterM=g;
    }
    
    /** Datenmodell:
     * Ausgabe des folgenden Gleisstücks in Minusstellung.
     * @return Gleisstück nächstes Gleisstück in Minusstellung
     */
    public Gleisstück getNächsterM ()
    {
        return nächsterM;
    }
    
    /** Datenmodell:
     * Das Anfangsgleisstücks wird gesetzt.
     * @param g Anfangsgleisstück
     */
    public void setAnfang(Gleisstück g)
    {
        anfang=g;
    }
    
    /** Datenmodell:
     * Ausgabe des Anfangsgleisstücks.
     * @return Gleisstück Anfangsgleisstücks
     */
    public Gleisstück getAnfang ()
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