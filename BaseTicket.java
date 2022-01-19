import java.util.ArrayList;

public class BaseTicket {

    private String movieName, movieSession;
    private ArrayList<Integer> tickets;
    private int bookingType;

    public void setName(String name) {
        this.movieName = name;
    }

    public void setSession(String session) {
        this.movieSession = session;
    }

    public void setTickets(ArrayList<Integer> tickets) {
        this.tickets = tickets;
    }

    public String getName() {
        return this.movieName;
    }

    public String getSession() {
        return this.movieSession;
    }

    public ArrayList<Integer> getTickets() {
        return this.tickets;
    }

    public void setBookingType(int bookingType) {
        this.bookingType = bookingType;
    }

    public int getBookingType() {
        return this.bookingType;
    }

}
