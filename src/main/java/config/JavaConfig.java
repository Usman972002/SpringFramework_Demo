package config;

import com.spring.Alien;
import com.spring.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.spring")  // Instead of Creating these objects Manually , Spring Automatically does this for us.
public class JavaConfig {

//    @Bean(name = "lap1")
//    @Scope("prototype")
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }

//    @Bean
//    public Alien alien(@Autowired Laptop laptop){
//        Alien alien = new Alien();
//        alien.setLap(laptop);
//        return alien;
//    }

}
