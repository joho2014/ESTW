public class Test{
	private Steuerung st;
	private Datenmodell d;

	/*
	1. Barby → Zerbst; zeitgleich Prödel → Barby
	Ziel: Kollision auf Südkurve
	*/

	public void test1(){
		Zug zug1 = st.zugErstellen(8, 2, "Zug 1");
		st.blockFahren();
		st.blockFahren();
		Zug zug2 = st.zugErstellen(2, 5, "Zug 2");
		st.fahren();
	}

	/*
	2. Barby → Barby
	Ziel: Kann der Zug wenden? Was passiert,wenn Ziel = Start
	*/
	public void test2(){
		Zug zug1 = st.zugErstellen(2, 2, "Zug 1");
		st.fahren();
	}

	/*
	3. Lindau → Prödel; zeitgleich Prödel → Lindau
	Ziel: Kollision auf „Nordkurve“
	*/
	public void test3(){
		Zug zug1 = st.zugErstellen(17, 12, "Zug 1");
		st.blockFahren();
		st.blockFahren();
		st.blockFahren();
		Zug zug2 = st.zugErstellen(8, 13, "Zug 2");
		st.fahren();
	}

	/*
	4. Lindau → Prödel (Fahrstrecke)
	Ziel: Versuch,jede Weiche und jedes Signal zu verstellen. 
	*/
	public void test4(){
		Zug zug0 = st.zugErstellen(17, 12, "Zug 0");
		st.blockFahren();
		//s21.setStellung(true);
		//w17.setStellung(false);
		st.blockFahren();
		//s18.setStellung(true);
		//w39.setStellung(false);
		st.blockFahren();
		st.fahren();
	}

	/*
	5. Zerbst → Lindau; Lindau → Prödel (Beides Fahrstrecken)
	Ziel:Erschaffen zweier sich schneidender Fahrstrecken 
	*/
	public void test5(){
		Zug zug1 = st.zugErstellen(5, 13, "Zug 1");
		Zug zug2 = st.zugErstellen(17, 9, "Zug 2"); 
	}

	/*
	6. Barby → Lindau; Barby → Lindau
	Ziel:Zwei Züge zeitgleich auf der selben Position.
	*/
	public void test6(){
		Zug zug1  = st.zugErstellen(2, 13, "Zug 1");
		Zug zug2  = st.zugErstellen(2, 13, "Zug 2");
		st.fahren();
	}

	/*
	public void test6() // Fahrt gegen die Fahrrichtung
	{
		Zug zug1 = st.zugErstellen(12, 9, "Zug 1");
		st.fahren();
	}
	*/
}
