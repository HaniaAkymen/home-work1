import javax.xml.crypto.Data;

public class PensionFund {

    private String name;
    private boolean isGovernmentAgency;
    private String creationData;
    private int NumberOfPeople;

    public PensionFund(String name, boolean isGovernmentAgency, String creationData, int numberOfPeople) {
        this.name = name;
        this.isGovernmentAgency = isGovernmentAgency;
        this.creationData = creationData;
        NumberOfPeople = numberOfPeople;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isGovernmentAgency() {
        return isGovernmentAgency;
    }

    public void setisGovernmentAgency(boolean isGovernmentAgency) {
        this.isGovernmentAgency = isGovernmentAgency;
    }

    public String getCreationData() {
        return creationData;
    }

      public void setCreationDate(String creationData) {
            this.creationData = creationData;
     }
    public int getNumberOfPeople() {
        return NumberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        NumberOfPeople = numberOfPeople;
    }


    public void getInfo() {
        System.out.println("Информация о фонде: ");
        System.out.println("Название: " + name);
        System.out.println("Тип: " + (isGovernmentAgency ? "Государственный.Количество членов - " + NumberOfPeople / 1000 + " тысяч" : "Не государственный. Количество членов - " + NumberOfPeople));
        System.out.println("Дата создания: " + creationData);

    }

    public double calculatePensionFor(AbleToCalculatePension obj){
        if (isGovernmentAgency){
            return obj.calculatePension();
        } else {
            System.out.println("Деньги украли");
            return 0.0;

        }

    }

}
