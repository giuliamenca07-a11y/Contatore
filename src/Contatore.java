public class Contatore {
    private int contatore = 0;

    public synchronized void increment() {
        contatore++;
    }

    public int getContatore() {
        return contatore;
    }
}