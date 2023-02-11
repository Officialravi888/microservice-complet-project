package com.example.microservice_project.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "micro_users")
public class User {
    @Id
    @Column(name = "ID")
    private String userId;
    @Column(name = "NAME", length = 20)
    private String name;
    @Column(name = "EMAIl")
    private String email;
    @Column(name = "ABOUT")
    private String about;

    @Transient
    private List<Rating> ratingList=new ArrayList<>();
}
