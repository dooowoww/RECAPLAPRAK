public class Manager extends Employee {
    private double bonus;

    public Manager(String string, int i, int j, int k, int l) {
    }

    public Manger(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

}
