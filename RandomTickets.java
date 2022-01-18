import java.util.ArrayList;

public class RandomTickets {

    ArrayList<Integer> ticketQuantityList = new ArrayList<>();
    int ticketType;

    public BaseTicket randomTicket(BaseTicket tickets) {

        ticketQuantityList.clear();
        for (int i = 0; i <= 3; i++) {
            ticketQuantityList.add((int) (Math.random() * 3));
            tickets.setTickets(ticketQuantityList);
        }

        ticketType = (int) (Math.random() * 3);

        switch (ticketType) {
            case 0:
                tickets.setName("蜘蛛人");
                tickets.setSession("影廳A");
                break;
            case 1:
                tickets.setName("蜘蛛人");
                tickets.setSession("影廳B");
                break;
            case 2:
                tickets.setName("駭客任務");
                tickets.setSession("影廳C");
                break;
        }
        return tickets;
    }
}
