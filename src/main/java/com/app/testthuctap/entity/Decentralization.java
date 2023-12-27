package com.app.testthuctap.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "decentralization")
@Data
public class Decentralization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long decentralizationId;

    @Column(nullable = false,unique = true)
    private String authorityName;


    @OneToMany(mappedBy = "decentralizationMap")
    @JsonIgnoreProperties(value = "decentralizationMap")
    private Set<User> userS;

}
