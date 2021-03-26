public class StringCaseChanger implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        String finalAnswer = "";
        for (char x : drink.getText().toCharArray()) {
            if(Character.isLowerCase(x)){
                finalAnswer += Character.toUpperCase(x);
            }
            else{
                finalAnswer += Character.toLowerCase(x);
            }
        }
        drink.setText(finalAnswer);
    }
}
