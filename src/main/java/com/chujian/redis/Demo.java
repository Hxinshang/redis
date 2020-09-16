package com.chujian.redis;

import redis.clients.jedis.Jedis;

/**
 * @author chujian
 * @create 2020-09-15 21:50
 */
public class Demo {
    public static void main(String[] args) {

        //1、创建一个redis的客户端
        Jedis jedis = new Jedis("192.168.1.200", 6379);

        //2、使用客户端进行各种操作
//        jedis.set("k1","v1");
//        jedis.set("name","李四");

//        jedis.lpush("list1","a","b","c");
//        List<String> list = jedis.lrange("list", 0, -1);
//        for (String s : list) {
//            System.out.println(s);
//        }
        //3、关闭客户端
        jedis.close();


    }

}
