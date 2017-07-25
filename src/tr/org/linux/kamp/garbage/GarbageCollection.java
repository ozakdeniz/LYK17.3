package tr.org.linux.kamp.garbage;

public class GarbageCollection {
	
	
	
	public static void main(String[] args) throws Throwable {
		
		Runtime rt = Runtime.getRuntime();
		System.out.println("Toplam bellek : " + rt.totalMemory());
		
	String str = new String("Linux Yaz Kampı");/*referasyon edilmiş bir nesne 
	olduğu için garbage bu nesneyi toplamaz*/
	System.out.println(str);//kullanıldığı içinde çöp dosyası toplamaz.
	str = "2017"; /*str = "2017" yeni bir tanım ekledik str ye ama refere
	 eden bir şeyde yok bir süre sonra çöp dosyası tarafından toplanıcak*/
	String str1 = new String ("java programlama");
	str = str1;
	str = null;
	//System.gc();
	
	GarbageApplication gcTest = new GarbageApplication();
	gcTest.value = 1;
	gcTest = null;
	//gcTest.finalize();
	//System.out.println(gcTest.value);
	System.out.println("boş bellek : " + rt.freeMemory());
	System.gc();
	//System.out.println(gcTest.value);
	
	System.out.println("garbage collector çalıştıktan sonra boş bellek : " + rt.freeMemory());

	
		
	}

}
/*Runtime rt = Runtime.getRuntime();
		System.out.println("Toplam bellek : " + rt.totalMemory());
		
		String str = new String("Linux yaz kampı");
		String str1 = new String("java programlama");
		System.out.println(str);
		str = str1;
		str = null;
	//	System.gc();
		
		GcTest gcTest = new GcTest();
		gcTest.value = 1;
		gcTest = null;
				
		System.out.println("boş bellek : " + rt.freeMemory());
	//System.out.println(gcTest.value);
		System.gc();
		
		
		System.out.println("boş bellek garbage collector çalıştıktan sonra : " + rt.freeMemory());

		//System.out.println(gcTest.value);
*/