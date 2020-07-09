package szf.com.multifred;

public class arbeitsteilung {
    boolean flag = false;
    Integer zähler = 0;
    Integer zahl = 0;

    public synchronized void first() throws InterruptedException {
        if(flag){
            wait();
        }
        System.out.println("ich bin der erste und zähle " + zähler++);
        flag = true;
        notify();
    }

    public synchronized void second() throws InterruptedException {
        if(!flag){
            wait();
        }
        System.out.println("ich bin der zweite und zähle " + zähler++);
        flag = false;
        notify();
    }
}

