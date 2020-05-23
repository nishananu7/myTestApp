package com.example.testapp.service;

import com.example.testapp.DTO.EmployeeDeptDTO;
import com.example.testapp.DTO.Employee;
import com.example.testapp.DTO.Department;
import java.util.TreeMap;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Service
public class EmployeeDetailsService {
	
	
	public List<Employee> getEmployeeDeptDetails() {
		
		List empDetails=new ArrayList<Employee>();
		Map empDeptMap=new HashMap<String, List<Employee>>();
		
		Department dept1=new Department();
		Department dept2=new Department();
		Department dept3=new Department();
		
		String fin=dept1.setDeptName("Finance");
		dept2.setDeptName("HR");
		dept3.setDeptName("IT");
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		emp1.setEmpId(100);
		emp1.setEmpName("Murali");
		emp1.setEmpAddress("HSR Layout");
		emp1.setEmpPhone("8766554466");
		
		emp2.setEmpId(101);
		emp2.setEmpName("Malini");
		emp2.setEmpAddress("BTM Layout");
		emp2.setEmpPhone("998764546");
		
		emp3.setEmpId(102);
		emp3.setEmpName("Neha");
		emp3.setEmpAddress("CV Raman nagar");
		emp3.setEmpPhone("776549076");
		
		empDetails.add(emp1);		
		empDetails.add(emp2);
		empDetails.add(emp3);
		
	/*	for(int i=0;i<empDetails.size();i++) {
			
			//empDeptMap.put(fin, empDetails.get(i));
			
			System.out.println("print:"+empDetails.get(i)+".."+empDeptMap.put(i, empDetails.get(i)));
			
		}
		*/
		
	return empDetails;
		

	}

}
