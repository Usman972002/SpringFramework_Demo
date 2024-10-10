package com.spring;

import config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Alien alien = context.getBean(Alien.class);
        alien.code();

//        This is for Normal Call Of the Bean
//         Laptop lap = context.getBean(Laptop.class);
//         lap.Compile();



//        This is for Calling with the name of the method inside the class
//        Laptop lap = context.getBean("laptop", Laptop.class);
//        lap.Compile();




//        This is for calling the bean using bean name
//        Laptop lap = context.getBean("lap1", Laptop.class);
//        lap.Compile();





//        When this is called 2 times and the bean
//        that is getting called has the @Scope("prototype")
//        annotation , it will create multiple objects
//        for the same bean

//         Laptop lap = context.getBean(Laptop.class);
//         lap.Compile();
//
//        Laptop lap1 = context.getBean(Laptop.class);
//        lap1.Compile();


//        THis is for @Autowired , I am calling Alien class
//        inside which it is internally calling laptop object
//        Alien alien = context.getBean(Alien.class);
//        alien.code();






//        This is for XML based Configuration

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = (Alien) context.getBean("alien");
//        obj.code();
//        System.out.println(obj.getAge());

//        This is for prototype scope
//        Alien obj1 = (Alien) context.getBean("alien");
//        obj1.code();
    }
}
