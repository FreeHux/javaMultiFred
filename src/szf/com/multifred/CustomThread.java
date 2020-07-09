package szf.com.multifred;

public class CustomThread implements Runnable{
    String name;
    arbeitsteilung work;
    boolean flag;

    CustomThread(String s, arbeitsteilung b, boolean c){
        this.name = s;
        work = b;
        flag = c;
    }

    public void run(){
        System.out.println("Starte Thread " + name);
        for (int i = 0; i < 500000000; i++){
            if(flag){
                try {
                    work.first();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                    work.second();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Beende Thread " + name);
    }
}
