package tr.org.linux.kamp.garbage;

public class GarbageApplication {
	
	int value;
	
	public void finalize() throws Throwable{
		super.finalize();
		System.out.println("Garbage Collector çalıştı");
	}

}
