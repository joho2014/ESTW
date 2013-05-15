public class Signal
{
    private boolean stellung;
    private boolean gesperrt;
    private String bezeichnung;
    
    /** Datenmodell:
     * Konstruktor Signal
     * @param b Bezeichnung
     */
    public Signal(String b) {
        stellung = true;
        gesperrt = false;
        bezeichnung = b;
    }
    
    /** Datenmodell:
     * Die Stellung wird gesetzt.
     * @param s Stellung
     */
    public void setStellung(boolean s)
    {
        stellung=s;
    }
    
    /** Datenmodell:
     * Ausgabe der Stellung.
     * @return boolean Stellung
     */
    public boolean getStellung ()
    {
        return stellung;
    }
    
    /** Datenmodell:
     * Die Sperrung wird gesetzt.
     * @param g Sperrung
     */
    public void setGesperrt(boolean g)
    {
        gesperrt=g;
    }
    
    /** Datenmodell:
     * Ausgabe der Sperrung.
     * @return boolean Sperrung
     */
    public boolean getGesperrt ()
    {
        return gesperrt;
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
}