package me.gabreuw.amigoscode.springbootcourse.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Serializable {

    private Long id;

    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

}
