package retail;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class BillTest {

	@Test
	public void testGroceryEmployee() {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, 23);			
		User user = new User("Rincy",UserType.EMPLOYEE, cal);			
		
		Map itemMap = new HashMap<Product,Integer>();
		itemMap.put((new Product("Paste",ProductType.GROCERY,new Double(100.0))), new Integer(2));
		
		ItemCart itemCart = new ItemCart(itemMap);
		
		Bill bill = new Bill(user,itemCart);		
		Double netAmount = bill.calculateNetAmount(bill);
		
		System.out.println("Grocery netAmount "+netAmount);
	}
	
	@Test
	public void testMultipleItemsEmployee() {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, 23);			
		User user = new User("Rincy",UserType.EMPLOYEE, cal);			
		
		Map itemMap = new HashMap<Product,Integer>();
		itemMap.put((new Product("IronBox",ProductType.NONGROCERY,new Double(500.0))), new Integer(2));
		itemMap.put((new Product("Milk",ProductType.GROCERY,new Double(10.0))), new Integer(1));
		itemMap.put((new Product("Carrot",ProductType.GROCERY,new Double(10.0))), new Integer(2));
		
		ItemCart itemCart = new ItemCart(itemMap);
		
		Bill bill = new Bill(user,itemCart);		
		Double netAmount = bill.calculateNetAmount(bill);
		
		System.out.println("Grocery netAmount "+netAmount);
	}
	
	@Test
	public void testNonGroceryEmployee() {
		
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
		
		System.out.println("Non Grocery netAmount "+netAmount);
	}
	
	@Test
	public void testGroceryAffiliated() {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, 23);			
		User user = new User("Rincy",UserType.AFFLIATED, cal);			
		
		Map itemMap = new HashMap<Product,Integer>();
		itemMap.put((new Product("Paste",ProductType.GROCERY,new Double(100.0))), new Integer(2));
		
		ItemCart itemCart = new ItemCart(itemMap);
		
		Bill bill = new Bill(user,itemCart);		
		Double netAmount = bill.calculateNetAmount(bill);
		
		System.out.println("Grocery netAmount "+netAmount);
	}
	
	@Test
	public void testNonGroceryAffiliated() {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, 23);			
		User user = new User("Rincy",UserType.AFFLIATED, cal);			
		
		Map itemMap = new HashMap<Product,Integer>();
		itemMap.put((new Product("Paste",ProductType.NONGROCERY,new Double(100.0))), new Integer(2));
		
		ItemCart itemCart = new ItemCart(itemMap);
		
		Bill bill = new Bill(user,itemCart);		
		Double netAmount = bill.calculateNetAmount(bill);
		
		System.out.println("Non Grocery netAmount "+netAmount);
	}
	
	@Test
	public void testJoiningDateNonGrocery() {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, 23);			
		User user = new User("Rincy",UserType.NORMAL, cal);			
		
		Map itemMap = new HashMap<Product,Integer>();
		itemMap.put((new Product("Paste",ProductType.NONGROCERY,new Double(100.0))), new Integer(2));
		
		ItemCart itemCart = new ItemCart(itemMap);
		
		Bill bill = new Bill(user,itemCart);		
		Double netAmount = bill.calculateNetAmount(bill);
		
		System.out.println("netAmount "+netAmount);
	}
	
	@Test
	public void testJoiningDateGrocery() {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH, 23);			
		User user = new User("Rincy",UserType.NORMAL, cal);			
		
		Map itemMap = new HashMap<Product,Integer>();
		itemMap.put((new Product("Paste",ProductType.GROCERY,new Double(100.0))), new Integer(2));
		
		ItemCart itemCart = new ItemCart(itemMap);
		
		Bill bill = new Bill(user,itemCart);		
		Double netAmount = bill.calculateNetAmount(bill);
		
		System.out.println("netAmount "+netAmount);
	}

}
