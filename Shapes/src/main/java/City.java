import java.util.List;

public class City implements SumProvider{
    private List<House> houseList;

    public City(List<House> houseList){
        this.houseList = houseList;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    public double sum(){
        float sum = 0;
        for(House house : houseList ){
            sum += house.getArea();
        }
        return sum;
    }
}
