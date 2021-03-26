public class AreaStringOutputter {

    SumProvider area;

    AreaStringOutputter(SumProvider area) {
        this.area = area;
    }


    String output(){
        return "Sum of areas: " + this.area.sum();
    }
}
