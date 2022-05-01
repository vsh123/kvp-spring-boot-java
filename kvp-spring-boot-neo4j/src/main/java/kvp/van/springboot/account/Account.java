package kvp.van.springboot.account;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.HashSet;
import java.util.Set;

@Node
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String email;
    private Set<Role> roles = new HashSet<>();

    public Account() {
    }

    public Account(String username, String email) {
        this.username = username;
        this.email = email;
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

    public void addRole(Role role) {
        roles.add(role);
    }
}
