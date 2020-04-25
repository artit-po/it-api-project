package com.it.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dao.StudentRepository;
import com.it.dto.StudentDto;
import com.it.entity.StudentEntity;
import com.it.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public StudentDto saveStudent(StudentDto studentDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDto updateStudent(StudentDto studentDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteStudentBySId(Integer sId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDto> selectAllStudent() throws Exception {
		List<StudentDto> students = new ArrayList<>();
		List<StudentEntity> entities = (List<StudentEntity>) studentRepository.findAll();
		if (entities != null) {
			students = entities.stream()
					.map(entity -> convertEntityToDto(entity))
					.collect(Collectors.toList());
		}
		return students;
	}
	
	private StudentDto convertEntityToDto(StudentEntity entity) {
		StudentDto dto = new StudentDto();
		if (entity != null) {
			dto.setsId(entity.getsId());
			dto.setCitizen(entity.getCitizen());
			dto.setPrefix(entity.getPrefix());
			dto.setName(entity.getName());
			dto.setLastName(entity.getLastName());
			dto.setNickName(entity.getNickName());
			dto.setGender(entity.getGender());
			dto.setPhone(entity.getPhone());
			dto.setEmail(entity.getEmail());
			dto.setFacebook(entity.getFacebook());
			dto.setLine(entity.getLine());			
		}
		return dto;		
	}

}
