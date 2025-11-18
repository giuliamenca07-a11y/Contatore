public class Main {
    public static void main(String[] args) {
        Contatore contatore = new Contatore();

        // Create multiple threads to increment the counter
        Thread t1 = new Thread(() -> contatore.increment());
        Thread t2 = new Thread(() -> contatore.increment());
        Thread t3 = new Thread(() -> contatore.increment());

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final count: " + contatore.getContatore());
    }
}
