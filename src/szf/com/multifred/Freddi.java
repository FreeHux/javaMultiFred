package szf.com.multifred;

public class Freddi extends Thread{
    String name;
    Integer counter;

    Freddi(String s, Integer counter){
        this.name = s;
        this.counter = counter;
    }

    public void run() {
        System.out.println("Hier startet Freddi " + name);
        synchronized (counter) {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println("Freddi " + name + " zählt " + counter++);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
            System.out.println("Hier endet Freddi " + name);

    }
}
