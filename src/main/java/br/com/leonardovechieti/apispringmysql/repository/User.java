package br.com.leonardovechieti.apispringmysql.repository;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "user")
public class User {
    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    private Long id;

    @Column(name = "token")
    private String token;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    @Column(name = "modified")
    private LocalDateTime modified;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true, nullable = false, columnDefinition = "varchar(255)")
    private String email;

    @Column(name = "password", nullable = false)
    private String password;
}
