package com.it.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.dto.StudentDto;
import com.it.service.StudentService;

@RestController
public class ItApiController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/ping")
	public ResponseEntity<String> ping(){
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
	
	@PostMapping("/student/save")
	public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentDto studentDto){
		//wait for service
		return new ResponseEntity<StudentDto>(studentDto, HttpStatus.OK);
	}
	
	@PostMapping("/student/update")
	public ResponseEntity<StudentDto> updateStudent(@RequestBody StudentDto studentDto){
		//wait for service
		return new ResponseEntity<StudentDto>(studentDto, HttpStatus.OK);
	}
	
	@DeleteMapping("/student/{sId}")
	public ResponseEntity<Integer> deleteStudentBySId(@PathVariable Integer sId){
		//wait for service		
		return new ResponseEntity<Integer>(sId, HttpStatus.OK);		
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<StudentDto>> getAllStudent() throws Exception{
		List<StudentDto> response = studentService.selectAllStudent();
		return new ResponseEntity<List<StudentDto>>(response, HttpStatus.OK);
	}
	
	
}
