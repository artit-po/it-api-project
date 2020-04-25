package com.it.service;

import java.util.List;

import com.it.dto.StudentDto;

public interface StudentService {

	public StudentDto saveStudent(StudentDto studentDto) throws Exception;

	public StudentDto updateStudent(StudentDto studentDto) throws Exception;

	public Integer deleteStudentBySId(Integer sId) throws Exception;

	public List<StudentDto> selectAllStudent() throws Exception;
}
