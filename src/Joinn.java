public class Joinn {
    public static void main(String[] args) throws InterruptedException {

        Odd o=new Odd();
        Even e=new Even();

        o.run();

        o.join();
        e.run();





    }
}

class Odd extends Thread{

    @Override
    public synchronized void run(){
       for(int i=1;i<=20;i=i+2){
           System.out.println(i);
       }
    }
}
class Even extends Thread{
    @Override
    public synchronized void run(){
        for(int i=0;i<=20;i=i+2){
            System.out.println(i);
        }
    }
}
