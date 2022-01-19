import java.util.ArrayList;

public class TicketsPackage{

    private ArrayList<Integer> ticketsPackage;
    private String ticketsPackageName;
    private int ticketsPackageQuantity;

    public void setTicketsPackageName(String ticketsPackageName) {
        this.ticketsPackageName = ticketsPackageName;
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
