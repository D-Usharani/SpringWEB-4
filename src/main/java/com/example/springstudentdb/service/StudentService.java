package com.example.springstudentdb.service;

import com.example.springstudentdb.data.entity.Student;

public interface StudentService {

	
	 Iterable<Student> all();

	    Student get( int studentId );

	    Student save( Student student );

	    void delete( int studentId );

}
