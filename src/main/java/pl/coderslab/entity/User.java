package pl.coderslab.entity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //private String name;
    //private String surname;
    @Column (name = "username")
    private String userName;
    private String email;
    private String password;
    private int phone;
    //private String roles;
    private boolean active;
    @Column(name="roles")
    private String roles;
    @PrePersist
    public void role(){
        roles ="USER";
    }

//    @OneToMany
//    @JoinColumn(name = "id")
//    private Set<Offer> offers;

}
