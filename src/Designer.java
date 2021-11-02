public class Designer extends Employee {
    double rate;
    int workedDays;

    public Designer(int id, String name, int age, double salary,
                    boolean gender, double rate, int workedDays) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.rate = rate;
        this.workedDays = workedDays;
    }

    public double getSalary() {
        return salary + (rate * workedDays);

    }

    @Override
    public String toString() {

        return " id =  " + id + ", name = "+ name + ", age =  " + age + ", salary = "  + salary + ", gender = " + gender
                + ", worked days = " + workedDays;
    }

}
