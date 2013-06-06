public class Test{
    private Steuerung st;
    private Datenmodell d;
    private DieGrafik g;
    private Zug [] Zug;
   

    /**
     *Barby --> Zerbst; zeitgleich Proedel --> Barby
     *Ziel: Kollision auf Suedkurve
     */

    public void test1(){
        Zug zug1 = st.zugErstellen(8, 2, "Zug 1");
        st.blockFahren();
        st.blockFahren();
        Zug zug2 = st.zugErstellen(2, 5, "Zug 2");
        g.textAusgeben("Position Zug1: "+Integer.toString(zug1.getPosition())+"\n"+"Position Zug2: "+Integer.   toString(zug2.getPosition()));
        st.fahren();
    }

    /**
     *Barby --> Barby
     *Ziel: Kann der Zug wenden? Was passiert,wenn Ziel = Start
     */
    public void test2(){
        Zug zug1 = st.zugErstellen(2, 2, "Zug 1");
        st.fahren();
    }

    /**
     *Lindau --> Proedel; zeitgleich Proedel --> Lindau
     *Ziel: Kollision auf Nordkurveâ€œ
     */
    public void test3(){
        Zug zug1 = st.zugErstellen(17, 12, "Zug 1");
        st.blockFahren();
        st.blockFahren();
        st.blockFahren();
        Zug zug2 = st.zugErstellen(8, 13, "Zug 2");
        st.fahren();
    }

    /**
     *Lindau --> Proedel (Fahrstrecke)
    Ziel: Versuch,jede Weiche und jedes Signal zu verstellen. 
     */
    public void test4(){
        Zug zug0 = st.zugErstellen(17, 12, "Zug 0");
        st.blockFahren();
        d.getSignal(21).setStellung(true);
        d.getWeiche(17).setStellung(false);
        st.blockFahren();
        d.getSignal(18).setStellung(true);
        d.getWeiche(39).setStellung(false);
        st.blockFahren();
        st.fahren();
    }

    /**
     *Zerbst --> Lindau; Lindau --> Proedel (Beides Fahrstrecken)
     *Ziel:Erschaffen zweier sich schneidender Fahrstrecken 
     */
    public void test5(){
        Zug zug1 = st.zugErstellen(5, 13, "Zug 1");
        Zug zug2 = st.zugErstellen(17, 9, "Zug 2"); 
    }

    /**
     *Barby --> Lindau; Barby --> Lindau
     *Ziel:Zwei Zuege zeitgleich auf der selben Position.
     */
    public void test6(){
        Zug zug1  = st.zugErstellen(2, 13, "Zug 1");
        Zug zug2  = st.zugErstellen(2, 13, "Zug 2");
        st.fahren();
    }

    /**
     *Fahrt gegen die Fahrrichtung
     */
    public void test7()
    {
        Zug zug1 = st.zugErstellen(12, 9, "Zug 1");
        st.fahren();
    }

    /**
     * 2 Züge an der selben stelle erzeugen
     */
    public void test8()
    {
        Zug zug1 = st.zugErstellen(12,13,"Zug1");
        Zug zug2 = st.zugErstellen(12,13,"Zug2");
        st.fahren();
    }

    /**
     * I like trains...
     */
    public void test9(){
        Zug = new Zug[199];
        for(int i = 0;i==200;i++){
            Zug[i]=st.zugErstellen(12,13,""+i);
        }
    }
}