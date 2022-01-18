public enum MovieEnum {
    spiderMan_1("蜘蛛人", "影廳A", 218),
    spiderMan_2("蜘蛛人", "影廳B", 220),
    theMatrix("駭客任務", "影廳C", 230);

    private String movieName, movieSession;
    private int ticketQuantity;

    MovieEnum(String movieName, String movieSession, int ticketQuantity) {
        this.movieName = movieName;
        this.movieSession = movieSession;
        this.ticketQuantity = ticketQuantity;
    }

    public String getName(){
        return this.movieName;
    }
    public String getSession(){
        return this.movieSession;
    }
    public int getQuantity(){
        return this.ticketQuantity;
    }
    public void setTickets(int ticketQuantity){
        this.ticketQuantity = ticketQuantity;
    }
    
}
