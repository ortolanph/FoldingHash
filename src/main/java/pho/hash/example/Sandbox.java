package pho.hash.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Sandbox {

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.id = 1;
        employee.serialNumber = "ACME0001";
        employee.name = "John Doe";
        employee.startDate = LocalDate.now();

        Map<Employee, String> nicknames = new HashMap<>();

        nicknames.put(employee, "Jack");

        nicknames.get(employee)


    }

}
