import java.util.Arrays;
import java.util.Comparator;

public class EmployeeService {
    Employee[] employees;

    static class NameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
    }

    static class NameAndSalaryComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            int ret = o1.name.compareTo(o2.name);
            if (ret == 0) {
                ret = Double.compare(o1.salary, o2.salary);
            }
            return ret;
        }
    }

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    public void printEmployees() {
        System.out.println(employees);

    }

    public double calculateSalaryAndBonus() {
        for (Employee employee : employees) {
            return employee.getSalary();

        }
        return 0;
    }

    public Employee getById(int id) {
        return employees[id];
    }

    public Employee getByName(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].name.equals(name)) {
                return employees[i];
            }
        }
        return null;
    }

    public Employee[] sortByName() {
        Employee[] employeesCopy = Arrays.copyOf(employees, employees.length);
        Arrays.sort(employeesCopy, new NameComparator());
        return employeesCopy;
    }

    public Employee[] sortByNameAndSalary() {
        Employee[] employeesCopyAndSalary = Arrays.copyOf(employees, employees.length);
        Arrays.sort(employeesCopyAndSalary, new NameAndSalaryComparator());
        return employeesCopyAndSalary;
    }

    public Employee edit(Employee employee) {
        Employee oldE = employees[employee.id];
        employees[employee.id] = employee;
        return oldE;
    }

    public Employee remove(int id) {
        employees[id] = null;
        return employees[id];
    }
}
