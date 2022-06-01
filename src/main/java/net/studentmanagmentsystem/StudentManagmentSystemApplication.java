package net.studentmanagmentsystem;

import net.studentmanagmentsystem.entity.Student;
import net.studentmanagmentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}


	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

	/*	Student student1 = new Student("Jan","Kowalski","kowal@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Marek","Nowak","nowak@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Maciej","Burak","burak@gmail.com");
		studentRepository.save(student3);*/
	}
}
