package com.subrat.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

    class Employee {
    private String name;
    private int age;
    private double salary;
    private String gender;

    // Constructor
    public Employee(String name, int age, double salary, String gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
    //----------------------------------------------------------------------------------------------------------------
      class EmployeeAdder {

    public static List<Employee> addDetails() {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Anna", 27, 50000.0, "Male"));
        list.add(new Employee("Employee 2", 27, 51000.0, "Female"));
        list.add(new Employee("Bob", 27, 52000.0, "Male"));
        list.add(new Employee("EmplSmithoyeeee 4", 28, 53000.0, "Female"));
        list.add(new Employee("Employee 5", 29, 53000.0, "Male"));
        list.add(new Employee("Employee 6", 30, 55000.0, "Female"));
        list.add(new Employee("EmSmithployee 7", 31, 56000.0, "Male"));
        list.add(new Employee("Employee 8", 32, 57000.0, "Female"));
        list.add(new Employee("Employee 9", 35, 58000.0, "Male"));
        list.add(new Employee("EMPLOYEEeeseeee 10", 35, 59000.0, "Female"));

        return list;
    }
}
//      -------------------------------------------------------------------------------------------------------------
public class Tester {

	
    private static final String RED = "\033[1;31m";
    private static final String RESET = "\033[0m";

    public static void main(String[] args) {

        List<Employee> list = EmployeeAdder.addDetails();

        // 1. Female Employees
        System.out.println(RED + "Female Employees" + RESET);
        list.stream()
                .filter(e -> e.getGender().equals("Female"))
                .forEach(System.out::println);

        // 2. Employees older than 30
        System.out.println(RED + "Employees Older Than 30" + RESET);
        list.stream()
                .filter(e -> e.getAge() > 30)
                .forEach(System.out::println);

        // 3. Salary greater than 50000
        System.out.println(RED + "Salary Greater Than 50000" + RESET);
        list.stream()
                .filter(e -> e.getSalary() > 50000)
                .forEach(System.out::println);

        // 4. Employee Names
        System.out.println(RED + "Employee Names" + RESET);
        list.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

        // 5. Average Salary
        System.out.println(RED + "Average Salary" + RESET);
        double avg = list.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println(avg);

        // 6. Maximum Salary
        System.out.println(RED + "Maximum Salary" + RESET);

        Employee maxSalaryEmp = list.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);

        System.out.println(maxSalaryEmp);

        // 7. Group By Gender
        System.out.println(RED + "Group By Gender" + RESET);

        Map<String, List<Employee>> genderMap =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getGender));

        genderMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        // 8. Count Male Employees
        System.out.println(RED + "Count Male Employees" + RESET);

        long count = list.stream()
                .filter(e -> e.getGender().equals("Male"))
                .count();

        System.out.println(count);

        // 9. Sum Of Salaries
        System.out.println(RED + "Sum Of Salaries" + RESET);

        double sum = list.stream()
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println(sum);

        // 10. Sort By Name
        System.out.println(RED + "Sort By Name" + RESET);

        list.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

        // 11. Sort By Age
        System.out.println(RED + "Sort By Age" + RESET);

        list.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .forEach(System.out::println);

        // 12. Sort By Salary Descending
        System.out.println(RED + "Sort By Salary Desc" + RESET);

        list.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(System.out::println);

        // 13. Oldest Employee
        System.out.println(RED + "Oldest Employee" + RESET);

        Employee oldest = list.stream()
                .max(Comparator.comparingInt(Employee::getAge))
                .orElse(null);

        System.out.println(oldest);

        // 14. Employees Age 35
        System.out.println(RED + "Employees Age 35" + RESET);

        list.stream()
                .filter(e -> e.getAge() == 35)
                .forEach(System.out::println);

        // 15. Sum Salary By Gender
        System.out.println(RED + "Sum Salary By Gender" + RESET);

        Map<String, Double> salaryMap =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.summingDouble(Employee::getSalary)
                        ));

        salaryMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        // 16. Names Starting With E
        System.out.println(RED + "Names Starting With E" + RESET);

        list.stream()
                .filter(e -> e.getName().startsWith("E"))
                .forEach(System.out::println);

        // 17. Average Salary By Gender
        System.out.println(RED + "Average Salary By Gender" + RESET);

        Map<String, Double> avgMap =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        avgMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        // 18. Top 3 Highest Paid Employees
        System.out.println(RED + "Top 3 Highest Paid Employees" + RESET);

        list.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);

        // 19. Distinct Ages
        System.out.println(RED + "Distinct Ages" + RESET);

        list.stream()
                .map(Employee::getAge)
                .distinct()
                .forEach(System.out::println);

        // 20. Lowest Paid Employees
        System.out.println(RED + "Lowest Paid Employees" + RESET);

        list.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .limit(3)
                .map(Employee::getName)
                .forEach(System.out::println);

        // 21. Longest Name Employee
        System.out.println(RED + "Longest Name Employee" + RESET);

        Employee longestName = list.stream()
                .max(Comparator.comparingInt(e -> e.getName().length()))
                .orElse(null);

        System.out.println(longestName);

        // 22. Palindrome Names
        System.out.println(RED + "Palindrome Names" + RESET);

        list.stream()
                .filter(e -> {
                    String name = e.getName().toLowerCase();
                    return new StringBuilder(name).reverse().toString().equals(name);
                })
                .forEach(System.out::println);

        // 23. Group By First Letter
        System.out.println(RED + "Group By First Letter" + RESET);

        list.stream()
                .collect(Collectors.groupingBy(e -> e.getName().charAt(0)))
                .forEach((k, v) -> System.out.println(k + " -> " + v));

        // 24. Employee With Shortest Name
        System.out.println(RED + "Shortest Name Employee" + RESET);

        Employee shortest = list.stream()
                .min(Comparator.comparingInt(e -> e.getName().length()))
                .orElse(null);

        System.out.println(shortest);

        // 25. Average Salary Names Start With E
        System.out.println(RED + "Average Salary Names Start With E" + RESET);

        double avgSalaryE = list.stream()
                .filter(e -> e.getName().startsWith("E"))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println(avgSalaryE);
    }
    
}