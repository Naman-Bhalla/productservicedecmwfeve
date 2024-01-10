package com.scaler.productservicedecmwfeve.inheritancedemo.mappedsuperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "ms_mentor")
public class Mentor extends User {
//    @Id
//    private Long id;
    private double averageRating;
}
