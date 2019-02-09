package net.yevgenter.spring.sample2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("prototype")
    public Car car(){
        return new Car ("BMW" , 2013);
    }

}
