public class Main {

    public static void main(String[] args) {
        BookingRunnable bookingRunnable = new BookingRunnable();
        
        Thread thread1 = new Thread(bookingRunnable);
        Thread thread2 = new Thread(bookingRunnable);
        Thread thread3 = new Thread(bookingRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
      
    }
}   