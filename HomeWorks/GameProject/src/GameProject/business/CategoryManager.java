package GameProject.business;

import GameProject.entities.Category;

public class CategoryManager implements CategoryService {

	@Override
	public void add(Category category) {
		System.out.println("Kategori Eklendi : " + category.getName());
		
	}

	@Override
	public void update(Category category) {
		
		System.out.println("Kategori güncellendi : " + category.getName() + " : " + category.getDescription());
	
	}

	@Override
	public void delete(Category category) {
		System.out.println("Kategori silindi : " + category.getName());
		
	}

}
