package com.example.university;

import com.example.university.model.Degree;
import com.example.university.model.Lector;
import com.example.university.service.DepartmentService;
import com.example.university.service.LectorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@SpringBootApplication
public class UniversityApplication implements CommandLineRunner {

    private static Logger logger = LoggerFactory
            .getLogger(UniversityApplication.class);
    private final DepartmentService departmentService;
    private final LectorService lectorService;

    public UniversityApplication(DepartmentService departmentService, LectorService lectorService) {
        this.departmentService = departmentService;
        this.lectorService = lectorService;
    }

    public static void main(String[] args) {
        logger.info("STARTING THE APPLICATION");
        SpringApplication.run(UniversityApplication.class, args);
        logger.info("APPLICATION FINISHED");
    }


    @Override
    public void run(String... args) throws Exception {

        String department = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name of Department");
        department = br.readLine();

        logger.info("EXECUTING : command line runner");
        Lector lector = departmentService.getHeaderByDepartmentName(department);

        logger.info("1. Who is head of department " + department);
        logger.info("Head of " + department + " department is "
                + lector.getFirstName() + " " + lector.getLastName());

        logger.info("2.Show " + department + " statistics");
        logger.info("Answer: assistans - " +
                lectorService.departmentStatistics(department, Degree.ASSISTANT) +
                " associate professors - " +
                lectorService.departmentStatistics(department, Degree.ASSOCIATE_PROFESSOR) +
                " professors - " +
                lectorService.departmentStatistics(department, Degree.PROFESSOR));

        department = "System Analysis";

        logger.info("3.Show the average salary for the department " + department);
        logger.info("The average salary of " + department + " is "
                + departmentService.averageSalaryForTheDepartment(department));

        logger.info("4.Show count of employee for " + department);
        logger.info("Answer: "
                + departmentService.countEmployees(department));

        System.out.println("Enter template for global search");
        String template = br.readLine();

        logger.info("5.Global search by " + template);
        logger.info("Answer: "
                + lectorService.findByTemplate(template).toString());


    }
}
