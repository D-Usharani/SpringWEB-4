package com.example.springstudentdb.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.springstudentdb.data.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>
{

    Student findById( int id );

}
