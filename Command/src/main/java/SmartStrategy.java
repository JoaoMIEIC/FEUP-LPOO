import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{

    List<StringDrink> drinkList;

    StringRecipe recipe;

    SmartStrategy(){
        drinkList = new ArrayList<>();
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour()){
            bar.order(drink,recipe);
        }
        else{
            this.recipe = recipe;
            drinkList.add(drink);
        }

    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for(StringDrink x: drinkList){
            bar.order(x,recipe);
        }

    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
