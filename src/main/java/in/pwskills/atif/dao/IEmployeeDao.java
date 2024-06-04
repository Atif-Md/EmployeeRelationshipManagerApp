package in.pwskills.atif.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.atif.model.Employee;

public interface IEmployeeDao extends JpaRepository<Employee, Integer> {

}
