public class Signal
{
    private String bezeichnung;
    private Gleisstueck bezug;
    private boolean ende;
    
    /** Datenmodell:
     * Konstruktor Signal
     * @param b Bezeichnung
     */
    public Signal(String b, Gleisstueck bez, boolean e) {
        bezeichnung = b;
        bezug = bez;
        ende = e;
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

    public void figureState(){
        stellung = farbe();
        gesperrt = bezug.gesperrt();
    }

    public boolean farbe(){
        Weiche w;
        Gleisstueck next;

        if(ende) w = bezug.getEnde();
        else w = bezug.getAnfang();

        if(w.getAnfang() == bezug) next = w.getNaechster();
        else next = w.getAnfang();
            
        return w.befahrbar(bezug, next, bezug.getSperrer());
    }

    public boolean ende(){
        return ende;
    }
}