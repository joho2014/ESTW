public class Test{
	private Steuerung St;

	//1. Barby → Zerbst; zeitgleich Prödel → Barby
		//Ziel: Kollision auf Südkurve

	public void test1(){
		Zug zug1 = St.zugErstellen(8,2)
		St.blockfahren();
		St.blockfahren();
		Zug zug2 = St.zugErstellen(2,5)
		St.fahren();
	}

		/**2. Barby → Barby
		* Ziel: Kann der Zug wenden? Was passiert,wenn Ziel = Start
		*/
		public void test2()
		{
		Zug zug1 = St zugErstellen(2,2);
        Stuerung.fahren();
        }
		
		/**3. Lindau → Prödel; zeitgleich Prödel → Lindau
		*Ziel: Kollision auf „Nordkurve“
		*/

        public void test3()
		{
		Zug zug1 = St.zugErstellen(17,12);
        St.blockfahren();
        St.blockfahren();
        St.blockfahren();
        Zug zug2 = St.zugErstellen(8,13);
        St.fahren();
        }

		/**4. Lindau → Prödel (Fahrstrecke)
		*Ziel: Versuch,jede Weiche und jedes Signal zu verstellen. 
		*/
		public void test4(){
		Zug zug0 = St.zugErstellen(17,12);
		St.blockFahren();
		s21.setStellung(true);
		w17.setStellung(false);
		St.blockFahren();
		s18.setStellung(true);
		w39.setStellung(false);
		St.blockFahren();
		St.fahren();
		}

		/**5. Zerbst → Lindau; Lindau → Prödel (Beides Fahrstrecken)
		*Ziel:Erschaffen zweier sich schneidender Fahrstrecken 
		*/

		public void test5()
{
Zug zug1 = St.zugErstellen(5,13)
Zug zug2  = St.zugErstellen(17,9) 
}

		//6. Barby → Lindau; Barby → Lindau
		//Ziel:Zwei Züge zeitgleich auf der selben Position.
public void test6() 
Zug zug1  = St.zugErstellen(2,13) 
Zug zug2  = St.zugErstellen(2,13) 
St.fahren();

}

	

}


public void test4(){
Zug zug1  = St.zugErstellen(17,12) 
	St.blockfahren();
	s21.setStellung(true);
	w17.setStellung(false);
	St.blockfahren();
	s18.setStellung(true);
	w39.setStellung(false);
	St.blockfahren();
}





public void test6() // Fahrt gegen die Fahrrichtung
{
Zug zug1 = St.zugErstellen(12,9);
St.fahren();
}





}

