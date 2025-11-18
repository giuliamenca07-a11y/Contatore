public class Main {
    public static void main(String[] args) {
        Contatore contatore = new Contatore();

        // Create multiple threads to increment the counter
        Thread t1 = new Thread(() -> contatore.run());
        Thread t2 = new Thread(() -> contatore.run());
        Thread t3 = new Thread(() -> contatore.run());

        SynchronizedBlockExample example = new SynchronizedBlockExample();

        // Create multiple threads to increment the counter
        Thread t4= new Thread(() -> example.increment());
        Thread t5= new Thread(() -> example.increment());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final count: " + contatore.getContatore());
        System.out.println("Final count: " + example.getCount());
    }
}
