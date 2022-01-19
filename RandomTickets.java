import java.util.ArrayList;
import java.util.HashMap;

public class RandomTickets {

    ArrayList<Integer> ticketQuantityList = new ArrayList<>();
    // ArrayList<Integer> ticketsPackageType = new ArrayList<>();
    int ticketType, bookingType;


    public BaseTicket randomTicket(BaseTicket tickets) {

        ticketQuantityList.clear();
        for (int i = 0; i <= 3; i++) {
            ticketQuantityList.add((int) (Math.random() * 3));
            bookingType = (int) (Math.random() * 2);
            tickets.setTickets(ticketQuantityList);
            tickets.setBookingType(bookingType);
        }

        switch (bookingType) {
            case 0:
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
                break;
            case 1:
                randomTicketsPackage();
                break;
        }

        return tickets;
    }

    public HashMap<String, String> randomTicketsPackage() {
        TicketsPackage ticketsPackage = new TicketsPackage();
        int ticketsPackageType;
        ticketsPackageType = (int) (Math.random() * 3);
        HashMap<String, String> ticketPackage = new HashMap<String, String>();

        // ticketsPackage.setTicketsPackageName((int) (Math.random() * 3));
        switch (ticketsPackageType) {
            case 0:
                ticketsPackage.setTicketsPackageName("蜘蛛人A");
                ticketPackage.put("蜘蛛人A", "影廳A");
                break;
            case 1:
                ticketsPackage.setTicketsPackageName("蜘蛛人B");
                ticketPackage.put("蜘蛛人B", "影廳B");
                break;
            case 2:
                ticketsPackage.setTicketsPackageName("駭客A");
                ticketPackage.put("駭客A", "影廳C");
                break;
        }
        return ticketPackage;
    }
}
