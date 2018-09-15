package retail;

public class Product {
	
	private String name;
	
	private ProductType productType;
	
	private Double price;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the itemType
	 */
	public ProductType geProductType() {
		return productType;
	}

	/**
	 * @param itemType the itemType to set
	 */
	public void setProdutType(ProductType productType) {
		this.productType = productType;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	public Product(String name, ProductType productType, Double price) {
		super();
		this.name = name;
		this.productType = productType;
		this.price = price;
	}
	
	
	
	

}
