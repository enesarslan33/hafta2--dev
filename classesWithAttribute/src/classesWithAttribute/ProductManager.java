package classesWithAttribute;

public class ProductManager {
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public static int topla(int sayi1,int sayi2,int sayi3) {
		return sayi1+sayi2+sayi3;
	}
	public void add(Product product) {
		System.out.println("ürün eklendi"+product.name+product.price);
		
	}
}
