import java.net.CacheRequest;

public class BookingTickets implements IBookingTickets {

    @Override
    public boolean checkTickets(String movieName, String movieSession, BaseTicket baseTicket) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < MovieEnum.values().length; i++) {
            if (MovieEnum.values()[i].getName().equals(movieName)
                    && MovieEnum.values()[i].getSession().equals(movieSession)) {
                if (MovieEnum.values()[i].getQuantity() < 0) {
                    System.out.println(MovieEnum.values()[i].getName() +
                            MovieEnum.values()[i].getSession() + "沒票了！");
                    return false;
                } else {
                    System.out.println("電影名稱: " + movieName + " 電影影廳: " + movieSession + " 剩餘票數:"
                            + MovieEnum.values()[i].getQuantity());
                }
            }
        }
        return true;
    }

    @Override
    public int BookingNormalTickets(String movieName, String movieSession, BaseTicket baseTicket) {
        int sum = 0;

        for (int i = 0; i < MovieEnum.values().length; i++) {
            if (MovieEnum.values()[i].getName().equals(movieName)
                    && MovieEnum.values()[i].getSession().equals(movieSession)) {
                for (int j = 0; j < baseTicket.getTickets().size(); j++) {
                    sum += baseTicket.getTickets().get(j);
                }
                System.out.println("電影：" + movieName + "影廳：" + movieSession + "票數：" + baseTicket.getTickets());
                System.out.println("--------------------------------------------");
                MovieEnum.values()[i].setTickets(MovieEnum.values()[i].getQuantity() - sum);
            }
        }
        return sum;
    }

    @Override
    public int BookingTicketsPackage(String ticketsPackageName, TicketsPackage ticketsPackage) {
        // 012 -> 套餐
        System.out.println(ticketsPackageName);
        // if(ticketsPackageName.equals("蜘蛛人A")&&ticketsPackageName.equals("蜘蛛人B")){
        //     System.out.println(ticketsPackageName);
        // }
       

        return 0;
    }

}
