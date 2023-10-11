import javax.xml.crypto.Data;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;


public class PensionFund {

    private String name;
    private boolean isGovernmentAgency;
    private String creationData;
    private List<Pensioner> pensionerList;


    public PensionFund(String name, boolean isGovernmentAgency, String creationData, List<Pensioner> pensionerList) {
        this.name = name;
        this.isGovernmentAgency = isGovernmentAgency;
        this.creationData = creationData;
        this.pensionerList = pensionerList;
    }

    public PensionFund(String statePensionFund, boolean isGovernmentAgency, String creationData) {
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

    public List getPensionerList() {
        return pensionerList;
    }

    public void setPensionerList(List pensionerList) {
        this.pensionerList = pensionerList;
    }

    public void getInfo() {
        System.out.println("Информация о фонде: ");
        System.out.println("Название: " + name);
        System.out.println("Тип: " + (isGovernmentAgency ? "Государственный" : "Не государственный"));
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
    public double calculateMedianPension(){
        if (pensionerList == null || pensionerList.size() == 0){
            System.out.println("Вкладчики отсутствуют");
            return 0.0;
        }
        double sumOfPension = 0.0;
        for (Pensioner pensioner : pensionerList){
            sumOfPension += calculatePensionFor(pensioner);
        }
        return sumOfPension / pensionerList.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return isGovernmentAgency == that.isGovernmentAgency && Objects.equals(name, that.name) && Objects.equals(creationData, that.creationData) && Objects.equals(pensionerList, that.pensionerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isGovernmentAgency, creationData, pensionerList);
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", isGovernmentAgency=" + isGovernmentAgency +
                ", creationData='" + creationData + '\'' +
                ", pensionerList=" + pensionerList +
                '}';
    }
}
