package staff.techStaff;
import staff.Employee;

public class Developer extends Employee {

    private String deptName;

    public Developer(String name, String natInsNo, Double salary) {
        super(name, natInsNo, salary);
        this.deptName = "Tech Staff";
    }

    public String getDeptName() {
        return deptName;
    }
}
