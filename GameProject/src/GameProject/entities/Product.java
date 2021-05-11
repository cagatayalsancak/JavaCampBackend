package GameProject.entities;

public class Product {
	private int id;
	private String name;
	private double unitPrice;
	Campaign discountRatio;
	double unitPriceAfterDiscount;
	private Category categoryId;
	
	public Product() {
		
	}

	public Product(int id, String name, double unitPrice, Category categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.setCategoryId(categoryId);
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Campaign getCampaignDiscountRatio() {
		
		return discountRatio;
	}

	public void setCampaignDiscountRatio(Campaign discountRatio) {
		
		this.discountRatio = discountRatio;
	}

	public double getUnitPriceAfterDiscount() {
		unitPrice = unitPrice - (unitPrice * discountRatio.getDiscountRatio() / 100); 
		return unitPrice;
	}
	
	
}
