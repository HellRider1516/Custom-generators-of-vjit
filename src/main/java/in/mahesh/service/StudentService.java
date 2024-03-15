package in.mahesh.service;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import in.mahesh.Repo.StudentRepo;
import in.mahesh.entity.Students;

@Service
public class StudentService {
	private StudentRepo studentRepo;

	public StudentService(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}
	public void studentSaveAll() {
		Students s1=new Students("Rajesh","physic","ECE",LocalDate.of(2000, 2, 2));
		Students s2=new Students("balu","maths","ECE",LocalDate.of(2000, 2, 3));
		Students s3=new Students("kawshik","java","CSE",LocalDate.of(2000, 2, 3));
		Students s4=new Students("satish","HTML","CSE",LocalDate.of(2000, 2, 4));
		studentRepo.saveAll(Arrays.asList(s1,s2,s3,s4));
		System.out.println("Sucessfully.......");
	}

}
