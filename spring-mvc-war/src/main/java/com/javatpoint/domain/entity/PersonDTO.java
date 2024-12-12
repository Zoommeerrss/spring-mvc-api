package com.javatpoint.domain.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
@ToString
public class PersonDTO {

    private String personId;


    private String name;


    private Integer year;


    private Integer age;
}
