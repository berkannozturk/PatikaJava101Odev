import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
	
		
		int matematik, fizik, kimya, türkçe, tarih, müzik ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Mat notunuzu giriniz : ");
		matematik = scan.nextInt();
		System.out.print("Fizik notunuzu giriniz : ");
		fizik = scan.nextInt();
		System.out.print("Türkce notunuzu giriniz : ");
		kimya = scan.nextInt();
		System.out.print("Tarih notunuzu giriniz : ");
		tarih = scan.nextInt();
		System.out.print("Müzik notunuzu giriniz : ");
		müzik = scan.nextInt();
		
		
		double sonuc = (matematik+fizik+kimya+tarih+müzik)/5.0;
		
		boolean kosul = sonuc >= 60;
        String gectiMi = kosul ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(gectiMi);
		
		
		
				
		
		
		
		

	}

}
