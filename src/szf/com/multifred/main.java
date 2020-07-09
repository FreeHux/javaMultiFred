package szf.com.multifred;


public class main {

    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        /*
        Integer counter = 0;


        Freddi fred1 = new Freddi("nummer 1", counter);
        Freddi fred2 = new Freddi("nummer 2", counter);

        fred1.start();
        fred2.start();


        //fred1.join();
        //fred2.join();


        System.out.println("Ende DAS WARS");

         */


        arbeitsteilung work = new arbeitsteilung();

        CustomThread work1 = new CustomThread("erster", work, true);
        CustomThread work2 = new CustomThread("zweiter", work, false);


        Thread t1 = new Thread(work1);
        Thread t2 = new Thread(work2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        for (int i = 0; i < 50;i++){
            System.out.println("ich bin alleine und zähle " + i);
        }

        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
        System.out.println("Ende des Programms");

    }
}