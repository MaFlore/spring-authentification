package com.example.auth.serviceImpl;

import com.example.auth.model.Role;
import com.example.auth.repository.RoleRepository;
import com.example.auth.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role saveRole(Role role) {
        return this.roleRepository.save(role);
    }

    @Override
    public Role getRole(String nom) {
        return this.roleRepository.findByNom(nom);
    }

    @Override
    public List<Role> getRoles() {
        return this.roleRepository.findAll();
    }

}
