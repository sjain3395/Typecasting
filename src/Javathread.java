public class Javathread extends Thread {
    public static void main(String[] args){
        Javathread thread  = new Javathread();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}