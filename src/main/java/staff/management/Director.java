package staff.management;

public class Director extends Manager {

    private Double budget;

    public Director(String name, String natInsNo, Double salary, Double budget) {
        super(name, natInsNo, salary);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }
    // Overrides Employee class to give Directors 2% bonus
    // If only director bonuses were this low in real life!
    public Double payBonus() {
        return (this.getSalary()/100) * 2;
    }
}
