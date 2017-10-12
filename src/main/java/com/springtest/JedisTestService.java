package com.springtest;

import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

/**
 * Created by isologub on 9/26/2017.
 */
@Service
public class JedisTestService {

    private Jedis jedis = new Jedis("localhost");

    public String get(String key){

        return jedis.get(key);
    }

}
