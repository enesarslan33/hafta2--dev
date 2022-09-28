package ders2;

public class Ders2 {

	public static void main(String[] args) {
		CustomerManager customer=new CustomerManager();
		DortIslem dortislem=new DortIslem();
		int topla=dortislem.Topla(5, 5);
		int cikar=dortislem.Cikar(5, 5);
		int carp=dortislem.Carp(5, 5);
		int bol=dortislem.Bol(5, 5);
		System.out.println("Toplama sonuç: "+topla+" Çıkarma sonuç: "+cikar+" Carpma sonuç: "+carp+" Bölme sonuç: "+bol);
		
		
		sayiBulmaca();
		topla(15, 5);
		topla2(5,6,4,8,7);
		customer.Add();
		customer.Update();
		customer.Remove();
		
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		int[] sayilar=new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		sayilar2=sayilar;
		sayilar[0]=10;
		System.out.println(sayilar[0]=10);
		
	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 3, 5, 9, 0 };
		int aranacaksayi = 5;
		boolean varmi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacaksayi) {
				varmi = true;
				break;
			}
		}
		if (varmi) {
			mesajVer(aranacaksayi);
		} else {
			String mesaj = "sayı mevcut değildir: ";
			System.out.println(mesaj + aranacaksayi);

		}
	}

	public static void mesajVer(int aranacak) {
		System.out.println("sayı mevcuttur: " + aranacak);
		System.out.println("-------------------------------------------------------------");
	}

	public static void ekle() {
		System.out.println("eklendi");
	}

	public static void sil() {
		System.out.println("silindi");
	}

	public static void guncelle() {
		System.out.println("güncellendi");
	}
	
	public static int topla(int sayi1,int sayi2) {
		int sonuc=sayi1+sayi2;
		System.out.println(sonuc);
		return sonuc;
	}
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar)
		{
			toplam+=sayi;
		}
		System.out.println(toplam);
		return toplam;
	}
	

}
