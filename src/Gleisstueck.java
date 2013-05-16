public class Gleisstueck
{
    private String bezeichnung;
    private boolean belegt;/**true= belegt; false= nicht belegt*/
    private boolean gesperrt;/**true= gesperrt; false= nicht gesperrt*/
    private double laenge;
    private Weiche anfang;/**Weiche bei nach der das Gleisstueck beginnt*/
    private Weiche ende;/**Weiche vor der das Gleisstueck*/
    
    /** Datenmodell:
     * Konstruktor Gleisstueck
     * @param b Bezeichnung 
     * @param l Laenge
     * @param a Anfangsweiche
     * @param e Endweiche
     */
    public Gleisstueck(String b, double l, Weiche a, Weiche e) {
        bezeichnung = b;
        belegt = false;
        gesperrt = false;
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
}