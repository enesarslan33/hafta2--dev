package classesWithAttribute;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager=new ProductManager();
		System.out.println(productManager.topla(5, 8)+productManager.topla(5, 8,13));
		Product product = new Product();
		product.id = 1;
		product.name = "Laptop";
		product.price = 3000;
		product.stockAmount = 3;
		product.description = "Asus Laptop";
		System.out.println(product.name);
		productManager.add(product);
		
		
		product.setId(1);
		product.setDescription("HP Laptop");
		product.setName("Laptop");
	}

}
