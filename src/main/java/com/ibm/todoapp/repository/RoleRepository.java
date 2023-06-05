package com.ibm.todoapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.todoapp.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, String> {

}