package com.example.Day36;

import java.util.List;
import java.util.Optional;

import org.checkerframework.checker.nullness.Opt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	private StudentRepository stud;
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		return stud.findAll();
	}
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable("id") Integer studId) {
		Optional<Student> st = stud.findById(studId);
		Student s1 = st.get();
		return s1;
	}
	
	@PostMapping("/save")
	public Student createStudent(@RequestBody Student st) {
		return stud.save(st);
	}
	
	@PutMapping("/updateStud/{id}")
	public Boolean updateEmployee(@PathVariable(value="id") Integer studId , @RequestBody Student studDetails) throws Exception{
		boolean f = true;
		try {
			Optional<Student> op = stud.findById(studId);
			Student st = op.get();
			st.setName(studDetails.getName());
			final Student updatedStudent = stud.save(st);
		} catch (Exception e) {
			f =false;
			// TODO: handle exception
		}
		return f;
	}
	
	@DeleteMapping("/deleteStud/{id}")
	public Boolean deleteStudent(@PathVariable(value = "id") Integer studId, @RequestBody Student studDetails) throws Exception{
		boolean f = true;
		try {
			Optional<Student> op = stud.findById(studId);
			Student st = op.get();
			stud.delete(st);
		} catch (Exception e) {
			f =false;
			// TODO: handle exception
		}
		return f;
	}
}
