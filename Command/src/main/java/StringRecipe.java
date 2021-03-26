import java.util.List;

public class StringRecipe {
    List<StringTransformer> transformers;

    StringRecipe(List<StringTransformer> transformers){
        this.transformers = transformers;
    }

    public void mix(StringDrink drink) {
        for(StringTransformer x: transformers){
            x.execute(drink);
        }
    }
}
