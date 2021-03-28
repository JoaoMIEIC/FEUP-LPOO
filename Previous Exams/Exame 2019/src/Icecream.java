import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Icecream {
    List<Flavor> scoops = new ArrayList<>();

    void addScoop(Flavor flavor){
        scoops.add(flavor);
    }

    int getScoopCount(){
        return scoops.size();
    }

    boolean contains(String flavor){
        for(Flavor x: scoops){
            String scoopFlavor = x.getName();
            if(scoopFlavor.equals(flavor))
                return true;
        }
        return false;
    }

    int getFlavorCount(){
        HashSet flavours = new HashSet();
        for(Flavor x: scoops){
            flavours.add(x.getName());
        }
        return flavours.size();
    }

}
