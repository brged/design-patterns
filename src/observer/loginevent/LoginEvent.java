package observer.loginevent;

import java.util.EventObject;

public class LoginEvent extends EventObject {
	
	private String userName;
	private String password;

	public LoginEvent(Object source, String userName, String password) {
		super(source);
		this.userName=userName;
		this.password=password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
