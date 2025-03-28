package ex04;

public class User {
	private String userId;
	private String userName;
	private String userAddress;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	
	@Override
	public String toString() {
		return "[userId = " + userId + "\tuserName = " + userName + "\tuserAddress = " + userAddress + "]";
	}
}
/*
public String toString() {
return "User [\n\tuserId = " + userId + "\n\tuserName = " + userName + "\n\tuserAddress = " + userAddress + "\n\t]";
}
*/