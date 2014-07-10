package ua.epam.example.springrest;

public class Hello {
	private String user;
	private static String hello = "Hello";
	
	public Hello(String user) {
		this.user = user;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public static String getHello() {
		return hello;
	}

	public static void setHello(String hello) {
		Hello.hello = hello;
	}
	
	

}
