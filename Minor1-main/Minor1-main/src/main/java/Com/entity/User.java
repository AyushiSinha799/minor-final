package Com.entity;

public class User {
  
	private int id;
	private String name;
	private String Email;
	private String Password;
	private String qualification;
	private String role;
	
	public User(String name, String email, String password, String qualification, String role) {
		super();
		this.name = name;
		Email = email;
		Password = password;
		this.qualification = qualification;
		this.role = role;
	}
	public User() {
		super();
		
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
