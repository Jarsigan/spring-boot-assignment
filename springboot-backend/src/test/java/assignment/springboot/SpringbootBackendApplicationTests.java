package assignment.springboot;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import assignment.springboot.model.Employee;

import assignment.springboot.repository.EmployeeRepository;

@SpringBootTest
class SpringbootBackendApplicationTests {
     
    @Autowired
    private EmployeeRepository repository;

	@Test
	void contextLoads() {
        
        List<Employee> product = repository.findAll();
         
        Optional<Employee> employee = repository.findById(Long.valueOf(1));
	}

}
