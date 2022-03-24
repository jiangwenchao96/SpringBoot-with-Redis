package net.zdsoft.redisdemo;

import net.zdsoft.redisdemo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisDemoApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void test1() {
        redisTemplate.opsForValue().set("name", "jiangwenchao");
        System.out.println(redisTemplate.opsForValue().get("name"));
    }

    @Test
    void test2() {
        User user = new User("李四",3);
        redisTemplate.opsForValue().set("lisi",user);
    }

}
