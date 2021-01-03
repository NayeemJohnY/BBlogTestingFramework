package beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
public class User {
	
	private String email;
	@JsonIgnore
	private String token;
	private String  username;
	@JsonIgnore
	private String bio;
	@JsonIgnore
	private String image;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String username,String email,String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}
	
	public User(String email,String password) {
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", token=" + token + ", username=" + username + ", bio=" + bio + ", image="
				+ image + "]";
	}
	
}
