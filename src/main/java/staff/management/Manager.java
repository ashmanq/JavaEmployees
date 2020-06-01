package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String depName;

    public Manager(String name, String natInsNo, Double salary) {
        super(name, natInsNo, salary);
        this.depName = "Management";
    }

    public String getDepName() {
        return depName;
    }
}
