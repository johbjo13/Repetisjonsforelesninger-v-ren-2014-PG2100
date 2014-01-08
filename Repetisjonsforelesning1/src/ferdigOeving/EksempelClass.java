package ferdigOeving;

public class EksempelClass {
	// attributter
	String tekstAttributt;
	int tallAttributt;
	double desimaltallAttributt;
	boolean trueFalseAttrubitt;
	
	// Konstruktør 1
	public EksempelClass(String tekstAttributt, int tallAttributt,
			double desimaltallAttributt, boolean trueFalseAttrubitt) {
		super();
		this.tekstAttributt = tekstAttributt;
		this.tallAttributt = tallAttributt;
		this.desimaltallAttributt = desimaltallAttributt;
		this.trueFalseAttrubitt = trueFalseAttrubitt;
	}
	// Konstruktør 2
	public EksempelClass(){
		this.tekstAttributt = "eksempel";
		this.tallAttributt = 24;
		this.desimaltallAttributt = 33.33;
		this.trueFalseAttrubitt = true;
		
		
	}
	
	public String getTekstAttributt() {
		return tekstAttributt;
	}
	public void setTekstAttributt(String tekstAttributt) {
		this.tekstAttributt = tekstAttributt;
	}
	public int getTallAttributt() {
		return tallAttributt;
	}
	public void setTallAttributt(int tallAttributt) {
		this.tallAttributt = tallAttributt;
	}
	public double getDesimaltallAttributt() {
		return desimaltallAttributt;
	}
	public void setDesimaltallAttributt(double desimaltallAttributt) {
		this.desimaltallAttributt = desimaltallAttributt;
	}
	public boolean isTrueFalseAttrubitt() {
		return trueFalseAttrubitt;
	}
	public void setTrueFalseAttrubitt(boolean trueFalseAttrubitt) {
		this.trueFalseAttrubitt = trueFalseAttrubitt;
	}
	
	// Tostring metode.
	@Override
	public String toString() {
		return "EksempelClass [tekstAttributt=" + tekstAttributt
				+ ", tallAttributt=" + tallAttributt
				+ ", desimaltallAttributt=" + desimaltallAttributt
				+ ", trueFalseAttrubitt=" + trueFalseAttrubitt + "]";
	}
	
	// Equals metode
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		EksempelClass other = (EksempelClass) obj;
		if (Double.doubleToLongBits(desimaltallAttributt) != Double
				.doubleToLongBits(other.desimaltallAttributt))
			return false;
		if (tallAttributt != other.tallAttributt)
			return false;
		if (tekstAttributt == null) {
			if (other.tekstAttributt != null)
				return false;
		} else if (!tekstAttributt.equals(other.tekstAttributt))
			return false;
		if (trueFalseAttrubitt != other.trueFalseAttrubitt)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
