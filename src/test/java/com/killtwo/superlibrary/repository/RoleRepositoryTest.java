package com.killtwo.superlibrary.repository;

import com.killtwo.superlibrary.entity.Role;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;


@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoleRepositoryTest {


    @Autowired
    private RoleRepository roleRepository;

    private static Integer roleId;

    @Test
    public void testAInsert() {
        Role role = new Role();
        role.setRoleName("role");
        role.setDescription("description");
        role.setStatus(0);
        role.setCreateTime(new Date());
        role.setUpdateTime(new Date());
        Role res = roleRepository.save(role);
        assertNotNull(res);
        roleId = res.getRoleId();
    }

    @Test
    public void testBGetByRoleId() {
        Role role = roleRepository.getByRoleId(roleId);
        assertNotNull(role);
    }

    @Test
    public void testCUpdate() {
        Role role = roleRepository.getByRoleId(roleId);
        String description = "role description";
        role.setDescription(description);
        Role res = roleRepository.save(role);
        assertNotNull(res);
        assertEquals(res.getDescription(), description);
    }

    @Test
    public void testDDelete() {
        Role role = roleRepository.getByRoleId(roleId);
        roleRepository.delete(role);
        role = roleRepository.getByRoleId(roleId);
        assertNull(role);
    }


}