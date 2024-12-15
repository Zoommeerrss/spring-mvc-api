package com.javatpoint.presentation.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Data<T> {

    @JsonProperty("data")
    private T data;
}
