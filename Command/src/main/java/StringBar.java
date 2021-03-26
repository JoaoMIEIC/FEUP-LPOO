import java.util.List;

public class StringBar extends Bar{


    public void order(StringDrink drink, StringRecipe recipe) {
        for(StringTransformer x : recipe.transformers){
            x.execute(drink);
        }
    }
}
