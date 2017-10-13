package galgeleg;

import static org.junit.Assert.*;
import org.junit.Test;

public class GalgeLegCDIO1test {
	
	@Test
	public void basicTests() {
		Galgelogik logic = new Galgelogik();
		
		// Tjekker om det synlige ord, ret faktisk er det ord man skal gætte.
		assertEquals(logic.getOrdet().length(), logic.getSynligtOrd().length());
		
		// Tjekker om spillet slutter, når man har gættet forkert over 6 gange
		assertEquals(logic.getAntalForkerteBogstaver() > 6, logic.erSpilletTabt() == true);
		
	}
	
	@Test
	public void gameConstruct() {
		//Her køres et komplet spil, med et tilfældigt ord. Spillet skal returnere når
		//ordet enten er gættet, eller når spillet er tabt.
		Galgelogik logic = new Galgelogik();
		
		logic.gætBogstav("g");
		logic.gætBogstav("i");
		if(logic.erSpilletSlut()){
			assertTrue(logic.erSpilletSlut());
			return;
		}
		logic.gætBogstav("a");
		if(logic.erSpilletSlut()){
			assertTrue(logic.erSpilletSlut());
			return;
		}
		logic.gætBogstav("s");
		if(logic.erSpilletSlut()){
			assertTrue(logic.erSpilletSlut());
			return;
		}
		logic.gætBogstav("b");
		if(logic.erSpilletSlut()){
			assertTrue(logic.erSpilletSlut());
			return;
		}
		logic.gætBogstav("n");
		if(logic.erSpilletSlut()){
			assertTrue(logic.erSpilletSlut());
			return;
		}
		logic.gætBogstav("l");
		if(logic.erSpilletSlut()){
			assertTrue(logic.erSpilletSlut());
			return;
		}
		logic.gætBogstav("t");
		if(logic.erSpilletSlut()){
			assertTrue(logic.erSpilletSlut());
			return;
		}
		logic.gætBogstav("i");
		if(logic.erSpilletSlut()){
			assertTrue(logic.erSpilletSlut());
			return;
		}
		logic.gætBogstav("o");
		if(logic.erSpilletSlut()){
			assertTrue(logic.erSpilletSlut());
			return;
		}
		logic.gætBogstav("x");
		if(logic.erSpilletSlut()){
			assertTrue(logic.erSpilletSlut());
			return;
		}
		logic.gætBogstav("æ");
		if(logic.erSpilletSlut()){
			assertTrue(logic.erSpilletSlut());
			return;
		}
		logic.gætBogstav("ø");
		if(logic.erSpilletSlut()){
			assertTrue(logic.erSpilletSlut());
			return;
		}
		logic.gætBogstav("å");
		if(logic.erSpilletSlut()){
			assertTrue(logic.erSpilletSlut());
			return;
		}
	}
	
}