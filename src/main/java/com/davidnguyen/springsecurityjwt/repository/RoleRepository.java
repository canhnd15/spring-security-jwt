package com.davidnguyen.springsecurityjwt.repository;

import com.davidnguyen.springsecurityjwt.entity.ERole;
import com.davidnguyen.springsecurityjwt.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(ERole name);
}
