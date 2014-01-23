

public class DemSocks {

	
	public static void main(String[] args) {
		
		Sokker hvit = new Sokker("hvite", 7);
		Sokker svart = new Sokker("Svarte", 4);
		Sokker gul = new Sokker("gule", 3);
		Sokker lilla = new Sokker("lilla", 4);
		Sokker regnbue = new Sokker("regnbuefarga", 3);
		
		Skuffen skuffa = new Skuffen(10);
		
		skuffa.addSokk(hvit);
		skuffa.addSokk(svart);
		skuffa.addSokk(gul);
		skuffa.addSokk(lilla);
		skuffa.addSokk(regnbue);
		
		 // Før vi tar sokker
		System.out.println();
		System.out.println(skuffa.toString());
		System.out.println();
		
	
		skuffa.taSokkePark(gul);
		// skuffa.taSokkePark(svart);
	
		
		// Etter vi tar sokker
		System.out.println();
		System.out.println(skuffa.toString());
		
	}
	
}
