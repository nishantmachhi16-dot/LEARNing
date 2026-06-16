class Threadss extends Thread {

public void run(){

System.out.println("Hello");

}
   
}

class Threadss2 implements Runnable {

synchronized public void run(){

System.out.println("bye");

}
   
}



public class Threads{
    

public static void main(String[] args) {
    
Threadss t1 = new Threadss();

t1.setPriority(1);

System.out.println(t1.getPriority());

t1.start();


Thread t2 = new Thread(new Threadss2());

t2.setDaemon(true);

t2.setPriority(10);

t2.start();

}

    
}