package GameProject.business;

import GameProject.entities.Category;

public interface CategoryService {
	void add(Category category);
	void update(Category category, Category newCategory);
	void delete(Category category);
}
