package aunth.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String password;

    @Transient
    private String passwordConfirm;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
