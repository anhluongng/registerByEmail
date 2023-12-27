package com.app.testthuctap.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String email;

    private String password;

    private boolean isEnabled;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "decentralizationId")
    @JsonIgnoreProperties(value = "userS")
    private Decentralization decentralizationMap;

}
