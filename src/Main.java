public class Main {
    public static void main(String[] args) {

        Pensioner Michal = new Pensioner("Michal",76,168,73,400.80,70.95);
        Pensioner Mira = new Pensioner("Mira",82,160,68,600.50,65.98);
        Pensioner Sonia = new Pensioner("Sonia",79,159,59,700.35,65.97);

        Worker Max = new Worker("Max",45, 192, 97,3900);
        Worker Karl = new Worker("Karl",48, 182, 90, 1700);
        Worker Petra = new Worker("Petr",36, 167, 62,2900);

        System.out.println("Выводим информацию о челевеке: ");

        PensionFund First = new PensionFund("State Pension Fund", true, "01.05.1963", 190000);
        PensionFund Second = new PensionFund("Star", false, "25.12.2002", 2300);
        PensionFund Third = new PensionFund("Guarantee", false, "12.10.2020", 1358);

        First.setName("State Pension Fund");
        Second.setName("Star");
        Third.setName("Guarantee");

        First.setisGovernmentAgency(true);
        Second.setisGovernmentAgency(false);
        Third.setisGovernmentAgency(false);

        First.getCreationData();
        Second.getCreationData();
        Third.getCreationData();

        First.setNumberOfPeople(190000);
        Second.setNumberOfPeople(2300);
        Third.setNumberOfPeople(1358);

        First.getInfo();
        Second.getInfo();
        Third.getInfo();

        Max.getMoney();
        Karl.getMoney();
        Petra.getMoney();

        Michal.die(12);
        Mira.die(15);
        Sonia.die(26);

        Max.die(25);
        Karl.die(37);
        Petra.die(18);

        Max.setMiniSalary(800);
        Max.setMaxSalary(4000);
        Karl.setMiniSalary(600);
        Karl.setMaxSalary(5000);
        Petra.setMiniSalary(850);
        Petra.setMaxSalary(3000);

        Max.setType(GenderType.MAN);
        Karl.setType(GenderType.NONBINARY);
        Petra.setType(GenderType.WOMAN);

        double result = First.calculatePensionFor(Max);
        System.out.println(result);

        result = Second.calculatePensionFor(Karl);
        System.out.println(result);

        result = Third.calculatePensionFor(Petra);
        System.out.println(result);

        GenderType MaxType = Max.getType();
        GenderType KarlType = Karl.getType();
        GenderType PetraType = Petra.getType();




    }
}