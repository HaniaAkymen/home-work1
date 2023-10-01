import java.util.Objects;

public class Pensioner extends Person {

    private double pension;

    public Pensioner(String name, int age, int height, int weight, double money, double pension) {
        super(name, age, height, weight, money);
        this.pension = pension;
    }
    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    @Override
    public void die() {
        int age = getAge();
        int result = (age - 50) + (int) pension;
        System.out.println("Этот пенсионер умер,он заработал " + result);
    }

    @Override
    public void die(int years) {
        System.out.println(getName() + " - этот пенсионер умрет через " + years + " лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pensioner pensioner = (Pensioner) o;
        return Double.compare(pensioner.pension, pension) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pension);
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "pension=" + pension +
                '}';
    }
}
