package jdbc02;
public class Exam04 {
	private int number;
	private String name;
	private String id;
	private String pass;
	private String email;
	
	public Exam04(int number, String name, String id,
			String pass, String email){
		this.number = number;
		this.name = name;
		this.pass = pass;
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
