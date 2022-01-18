public class BookingRunnable implements Runnable {

    String counterName;

    public void setInfo(String counterName) {
        this.counterName = counterName;

    }

    @Override
    public void run() {
        synchronized (this) {
            
            IBookingTickets iBookingTickets = new BookingTickets();

            for (int i = 0; i < 300; i++) {
                RandomTickets randomTickets = new RandomTickets();
                BaseTicket baseTicket = new BaseTicket();
                randomTickets.randomTicket(baseTicket);
                if (iBookingTickets.checkTickets(baseTicket.getName(),
                        baseTicket.getSession(), baseTicket)) {
                    iBookingTickets.BookingNormalTickets(baseTicket.getName(), baseTicket.getSession(), baseTicket);
                } else
                    break;
            }
        }

    }

}
