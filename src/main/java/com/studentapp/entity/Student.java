package com.studentapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {
    @Id
    private long id;
    private String name;
    private String address;
    private double salary;
}
