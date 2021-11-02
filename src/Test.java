public class Test {

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();

        Developer[] randomDevelopers = employeeFactory.getRandomDeveloper(10);
        Manager[] randomManagers = employeeFactory.getRandomManager(10);
        Designer[] randomDesigner = employeeFactory.getRandomDesigner(10);

        Employee[] employees = employeeFactory.getRandomEmployee(10);

        EmployeeService employeeService = new EmployeeService(employees);
        System.out.println(employeeService.getByName(""));

        System.out.println("");

        Employee[] employees1 = employeeService.sortByName();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }


        System.out.println("");

        Employee[] employees2 = employeeService.sortByNameAndSalary();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees1[i]);
        }

        System.out.println("");

        System.out.println(employeeService.remove(2));

        System.out.println("");

        Employee e1 = employeeService.getById(1);
        System.out.println(e1);

        e1.name = "123";
        System.out.println(employeeService.edit(e1));

    }

}
