
public class TicketsPackage {

    private String ticketsPackageName, ticketsPackageSession;
    private int ticketsPackageQuantity;

    public void setTicketsPackageName(String ticketsPackageName) {
        this.ticketsPackageName = ticketsPackageName;
    }

    public void setTicketsPackageSession(String ticketsPackageSession) {
        this.ticketsPackageSession = ticketsPackageSession;
    }

    public String getTicketsPackageSession() {
        return this.ticketsPackageSession;
    }

    public String getTicketsPackageName() {
        return this.ticketsPackageName;
    }

    public void setTicketsPackageQuantity(int ticketsPackageQuantity) {
        this.ticketsPackageQuantity = ticketsPackageQuantity;
    }

    public int getTicketsPackageQuantity() {
        return this.ticketsPackageQuantity;
    }
}
