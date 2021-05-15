package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM", 10);
		
		Product product2 = new Product();	
		product2.setId(1);
		product2.setName("Lenovo V15");
		product2.setUnitPrice(18000);
		product2.setDetail("32 GB Ram");
		product2.setDiscount(20);
		
		
		
		Product[] products = {product1, product2};
		
		for (Product product : products) {
			
			System.out.println(product.getName() + " adlý ürünün indirimli fiyatý " + product.getUnitPriceAfterDiscount());
		}
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Tablet");
		
		Category[] categories = {category1, category2};
		
		for (Category category : categories) {
			
			System.out.println(category.getId() + " - " + category.getName());
		}
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		
	}

}



















