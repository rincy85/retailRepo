/**
 * 
 */
package retail;

import java.util.Calendar;

/**
 * @author S00192
 *
 */
public class User {
	
	private String userName ;
	
	private UserType userType;
	
	private Calendar joiningDate;
	
	

	public User(String userName, UserType userType, Calendar joiningDate) {
		super();
		this.userName = userName;
		this.userType = userType;
		this.joiningDate = joiningDate;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userType
	 */
	public UserType getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	/**
	 * @return the joiningDate
	 */
	public Calendar getJoiningDate() {
		return joiningDate;
	}

	/**
	 * @param joiningDate the joiningDate to set
	 */
	public void setJoiningDate(Calendar joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	
	
	

}
