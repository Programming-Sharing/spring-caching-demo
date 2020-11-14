package com.programmingsharing.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import com.programmingsharing.demo.services.BookService;

@SpringBootApplication
@EnableCaching
public class SpringCachingDemoApplication implements CommandLineRunner{
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringCachingDemoApplication.class);

	@Autowired
	private BookService bookService;
	
	@Autowired
	private ConfigurableApplicationContext applicationContext;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCachingDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		LOGGER.info(bookService.findBook("0134685997").toString());
		LOGGER.info(bookService.findBook("0134685997").toString());
		LOGGER.info(bookService.findBook("0134685997").toString());
		LOGGER.info(bookService.findBook("0134685997").toString());
		
		applicationContext.close();
	}

}
