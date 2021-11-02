import java.util.Random;

public class Developer extends Employee {
    int fixedBugs;

    public Developer(int id, String name, int age, double salary, boolean gander, int fixedBugs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gander;
        this.fixedBugs = fixedBugs;
    }

    public double getSalary() {
        Random random = new Random();
        return (salary + fixedBugs * 10) * (random.nextBoolean() ? 2 : 0);
    }

    @Override
    public String toString() {

        return " id =  " + id + ", name = "+ name + ", age =  " + age + ", salary = "  + salary + ", gender = " + gender
                + ", fixed bugs = " + fixedBugs;
    }

}
