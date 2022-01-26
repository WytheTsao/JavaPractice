public class BookingRunnable implements Runnable {

    String counterName;

    public void setInfo(String counterName) {
        this.counterName = counterName;

    }

    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                IBookingTickets iBookingTickets = new BookingTickets();
                RandomTickets randomTickets = new RandomTickets();
                BaseTicket baseTicket = new BaseTicket();
                TicketsPackage ticketsPackage = new TicketsPackage();
                randomTickets.randomTicket(baseTicket);
                if (iBookingTickets.checkTickets(baseTicket.getName(),
                        baseTicket.getSession(), baseTicket)) {

                    switch (baseTicket.getBookingType()) {
                        case 0:
                            iBookingTickets.BookingNormalTickets(baseTicket.getName(), baseTicket.getSession(),
                                    baseTicket);
                            break;
                        case 1:
                            // System.out.println("Test1");
                            iBookingTickets.BookingTicketsPackage("123213",ticketsPackage);
                            break;
                    }

                } else
                    break;

            }

        }
    }

}
