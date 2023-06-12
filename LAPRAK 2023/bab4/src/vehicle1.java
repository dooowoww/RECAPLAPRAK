public class vehicle1 {
    private double load, maxLoad;

    public vehicle1(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getLoad() {
        return this.load;
    }

    public double getMaxLoad() {
        return this.maxLoad;
    }

    public boolean addBox(double weight) {
        double temp = this.load + weight;
        if (temp <= maxLoad) {
            this.load = temp;
            return true;
        } else {
            return false;
        }
    }
}
