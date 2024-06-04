package in.pwskills.atif.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskills.atif.dao.IEmployeeDao;
import in.pwskills.atif.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDao dao;
	
	
	@Override
	public void saveEmployee(Employee employee) {
		dao.save(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		List<Employee> employees = dao.findAll();
		employees.forEach(System.out::println);
		return dao.findAll();
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		Optional<Employee> optional = dao.findById(id);
		Employee employee =null;
		
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException("Unable to find Id : "+id);
		}
		
		return employee;
	}

	@Override
	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

}
