package in.mahesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mahesh.service.StudentService;

@SpringBootApplication
public class SpringJdbcCustomIDsVjitApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcCustomIDsVjitApplication.class, args);
		StudentService bean = context.getBean(StudentService.class);
		bean.studentSaveAll();
	}

}
