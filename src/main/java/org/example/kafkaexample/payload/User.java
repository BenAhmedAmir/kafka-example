package org.example.kafkaexample.payload;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private String id;
    private String name;
    private Integer age;
}
