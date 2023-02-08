package tfip.ssf.day13.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.stereotype.Repository;

import tfip.ssf.day13.model.Employee;

@Repository
public class EmployeeRepo {

    private List<Employee> employees;
    public List<Employee> findAll(){
        
        if (employees == null){
            employees = new ArrayList<Employee>();
        }


        Employee emp = new Employee("Kathy", "Ang", "kathy@ang.com", "98765432", 2900, "12-01-99", "address", 111100);
        
        
        return employees;
    }
}
