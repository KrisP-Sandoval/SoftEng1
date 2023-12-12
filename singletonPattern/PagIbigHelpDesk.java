package SoftEng1.singletonPattern;

public class PagIbigHelpDesk {
    public static void main(String[] args) {
        //instantiate the app
        QueuingSystem sys = QueuingSystem.getInstance();

        //queue
        sys.queue(001);

        //quwu
        sys.queue(002);

        //next number
        sys.next();

        //queue next number
        sys.queue(002);
    }
}