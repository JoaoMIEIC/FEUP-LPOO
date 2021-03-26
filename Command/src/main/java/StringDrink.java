import org.w3c.dom.Text;

public class StringDrink {
    String answer;


    StringDrink(String answer){
        this.answer = answer;
    }

    String getText(){
        return answer;
    }

    void setText(String answer){
        this.answer = answer;
    }
}
