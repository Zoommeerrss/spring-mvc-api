package com.javatpoint.presentation.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
@ToString
public class PersonResponse {

    @JsonProperty("personId")
    private String personId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("year")
    private Integer year;

    @JsonProperty("age")
    private Integer age;
}
