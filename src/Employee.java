public class Employee {

    private String FIO;
    private int Department;
    private float Salary;
    private int Id;

    static int counter = 1;

    public int getId() {
        return this.Id;
    }

    public String getFIO() {
        return this.FIO;
    }

    public int getDepartment() {
        return this.Department;
    }

    public float getSalary() {
        return this.Salary;
    }

    public void SetFIO(String fio) {
        this.FIO = fio;
    }

    public void SetDepartment(int dept) {
        this.Department = dept;
    }

    public void SetSalary(float sal) {
        this.Salary = sal;
    }


    public Employee(String fio, int dept, float salary) {
        FIO = fio;
        Department = dept;
        Salary = salary;
        Id = counter++;
    }

    @Override
    public String toString() {
        return "Fio: " + FIO + " Dept: " + Department + " Salary: " + Salary;
    }
}