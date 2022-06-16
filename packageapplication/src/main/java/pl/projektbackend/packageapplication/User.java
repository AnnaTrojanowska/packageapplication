package pl.projektbackend.packageapplication;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsers;

    @Column(nullable = false, unique = true,length = 45)
    private String login;
    @Column(nullable = false, length = 45)
    private String password;
    @Column(nullable = false, unique = true, length = 45)
    private String email;

}
