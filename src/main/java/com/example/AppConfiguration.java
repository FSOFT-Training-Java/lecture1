package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {

    @Bean
    @Scope("singleton") //Một đối tượng duy nhất
    // @Scope("prototype") //Nhiều đối tượng khác nhau mỗi lần gọi
    public Employee getEmployee() {
        Employee e = new Employee();
        e.setName("No Name");
        e.setId(0);
        return e;
    }
}
