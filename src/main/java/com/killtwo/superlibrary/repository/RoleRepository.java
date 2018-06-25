package com.killtwo.superlibrary.repository;

import com.killtwo.superlibrary.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role getByRoleId(Integer roleId);
}
