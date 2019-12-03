package com.redis;

import redis.clients.jedis.Jedis;

public class Redis {
    
    public static void main(String[] args) {
	flush();
    }

    public static void flush() {
	String host = "s-ab-r-0001-001.aelcbq.0001.aps1.cache.amazonaws.com";
	Jedis jedis = new Jedis(host, 6379);
	System.out.println(jedis.ping());
	String flushAll = jedis.flushAll();
	System.out.println("Redis Flushed: " + flushAll + " @ host = " + host);
	jedis.close();
    }

}
