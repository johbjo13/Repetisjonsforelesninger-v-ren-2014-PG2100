import javax.management.monitor.CounterMonitorMBean;




public class Skuffen {

	private Sokker sokk [];
	
	private int antallSokker;
	
	
	public Skuffen (){
		
		this(24);
	}
	public Skuffen(int plassISkuffa){
		
		sokk = new Sokker[plassISkuffa];
		
	}
	public boolean taSokkePark(Sokker sokk){
		boolean tattSokk = false;
		if( (sokk.getAntall()) > 1){
			sokk.setAntall(sokk.getAntall() -2);
			
			System.out.println("Tok et par " + sokk.getFarge() + " sokker");
			if (sokk.getAntall() < 2){
				if(sokk.getAntall() == 1) System.out.println("Kaster siste " + sokk.getFarge()+ " sokken");
				fjernSokk(sokk);
				tattSokk = true;
			}
		}
		else {
			
			System.out.println("ikke nok sokker");
			return tattSokk = false;
			
		}
		
		return tattSokk;
	}
	
	
	
	public int getAntallSokker() {
	
		for (Sokker sokker : sokk){
			if(sokker != null){
				++antallSokker;
				
			}
			
		}
		
		return antallSokker;
	}
	
	public boolean addSokk(Sokker sokker){
		boolean added = false;
		
		try {
			sokk[antallSokker] = sokker;
			++antallSokker;
			
			added = true;
		} catch (Exception e) {
			added = false;
		}
		
		
		return added;
	}
	
	public boolean fjernSokk(Sokker sokker){
		boolean fjerna = false;
		int counter = 0;
		Sokker temp[] = new Sokker[sokk.length];
		
			
			for (int i = 0; i < sokk.length; i++) {
				if(sokk[i] != null){
				
				if(sokk[i].getFarge().equalsIgnoreCase(sokker.getFarge())){
					
					sokk[i] = null;
					--antallSokker;
					fjerna = true;
				}
				else {
					
					temp[counter] = sokk[i];
					++counter;
				
				}
				}
			
			
			
		}
		sokk = temp;
		return fjerna;
	}
	
	public int getTotaltAntallSokker(){
		int count = 0;
		
		
			
			for (Sokker sokker : sokk) {
				if(sokker != null){
				
				count += sokker.getAntall();
			
						
						
					
						
					
				
				}
			}
			
			
			
		
		
		
		return count;
	}
	
	public String toString(){
		String retur = ""; 
		for (Sokker sokker : sokk) { 
			if(sokker != null){
				retur += sokker.toString() + "\n"; 
				
			}
		}
		
		retur += "Antall sokker i skuffa " + getTotaltAntallSokker() + " "  ; 
		return retur;
	}
	
	
	
}
