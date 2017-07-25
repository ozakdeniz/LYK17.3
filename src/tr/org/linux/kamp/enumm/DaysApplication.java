package tr.org.linux.kamp.enumm;

public class DaysApplication {
	
	static Days day;
	
	public DaysApplication(Days day) {
		this.day = day;
		
	}
	
	public static void tellAboutDays() {
		switch(day) {
		case PAZARTESI:
			System.out.println("Pazartesi iğrençtir.");
			break;
		case CUMA:
			System.out.println("Cuma günü favoridir");
			break;
		case CUMARTESI:
			System.out.println("Haftasonları süperdir");
			break;
		default :
			System.out.println("Diğer günlerden biri");
			break;
		}
	}
	
	public static void main(String[] args) {
		DaysApplication firstDay = new DaysApplication(Days.PAZARTESI);
		firstDay.tellAboutDays();
	}

}
