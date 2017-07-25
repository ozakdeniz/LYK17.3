package tr.org.linux.kamp.caeser;

import java.util.Scanner;

public class CaesarCipher {
	
	
	public static void main(String[] args) {
		int key;
		String message;
		Scanner scan = new Scanner(System.in);
		System.out.println("Şifrelenmenin gerçekleşmesi için bir sayı girin :");
		key = scan.nextInt();
	    scan.nextLine();
	    
		System.out.println("Şifrelenmesini istediğiniz mesajı girin :");
		message = scan.nextLine();
		
		System.out.println("Şifreleme için E çözümleme için D giriniz :");
		String op = scan.next();
		
	    if(op.equals("E")){
	           System.out.println(encryption(message, key));
	       }
	       else if(op.equals("D")){
	           System.out.println(decryption(message, key));
	       }
	       else{
	           System.out.println("Hatalı bir operasyon seçtiniz.");
	       }
	       
	   
	   
		
		/*System.out.println("Şifrelenmiş hali :"+encryption(message,key));
		
		System.out.println("Mesajınız :"+decryption(message,key));*/
		
		
	}
	
	public static String encryption(String message,int key) {
		
		if(key < 0) key = 26 - (-key%26);
		
		String result = "";
		for(int i = 0; i < message.length(); i++) {
			/*System.out.println(message.charAt(i)+ "->" +(int) message.charAt(i));
			System.out.println((int) message.charAt(i) + key +"->"+ (char)((int)message.charAt(i)+key ));
			result += (char)((int)message.charAt(i)+key );	*/
			
			char ch = message.charAt(i);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch)) {
					
					result += (char)('A' + (ch +key - 'A')%26);
					
				}
				
				else {
					result += (char)('a' + (ch +key - 'a')%26);
				}
			}
			
			else {
				result += ch;
			}
		}
		
		return result;
		//return result;
	}
	
	public static String decryption(String message,int key) {
		
		return encryption(message, -key);
	}

}

/*public class CaesarCipher {

   
   public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       System.out.println("Lütfen bir anahtar giriniz: ");
       int key = sc.nextInt();
       sc.nextLine();
       
       System.out.println("Lütfen mesajı giriniz: ");
       String msg = sc.nextLine();
       
       System.out.println("Şifreleme için E, çözümleme için D giriniz: ");
       String op = sc.next();
       
       if(op.equals("E")){
           System.out.println(encrypt(msg, key));
       }
       else if(op.equals("D")){
           System.out.println(decrypt(msg, key));
       }
       else{
           System.out.println("Hatalı bir operasyon seçtiniz.");
       }
       
   }
   
   public static String encrypt(String msg, int key){
       if(key < 0) key = 26-(-key%26);
       String result = "";
       for(int i = 0; i < msg.length();i++){
           char ch = msg.charAt(i);
           if(Character.isLetter(ch)){
               if(Character.isUpperCase(ch)){
                   result += (char)('A' + (ch + key - 'A')%26);
               }
               else{
                   result += (char)('a' + (ch + key - 'a')%26);
               }
           }
           else{
               result += ch;
           }
       }
       return result;
       
   }
   
   public static String decrypt(String msg, int key){
          return encrypt(msg, -key);
   }
}*/
