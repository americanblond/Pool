package com.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.Jedis;

/**
 * Created by isologub on 7/31/2017.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

//        Jedis jedis = new Jedis("localhost");
//        System.out.println("Jedis info :    " + jedis.info());


    }
}
