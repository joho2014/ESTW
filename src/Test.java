public class Test{
	private Steuerung St;
	public void test(){
		//1. Barby → Zerbst; zeitgleich Prödel → Barby
		//Ziel: Kollision auf Südkurve

		//2. Barby → Barby
		//Ziel: Kann der Zug wenden? Was passiert,wenn Ziel = Start

		//3. Lindau → Prödel; zeitgleich Prödel → Lindau
		//Ziel: Kollision auf „Nordkurve“

		//4. Lindau → Prödel (Fahrstrecke)
		//Ziel: Versuch,jede Weiche und jedes Signal zu verstellen. 
/*
		Zug zug0 = St.zugErstellen(17,12);
		St.blockFahren();
		s21.setStellung(true);
		w17.setStellung(false);
		St.blockFahren();
		s18.setStellung(true);
		w39.setStellung(false);
		St.blockFahren();
		St.fahren();
//*/
		//5. Zerbst → Lindau; Lindau → Prödel (Beides Fahrstrecken)
		//Ziel:Erschaffen zweier sich schneidender Fahrstrecken 

		//5.1 Code:
		Zug zug1 = St.zugErstellen(5,13);
		Zug zug2 = St.zugErstellen(17,9);
		St.fahren();

		//6. Barby → Lindau; Barby → Lindau
		//Ziel:Zwei Züge zeitgleich auf der selben Position.

		Zug zug3 = St.zugErstellen(2,13);
		Zug zug4 = St.zugErstellen(2,13);
		St.fahren();

	}

}