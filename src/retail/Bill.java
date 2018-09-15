package retail;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bill {
	
	private User user;
	
	private ItemCart itemCart;
	
	

	public Bill(User user, ItemCart itemCart) {
		super();
		this.user = user;
		this.itemCart = itemCart;
	}



	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}



	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}



	/**
	 * @return the itemCart
	 */
	public ItemCart getItemCart() {
		return itemCart;
	}



	/**
	 * @param itemCart the itemCart to set
	 */
	public void setItemCart(ItemCart itemCart) {
		this.itemCart = itemCart;
	}
	

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, 23);			
		User user = new User("Rincy",UserType.EMPLOYEE, cal);			
		
		Map itemMap = new HashMap<Product,Integer>();
		itemMap.put((new Product("Paste",ProductType.NONGROCERY,new Double(100.0))), new Integer(2));
		
		ItemCart itemCart = new ItemCart(itemMap);
		
		Bill bill = new Bill(user,itemCart);		
		Double netAmount = bill.calculateNetAmount(bill);
		
		System.out.println("netAmount "+netAmount);
		
	}
	
	public Double calculateNetAmount(Bill bill) {
		
		User user = bill.getUser();
		
		ItemCart itemCart = bill.getItemCart();
		
		Double netAmount = new Double(0);
		
		Double grossAmount = new Double(0);
		
		double discountPercentage = 0.0;
		
		if(user.getUserType().equals(UserType.EMPLOYEE)) {
			discountPercentage = (double)30/100;
		} else if(user.getUserType().equals(UserType.AFFLIATED)) {
			discountPercentage = (double)10/100;
		} else {
				
			Calendar currentDate = Calendar.getInstance();
			double diffInMillis = currentDate.getTimeInMillis() - user.getJoiningDate().getTimeInMillis();
			double timeDiffInSec = diffInMillis/1000;
			
			double timeDiffInMin = timeDiffInSec/60;		
			double timeDiffInHours = timeDiffInMin/60;
			double timeDiffInDays = timeDiffInHours/24;		
			double timeDiffInYears = timeDiffInDays/365;
			
			if(timeDiffInYears > 2) {
				discountPercentage = (double)5/100;
			}
		}

		System.out.println(discountPercentage);
		Map items = itemCart.getItems();
		
		Set<Product> products = items.keySet();
		
		for(Product product : products) {
			
			Integer itemQuantity = (Integer)items.get(product);
			double itemPrice = 0;
			double discountAmount = 0;
			double netItemPrice = 0;
			if(product.geProductType().equals(ProductType.NONGROCERY)) {
				itemPrice = itemQuantity * product.getPrice();
				discountAmount = itemPrice *discountPercentage;
				netItemPrice = itemPrice - discountAmount;				
				grossAmount = grossAmount + netItemPrice;
			}
			else {				
				itemPrice = itemQuantity * product.getPrice();
				grossAmount = grossAmount + itemPrice;
			}
		}
		
		if (grossAmount > 100) {
			int mod = (int) (grossAmount/100);
			netAmount = grossAmount - mod*5;
		} else {		
			netAmount = grossAmount;
		}
		
		return netAmount;
		
	}
	
	

}
