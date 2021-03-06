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
		if (studentDto != null) {
			StudentEntity entity = convertDtoToEntit(studentDto);
			studentRepository.save(entity);
		} else {
			throw new NullPointerException("saveStudent :: StudentDto is Null!");
		}
		return studentDto;
	}

	@Override
	public StudentDto updateStudent(StudentDto studentDto) throws Exception {
		if (studentDto != null && studentDto.getsId() > 0) {
			StudentEntity entity = convertDtoToEntit(studentDto);
			studentRepository.save(entity);
		} else {
			throw new NullPointerException("updateStudent :: StudentDto is Null or SId < 0 !");
		}
		return studentDto;
	}

	@Override
	public Integer deleteStudentBySId(Integer sId) throws Exception {
		if (sId > 0) {
			studentRepository.deleteById(sId);
		} else {
			throw new NullPointerException("deleteStudentBySId :: sId < 0 ! ");
		}
		return sId;
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
	
	private StudentEntity convertDtoToEntit(StudentDto dto) {
		StudentEntity entity = new StudentEntity();
		if (dto != null) {
			entity.setsId(dto.getsId());
			entity.setCitizen(dto.getCitizen());
			entity.setPrefix(dto.getPrefix());
			entity.setName(dto.getName());
			entity.setLastName(dto.getLastName());
			entity.setNickName(dto.getNickName());
			entity.setGender(dto.getGender());
			entity.setPhone(dto.getPhone());
			entity.setEmail(dto.getEmail());
			entity.setFacebook(dto.getFacebook());
			entity.setLine(dto.getLine());			
		}
		return entity;		
	}

	@Override
	public StudentDto getStudentBySId(Integer sId) throws Exception {
		StudentDto student = new StudentDto();
		if (sId > 0) {
			StudentEntity entity = studentRepository.findById(sId).get();
			if (entity != null) {
				student = convertEntityToDto(entity);
			}
		} else {
			throw new NullPointerException("getStudentBySId :: sId < 0! ");
		}
		return student;
	}

}
