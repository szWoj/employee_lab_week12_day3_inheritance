package staff;

public abstract class Employee {

    private String name;
    private String ni;
    private double salary;
    public void setName(String name) {
        if(name != null && !name.equals("")) {
            this.name = name;
        }
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNi() {
        return ni;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String ni, double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public void raiseSalary(double raise){
        if(raise > 0){
        this.salary += raise;
        }
    }

    public double payBonus(){
        return salary / 100;
    }

}
