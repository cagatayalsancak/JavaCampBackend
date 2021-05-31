package GameProject.entities;

public class Game extends Product {
	
	private int id;
	private String name;
	private Category categoryId;
	
	public Game() {
		
	}

	public Game(int id, String name, Category categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}
	
	
	
	
}
