package GameProject.business;

import GameProject.entities.Product;

public class ProductManager implements ProductService {

	@Override
	public void add(Product product) {
		System.out.println("�r�n eklendi : " + product.getName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("�r�n g�ncellendi : " + product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("�r�n silindi : " + product.getName());
		
	}

}
