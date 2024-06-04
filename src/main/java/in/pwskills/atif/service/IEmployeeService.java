package in.pwskills.atif.service;

import java.util.List;

import in.pwskills.atif.model.Employee;

public interface IEmployeeService {
	public void saveEmployee(Employee employee);
	public List<Employee> findAllEmployees();
	public Employee findEmployeeById(Integer id);
	public void deleteById(Integer id);
}
