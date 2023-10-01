import java.util.Objects;

public class Worker extends Person implements AbleToCalculatePension {

    private final static double PERCENT_OF_PENSION = 0.25;

    private double miniSalary;
    private double maxSalary;

    public Worker(String name, int age, int height, int weight, double money) {
        super(name, age, height, weight, money);
    }

    public Worker (String name, int age, int height, double money){
        super(name, age, height,0,0);
    }

    public Worker(){
        super(null,0,0,0,0);
    }

    public double getMiniSalary() {
        return miniSalary;
    }

    public void setMiniSalary(double miniSalary) {
        this.miniSalary = miniSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Override
    public double getMoney() {
        return super.getMoney();
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    @Override
    public void die(int years){
      System.out.println(getName() + " - этот человек не доживет до пенсии и умрет через " + years + " лет");
    }

    public double calculatePension(){
        double averageSalary = calculateAverage((int) miniSalary, (int) maxSalary);

        if (getType() == null){
            return 0.0;
        }
        if (getType() == GenderType.MAN || getType() == GenderType.NONBINARY){
            double pension = averageSalary * PERCENT_OF_PENSION;
            System.out.println("Пенсия " + getName() + " равна " + pension + " Euro");
            return pension;
        }
        else {
            double pension = (miniSalary/2 + maxSalary*2)/2 * PERCENT_OF_PENSION;
            System.out.println("Пенсия " + getName() + " равна " + pension + " Euro");
            return pension;
        }
    }


    public static double calculateAverage(double first, double second){
        return (first+ second) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return Double.compare(worker.miniSalary, miniSalary) == 0 && Double.compare(worker.maxSalary, maxSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), miniSalary, maxSalary);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "miniSalary=" + miniSalary +
                ", maxSalary=" + maxSalary +
                '}';
    }
}
