package retail;

import java.util.Collection;
import java.util.Map;

public class ItemCart {
	
	private Map<Product,Integer> items;

	/**
	 * @return the items
	 */
	public Map<Product, Integer> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Map<Product, Integer> items) {
		this.items = items;
	}

	public ItemCart(Map<Product, Integer> items) {
		super();
		this.items = items;
	}
	
	
	
	//private Integer itemQuantity;
	
	

	

}
