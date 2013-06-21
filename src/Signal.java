public class Signal
{
    private boolean stellung;
    private boolean gesperrt;
    private String bezeichnung;
    private Gleisstueck bezug;
    private boolean ende;
    
    /** Datenmodell:
     * Konstruktor Signal
     * @param b Bezeichnung
     */
    public Signal(String b, Gleisstueck bez, boolean e) {
        stellung = true;
        gesperrt = false;
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

    public boolean setStellung(boolean s){
        if(gesperrt != true){
            stellung = s;
            return true;
        }
        return false;
    }

    public boolean getStellung(){
        return stellung;
    }

    public boolean farbe(){
        Gleisstueck o;
        Gleisstueck d;
        if(ende){
            o = bezug;
            if(bezug.getEnde().getStellung()){
                d = bezug.getEnde().getNaechsterP();
            }
            else d = bezug.getEnde().getNaechsterM();
            return bezug.getEnde().befahrbar(o, d, bezug.getSperrer());
        }
        else{
            d = bezug;
            o = bezug.getAnfang().getAnfang();
            return bezug.getAnfang().befahrbar(o, d, bezug.getSperrer());
        }
    }

    public boolean ende(){
        return ende;
    }
}