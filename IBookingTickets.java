public interface IBookingTickets {
    boolean checkTickets(String movieName, String movieSession, BaseTicket baseTicket);

    int BookingNormalTickets(String movieName, String movieSession, BaseTicket baseTicket);

    int BookingTicketsPackage(String ticketsPackageName, TicketsPackage ticketsPackage);
}
