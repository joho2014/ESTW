public class Gleisstück
{
    private String bezeichnung;
    private boolean belegt;
    private boolean gesperrt;
    private double länge;
    private Weiche anfang;
    private Weiche ende;
    
    /** Datenmodell:
     * Konstruktor Gleisstück
     * @param b Bezeichnung
     * @param l Länge
     * @param a Anfangsweiche
     * @param e Endweiche
     */
    public Gleisstück(String b, double l, Weiche a, Weiche e) {
        bezeichnung = b;
        belegt = false;
        gesperrt = false;
        länge = l;
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
    
    /** Datenmodell:
     * Belegung wird gesetzt.
     * @param x Belegung
     */
    public void setBelegt(boolean x)
    {
        belegt=x;
    }
    
    /** Datenmodell:
     * Ausgabe der Belegung.
     * @return boolean Belegung
     */
    public boolean getBelegt ()
    {
        return belegt;
    }
    
    /** Datenmodell:
     * Sperrung wird gesetzt.
     * @param x Sperrung
     */
    public void setGesperrt(boolean x)
    {
        gesperrt=x;
    }
    
    /** Datenmodell:
     * Ausgabe der Sperrung.
     * @return boolean Sperrung
     */
    public boolean getGesperrt()
    {
        return gesperrt;
    }
    
    /** Datenmodell:
     * Länge wird gesetzt.
     * @param l Länge
     */
    public void setLänge(double l)
    {
        länge = l;
    }
    
    /** Datenmodell:
     * Ausgabe der Länge.
     * @return double Länge
     */
    public double getLänge ()
    {
        return länge;
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
}