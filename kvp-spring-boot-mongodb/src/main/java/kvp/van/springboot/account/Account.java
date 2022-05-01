package kvp.van.springboot.account;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "accounts")
public class Account {
    private String id;
    private String username;
    private String email;

    public Account() {
    }

    public Account(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
