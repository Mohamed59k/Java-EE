package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String email;// verifier la format @
    private String facebook;
    private String twitter;
    private String linkedIn;
    
    protected User() {}
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public void profile(String email, String facebook, String twitter, String linkedIn) {
        this.email = email;
        this.facebook = facebook;
        this.twitter = twitter;
        this.linkedIn = linkedIn;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public Long getId() {
        return id;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getFacebook(){
        return facebook;
    }
    
    public String getTwitter(){
        return twitter;
    }
    
    public String getLinkedIn(){
        return linkedIn;
    }

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

    /* @Override
     public String toString() {
     return String.format(
     "Customer[id=%d, firstName='%s', lastName='%s']",
     id, firstName, lastName);
     }*/
    
}