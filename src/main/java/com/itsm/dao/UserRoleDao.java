package com.itsm.dao;

import com.itsm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
