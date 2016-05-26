package org.amezick.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;

    @Autowired(required = true)
    public DatabaseLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        employeeRepository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        employeeRepository.save(new Employee("Angus", "Mezick", "developer"));

    }

}
