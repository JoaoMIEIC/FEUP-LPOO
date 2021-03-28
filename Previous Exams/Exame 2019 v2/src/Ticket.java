import java.util.List;

public class Ticket {
    int ticketID;
    Concert concert;

    public Ticket(int ticketID, Concert concert) throws InvalidTicket {
        if(ticketID < 0) throw new InvalidTicket();
        this.ticketID = ticketID;
        this.concert = concert;
    }

    public int getNumber() {
        return ticketID;
    }

    public Concert getConcert() {
        return concert;
    }


}
