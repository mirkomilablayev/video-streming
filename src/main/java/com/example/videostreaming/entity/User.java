package com.example.videostreaming.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name =  "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    @ManyToMany
    private Set<UserRole> userRoles;
    @ManyToOne
    private File userLogo;
}
