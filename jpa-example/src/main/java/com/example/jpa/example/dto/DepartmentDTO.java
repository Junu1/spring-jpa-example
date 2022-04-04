package com.example.jpa.example.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DepartmentDTO {
    private Integer departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
