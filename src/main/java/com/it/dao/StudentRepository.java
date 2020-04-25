package com.it.dao;

import org.springframework.data.repository.CrudRepository;

import com.it.entity.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer>{

}
