package SoftEng1.singletonPattern;

public class QueuingSystem {
    private static QueuingSystem instance;
    private int queueNum;
    private boolean occupied;

    //this prevents instantation outside of the class
    private QueuingSystem(){

    }

    // get instance
    public static synchronized QueuingSystem getInstance() {
        if (instance == null)
            instance = new QueuingSystem();
        return instance;
    }

    public synchronized boolean occupied(){
        return occupied;
    }

    // queue Number
    public synchronized void queue(int queueNum){
        if (!occupied){
            occupied = true;
            this.queueNum = queueNum;
            System.out.println(queueNum +"  is in!");
        }
        else
            System.out.println("This desk statioin is Occupied!");
    }

    // Next Number
    public synchronized void next(){
        occupied = false;
        System.out.println(queueNum + " is done! Next in line is " + queueNum+1);
    }

}