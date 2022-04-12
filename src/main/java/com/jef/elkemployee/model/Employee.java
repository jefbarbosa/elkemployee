package com.jef.elkemployee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "employee_index")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private String id;

    private String firstName;

    @Field(type = FieldType.Text, name="lastName")
    private String lastName;

    @Field(type = FieldType.Integer, name="age")
    private Integer age;

    private String state;

    private String city;

    public Employee(String firstName, String lastName, Integer age, String state, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.state = state;
        this.city = city;
    }
}
