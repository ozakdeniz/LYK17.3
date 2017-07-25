package tr.org.linux.kamp.calculation;

public enum Calculator {
	
	TOPLA , CIKAR , CARP , BOL , YUZDE;
	
	public double calculate(double x, double y) {
		switch(this) {
		case TOPLA:
			return (x+y);
		case CIKAR:
			return (x-y);
		case CARP:
			return (x*y);
		case BOL:
			return (x/y);
		case YUZDE:
			return x*(y/100.0);
		default:
			System.out.println("Böyle bir işlem tanımlanmamıştır.");
			return 0;
			
		
		}
		
	}

}
