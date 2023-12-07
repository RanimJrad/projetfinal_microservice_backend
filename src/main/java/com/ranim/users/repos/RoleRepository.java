package com.ranim.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranim.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);
}
