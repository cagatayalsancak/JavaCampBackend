package GameProject.entities;

public class Campaign extends Product {
	
	private int id;
	private String name;
	private double discountRatio;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String name, double discountRatio) {
		super();
		this.id = id;
		this.name = name;
		this.discountRatio = discountRatio;
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

	public double getDiscountRatio() {
		return discountRatio;
	}

	public void setDiscountRatio(double discountRatio) {
		this.discountRatio = discountRatio;
	}
	

}
