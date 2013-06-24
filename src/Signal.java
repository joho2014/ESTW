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
                if(bezug.getEnde().getNaechsterP() != o) d = bezug.getEnde().getNaechsterP();
                else d = bezug.getEnde().getAnfang();
            }
            else{
                if(bezug.getEnde().getNaechsterM() != o) d = bezug.getEnde().getNaechsterM();
                else d = bezug.getEnde().getAnfang();
            }
            return bezug.getEnde().befahrbar(o, d, bezug.getSperrer());
        }
        else{
            d = bezug;
            o = bezug.getAnfang().getAnfang();
            if(bezug.getAnfang().getStellung()){
                if(bezug.getAnfang().getAnfang() != d) o = bezug.getAnfang().getAnfang();
                else o = bezug.getAnfang().getNaechsterP();
            }
            else{
                if(bezug.getEnde().getAnfang() != d) o = bezug.getEnde().getAnfang();
                else o = bezug.getAnfang().getNaechsterM();
            }
            return bezug.getAnfang().befahrbar(o, d, bezug.getSperrer());
        }
    }

    public boolean ende(){
        return ende;
    }
}