public class Chcek {
    public static void main(String[] args) {
        Common c1=new Common();
        Common c2=new Common();
        ThreadA t1=new ThreadA(c1,"Ram");
        ThreadB t2=new ThreadB(c2,"Shyam");
        t1.start();
        t2.start();
    }
}

class Common{
   public void fun(String n){
       System.out.println(n);
   }
}
class ThreadA extends  Thread{
    Common c1;
    String name;
    public  ThreadA(Common c1,String name){
        this.c1=c1;
        this.name=name;
    }
    @Override
    public void  run(){
        synchronized (this) {
            System.out.println("Welcome");
            c1.fun(name);
        }
    }

}
class ThreadB extends  Thread{
    Common c1;
    String name;
    public  ThreadB(Common c1,String name){
        this.c1=c1;
        this.name=name;
    }
    public  void  run(){
        synchronized (this) {
            System.out.println("Welcome");
            c1.fun(name);
        }
    }
}
