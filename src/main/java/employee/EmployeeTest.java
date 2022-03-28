package employee;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {


        System.out.println("Print all emails - One employee has one email - One to One");
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);
        System.out.println("*********************");


        System.out.println("Print all phone numbers");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);
        System.out.println("*********************");

        System.out.println("Print all phone numbers with flatMap by one to Many");

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);
        System.out.println("*********************");


        System.out.println("Print all phone numbers with flatMap to List and then print");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
        System.out.println("*********************");
    }
}