package GameProject.entities;

public class Product {
	private int id;
	private String name;
	private double unitPrice;
	Campaign discountRatio;
	double unitPriceAfterDiscount;
	
	public Product() {
		
	}

	public Product(int id, String name, double unitPrice, Category categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Campaign getCampaignDiscountRatio() {
		
		return this.discountRatio;
	}

	public void setCampaignDiscountRatio(Campaign discountRatio) {
		
		this.discountRatio = discountRatio;
	}

	public double getUnitPriceAfterDiscount() {
		if(discountRatio.getDiscountRatio() > 0) {
		return unitPrice - (unitPrice * this.discountRatio.getDiscountRatio() / 100);
		}
		return unitPrice - discountRatio.getDiscountRatio();
	}
	
	
}
