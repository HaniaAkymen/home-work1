import java.sql.SQLOutput;
import java.util.Objects;


public abstract class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private double money;
    private GenderType type;

    public Person(String name, int age, int height, int weight, double money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    public void getInfo() {
        System.out.println("Имя человека: " + name + ", " + "возраст: " + age + ", " + "рост: " + height + ", " + "вес: " + weight);
    }

    public GenderType getType() {
        return type;
    }

    public void setType(GenderType type) {
        this.type = type;
    }

    public void goToWork() {
        if (age < 18 || age > 70) {
            System.out.println(name + " отдыхает дома");
        } else {
            System.out.println(name + " рaботает");
        }
    }

    public double getMoney() {
        System.out.println("Количество денег " + money + " евро" + " у " + name);
        return money;
    }

    public void die(){
        System.out.println("Человек погиб");
    };

    public abstract void die(int years);


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && weight == person.weight && Double.compare(person.money, money) == 0 && Objects.equals(name, person.name) && type == person.type;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (name !=null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + height;
        result = 31 * result + weight;
        result = 31 * result + (int) money;
        result = 31 * result + (type != null ? type.toString().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", money=" + money +
                ", type=" + type +
                '}';
    }


}


