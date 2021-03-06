package com.cg.iter.dao;

import java.util.List;

import com.cg.iter.bean.Student;

public interface StudentDao {

	boolean create(Student stud);

	Student findStudentById(int id);

	Student findStudentByName(String name);

	boolean deleteStudent(int id);

	boolean updateStudent(Student stud);

	List<Student> findAllStudents();

}
