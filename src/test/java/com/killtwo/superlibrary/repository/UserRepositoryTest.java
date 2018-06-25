package com.killtwo.superlibrary.repository;

import com.killtwo.superlibrary.entity.User;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    private static Integer userId;

    @Test
    public void testAInsert() {
        User user = new User();
        user.setUserCode(String.valueOf(12344321));
        user.setUserName("username");
        user.setPassword("password");
        user.setTelephone("13243023321");
        user.setEmail("user@126.com");
        user.setLocked(0);
        user.setDeleteStatus(0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        User res = userRepository.save(user);
        assertNotNull(res);
        userId = res.getUserId();
        assertNotNull(userId);
    }

    @Test
    public void testBGetByUserId() {
        User user = userRepository.getByUserId(userId);
        assertNotNull(user);
    }

    @Test
    public void testCUpdate() {
        User user = userRepository.getByUserId(userId);
        String email = "user@qq.com";
        user.setEmail(email);
        user.setUpdateTime(new Date());
        User res = userRepository.save(user);
        assertNotNull(res);
        assertEquals(res.getEmail(), email);
    }

    @Test
    public void testDDelete() {
        User user = userRepository.getByUserId(userId);
        userRepository.delete(user);
        user = userRepository.getByUserId(userId);
        assertNull(user);
    }



}