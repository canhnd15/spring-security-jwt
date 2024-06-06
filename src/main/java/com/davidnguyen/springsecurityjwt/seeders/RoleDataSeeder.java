package com.davidnguyen.springsecurityjwt.seeders;

import com.davidnguyen.springsecurityjwt.entity.ERole;
import com.davidnguyen.springsecurityjwt.entity.Role;
import com.davidnguyen.springsecurityjwt.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Component
public class RoleDataSeeder {
    @Autowired
    private RoleRepository roleRepository;

    @EventListener
    @Transactional
    public void LoadRoles(ContextRefreshedEvent event) {

        List<ERole> roles = Arrays.stream(ERole.values()).toList();

        for(ERole erole: roles) {
            if (roleRepository.findByName(erole)==null) {
                roleRepository.save(new Role(erole));
            }
        }

    }
}
