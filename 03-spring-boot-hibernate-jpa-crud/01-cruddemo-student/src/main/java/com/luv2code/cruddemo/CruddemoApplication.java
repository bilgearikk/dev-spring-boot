package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			// createStudent(studentDAO);
			 createMultipleStudents(studentDAO);
			// readStudent(studentDAO);
			// queryForStudents(studentDAO);
			// queryForStudentsByLastName(studentDAO);
			// updateStudent(studentDAO);
			// deleteStudent(studentDAO);
			//   deleteAllStudent(studentDAO);
		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: " + numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 2;
		System.out.println("Deleting student id: " + studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {

		// retriev student based on the id: primary key
		int studentId = 4;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		// change first name
		System.out.println("Updating student...");
		myStudent.setLastName("Topak");

		// update the student
		studentDAO.update(myStudent);

		// display the updated student
		System.out.println("Updated student: "+ myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		// create multiple student
		System.out.println("Creating new student object...");
		Student tempStudent1 = new Student("Bilge","Arik","bilge@gmail");
		Student tempStudent2 = new Student("Asli","Arik","asli@gmail");
		Student tempStudent3 = new Student("Özlem","Arik","ozlem@gmail");

		// save the student object
		System.out.println("Saving 3 the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void readStudent(StudentDAO studentDAO) {

		// create a student object
		System.out.println("Creating student...");
		Student student = new Student("Hatice", "Metin", "hatice@gmail");

		// save the student
		System.out.println("Saving the student..");
		studentDAO.save(student);

		// display id of the saved student
		System.out.println("Saved student. Generated Id: " + student.getId());

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student with id: " + student.getId());
		Student myStudent = studentDAO.findById(student.getId());

		// display  student
		System.out.println("Found the student: " + myStudent);
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Yigit","Unlu","emre@gmail");

		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);


		// display id of the saved student
		System.out.println("Saved the student. Generated id: "+ tempStudent.getId());
	}

	private void queryForStudents(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for(Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Metin");

		// display list of students
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}
}
