public class Manager extends Employee {

    public Manager(int id, String name, int age, double salary, boolean gander) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {

        return " id =  " + id + ", name = " + name + ", age =  " + age + ", salary = " + salary + ", gender = " + gender;
    }

}
