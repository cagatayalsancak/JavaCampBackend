package GameProject.business;

import GameProject.entities.Category;

public class CategoryManager implements CategoryService {

	@Override
	public void add(Category category) {
		System.out.println("Kategori Eklendi : " + category.getName());
		
	}

	@Override
	public void update(Category category, Category newCategory) {
		
		if(category.getId() == newCategory.getId()) {
		category.setName(newCategory.getName());
		category.setDescription(newCategory.getDescription());
		System.out.println("Kategori güncellendi : " + newCategory.getName() + " : " + newCategory.getDescription());
		} else {
			System.out.println("Güncellemek istediðiniz kategoriyi seçin.");
		}
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Kategori silindi : " + category.getName());
		
	}

}
