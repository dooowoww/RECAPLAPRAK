public class CommisionEmployee extends Employee {
    private double grossSales;// penjualan per minggu
    private double commisionRate;// komisi

    public CommisionEmployee(String name, String noKTP) {
        super(name, noKTP);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales) {
        grossSales = sales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        commissionRate = rate;
    }

    public double getCommissionRate() {
        return commisionRate;
    }

    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    public String toString() {
        return String.format("Commission employee:" + super.toString() + "\ngross" + getGrossSales()
                + "\ncommission rate" + getCommissionRate());
    }
}