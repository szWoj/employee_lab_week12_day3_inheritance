package management;

public class Director extends Manager{

    private double budget;

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public Director(String name, String ni, double salary, String deptName, double budget){
        super(name,ni,salary,deptName);
        this.budget = budget;
    }

    public double payBonus(){
        return (this.getSalary() / 100) * 2;
    }
}
