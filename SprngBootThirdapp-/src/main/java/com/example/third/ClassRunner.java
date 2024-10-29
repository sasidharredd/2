package com.example.third;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class ClassRunner implements CommandLineRunner{
	@Autowired
	Databaseconn conn;
	@Override
	public void run(String... args) throws Exception {
System.out.println(conn);		
	}

}
