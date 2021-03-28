import java.util.ArrayList;
import java.util.List;

public class BoxOffice {

    public static List<Ticket> buy(Concert concert, int i) throws InvalidTicket {
        int number = 1;
        List<Ticket> bro = new ArrayList<>();
        for(int j = 0; j < i; j++){
            bro.add(new Ticket(concert.getTnum(),concert));
            concert.increment();
        }
        return bro;
    }
}
