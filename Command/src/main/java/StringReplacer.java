public class StringReplacer implements StringTransformer{

    char begin,end;

    StringReplacer(char begin, char end){
        this.begin = begin;
        this.end = end;
    }

    @Override
    public void execute(StringDrink drink) {
        String finalAnswer = drink.getText();
        drink.setText(finalAnswer.replace(begin,end));
    }
}
