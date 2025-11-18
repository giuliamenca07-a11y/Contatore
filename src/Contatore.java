public class Contatore {
    private int contatore = 0;

    public synchronized void increment() {
        contatore++;
    }
 public void run(){
        int i = 0;
        while(i<5000){
            increment();
            i++;
        }
 }
    public int getContatore() {
        System.out.println(contatore);
        return contatore;
    }
}