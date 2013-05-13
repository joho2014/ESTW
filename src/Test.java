public class Test{
	public void test(){
		//1. Barby → Zerbst; zeitgleich Prödel → Barby
		//Ziel: Kollision auf Südkurve

		//2. Barby → Barby
		//Ziel: Kann der Zug wenden? Was passiert,wenn Ziel = Start

		//3. Lindau → Prödel; zeitgleich Prödel → Lindau
		//Ziel: Kollision auf „Nordkurve“

		//4. Lindau → Prödel (Fahrstrecke)
		//Ziel: Versuch,jede Weiche und jedes Signal zu verstellen. 

		Zug zug1 = Steuerung.zugErstellen(17,12) 
		Steuerung.blockfahren();
		s21.setStellung(true);
		w17.setStellung(false);
		Steuerung.blockfahren();
		s18.setStellung(true);
		w39.setStellung(false);
		Steuerung.blockfahren();

		//5. Zerbst → Lindau; Lindau → Prödel (Beides Fahrstrecken)
		//Ziel:Erschaffen zweier sich schneidender Fahrstrecken 

		//5.1 Code:
		Zug zug1 = Steuerung.zugErstellen(5,13)
		Zug zug2 = Steuerung.zugErstellen(17,9)

		//6. Barby → Lindau; Barby → Lindau
		//Ziel:Zwei Züge zeitgleich auf der selben Position.

		Zug zug1 = Steuerung.zugErstellen(2,13) 
		Zug zug2 = Steuerung.zugErstellen(2,13)

	}
}