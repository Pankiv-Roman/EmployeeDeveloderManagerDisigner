import java.util.Random;

//Developer(int id, String name, int age, double salary, boolean gander, int fixedBugs)
public class EmployeeFactory {
    static String[] names = {"Vasul", "Pavlo", "Stepan", "Borus"};

    public Developer[] getRandomDeveloper(int size) {
        Random random = new Random();
        Developer[] randomDevelopers = new Developer[size];

        for (int i = 0; i < size; i++) {
            Developer developer = new Developer(
                    i + 1,
                    names[random.nextInt(names.length)],
                    random.nextInt(100) + 1,
                    random.nextDouble() * 1000 + 6,
                    random.nextBoolean(),
                    random.nextInt(1000)
            );
            randomDevelopers[i] = developer;
        }

        return randomDevelopers;
    }
//    Manager(int id, String name, int age, double salary, boolean gander) {

    public Manager[] getRandomManager(int size) {
        Random random = new Random();
        Manager[] randomManagers = new Manager[size];

        for (int i = 0; i < size; i++) {
            Manager manager = new Manager(
                    i + 1,
                    names[random.nextInt(names.length)],
                    random.nextInt(100) + 1,
                    random.nextDouble() * 1000 + 6,
                    random.nextBoolean()

            );
            randomManagers[i] = manager;
        }

        return randomManagers;
    }
//    Designer(int id, String name, int age, double salary,
//             boolean gender, double rate, int workedDays)

    public Designer[] getRandomDesigner(int size) {
        Random random = new Random();
        Designer[] randomDesigner = new Designer[size];

        for (int i = 0; i < size; i++) {
            Designer designer = new Designer(
                    i + 1,
                    names[random.nextInt(names.length)],
                    random.nextInt(100) + 1,
                    random.nextDouble() * 1000 + 6,
                    random.nextBoolean(),
                    random.nextDouble() * 100,
                    random.nextInt(31)
            );
            randomDesigner[i] = designer;
        }

        return randomDesigner;
    }

    public Employee[] getRandomEmployee(int size) {
        Random random = new Random();
        int developerCount = random.nextInt(size);
        int managerCount = random.nextInt(size - developerCount);
        int designerCount = size - developerCount - managerCount;

        Developer[] developers = getRandomDeveloper(developerCount);
        Manager[] managers = getRandomManager(managerCount);
        Designer[] designers = getRandomDesigner(designerCount);

        Employee[] employees = new Employee[size];
        int index = 0;
        for (Developer developer : developers) {
            employees[index] = developer;
            index++;
        }
        for (Manager manager : managers) {
            employees[index] = manager;
            index++;
        }
        for (Designer designer : designers) {
            employees[index] = designer;
            index++;
        }
        return employees;
    }
}
