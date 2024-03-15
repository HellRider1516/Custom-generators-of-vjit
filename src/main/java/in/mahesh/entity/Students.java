package in.mahesh.entity;

import java.time.LocalDate;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Students {
	@Id
	@GeneratedValue(generator = "orderId")
	@GenericGenerator(name="orderId",strategy = "in.mahesh.custom.StudentCustom")
	private String id;
	private String name;
	private String course;
	private String dept;
	private LocalDate DOB;
	public Students(String name,String course, String dept, LocalDate dOB) {
		super();
		this.name=name;
		this.course = course;
		this.dept = dept;
		DOB = dOB;
	}
	
	
	

}
