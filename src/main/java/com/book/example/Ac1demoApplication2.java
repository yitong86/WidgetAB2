package com.book.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class Ac1demoApplication2 {

	public static void main(String[] args) {

    ConfigurableApplicationContext context =  SpringApplication.run(Ac1demoApplication2.class, args);

    // get the bean from spring container
    //YOUR_CODE_HERE
        Book thebook = context.getBean(Book.class);
    System.out.println("Got The BEAN");
    
    // call a method on the bean to set name of book add Id
    //YOUR_CODE_HERE
    thebook.setId(2);
    thebook.setName("java");
    // print out the name of book set in above code
    System.out.println("BookName="+thebook.getName());

    //registering shutdown hook
    context.registerShutdownHook();
    
    // close the context
    context.close();
    
	}
}
