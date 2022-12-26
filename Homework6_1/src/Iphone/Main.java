package Iphone;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Iphone iphone1= new Iphone();
		  
		Scanner scan = new Scanner(System.in);  
			
		System.out.println("iPhone un Fiyatını giriniz");
		 		
		String girilen1 =scan.next();
		  
		char karakter1 = girilen1.charAt(0);
		
		while (!Character.isDigit(karakter1) ) {
			
			System.out.print("Geçersiz bir değer girdiniz. Girilen değer rakamlardan oluşmalıdır.");
			System.out.print("Fiyatı Tekrar giriniz");
			girilen1 =scan.next();
			karakter1 = girilen1.charAt(0);
			
		}
		
		iphone1.fiyat= Integer.parseInt(girilen1);
		
		//System.out.print("Girdiğiniz Fiyat: "+ iphone1.fiyat +"  "+"Euro");
		
		System.out.print("Modeli giriniz"); 
		
		iphone1.model=scan.next();
		char karakter2 = iphone1.model.charAt(0);
		
		while (!Character.isLetter(karakter2) ) {
			
			System.out.print("Geçersiz bir değer girdiniz. Girilen değer rakamlardan oluşmalıdır.");
			System.out.print("Fiyatı Tekrar giriniz");
			iphone1.model =scan.next();
			karakter2 = iphone1.model.charAt(0);
			
		}
		
			//System.out.print("Girdiğiniz Model: "+ iphone1.model);
		
		System.out.println("iPhone un ekran boyutunu giriniz");
 		
		String girilen3 =scan.next();
		  
		char karakter3 = girilen3.charAt(0);
		
		while (!Character.isDigit(karakter3) ) {
			
			System.out.print("Geçersiz bir değer girdiniz. Girilen değer rakamlardan oluşmalıdır.");
			System.out.print("Fiyatı Tekrar giriniz");
			girilen3 =scan.next();
			karakter3 = girilen3.charAt(0);
			
		}
		
		iphone1.ekranBoyutu= Double.parseDouble(girilen3);
		
		//System.out.print("Girdiğiniz Fiyat: "+ iphone1.ekranBoyutu +"  "+"inch");
		
		System.out.print("iPhone1: "+"Fiyat: "+iphone1.fiyat+" Euro" +"; "+"Model: "+iphone1.model+"; "+"Ekran Boyutu: "+iphone1.ekranBoyutu+" inch" );
		
		
		
		
		scan.close();

	}

}
