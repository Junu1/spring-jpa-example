package com.example.jpa.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;
    @Column(name = "name", length = 50, nullable = false)
    private String departmentName;
    @Column(name = "address", length = 255, nullable = false)
    private String departmentAddress;
    @Column(name = "code", length = 200, nullable = false)
    private String departmentCode;
}