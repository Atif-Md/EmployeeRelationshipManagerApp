package in.pwskills.atif.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.pwskills.atif.model.Employee;
import in.pwskills.atif.service.IEmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		model.addAttribute("employee", new Employee());
		return "/employees/employee-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute Employee employee) {
		service.saveEmployee(employee);
		return "redirect:/employees/list";
	}
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		return "redirect:/employees/list";
	}
	
	@GetMapping("/list")
	public String listEmployees (Model model) {
		List<Employee> employees = service.findAllEmployees();
		model.addAttribute("employees", employees);
		return "/employees/list-employees";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("eid") Integer id, Model model) {
		Employee employee = service.findEmployeeById(id);
		model.addAttribute("employee", employee);
		return "/employees/edit-employee";
	}
	
	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam("eid") Integer eid) {
		
		service.deleteById(eid);
		
		return "redirect:/employees/list";
	}
	
	
}
