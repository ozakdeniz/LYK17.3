package tr.org.linux.kamp.calculation;

import java.util.Scanner;

public class CalculatorApplication {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("İşlem yaptırmak istediğiniz sayıları giriniz (Örn. 3,30-> 3*30/100):");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		System.out.println(" Toplama işlemi için p, çıkarma işlemi için mn, çarpma işlemi için ml,\n"
				+ " bölme işlemi için d, yüzde işlemi için pr giriniz :");
		
		String cal = input.next();
		
		if(cal.equals("p")) {
			System.out.println("sonuç :"+Calculator.TOPLA.calculate(x, y));
		}
		else if(cal.equals("mn")){
	           System.out.println("sonuç :"+Calculator.CIKAR.calculate(x, y));
	       }
		else if(cal.equals("ml")){
	           System.out.println("sonuç :"+Calculator.CARP.calculate(x, y));
	       }
		else if(cal.equals("d")){
	           System.out.println("sonuç :"+Calculator.BOL.calculate(x, y));
	       }
		else if(cal.equals("pr")){
	           System.out.println("sonuç :"+Calculator.YUZDE.calculate(x, y));
	       }
	    else{
	           System.out.println("Böyle bir işlem tanımlanmamıştır.");
	       }
		
	}

}
