package SoftEng1.observerPattern;

public interface NewsLetter {
    public void sub(Subscriber subscriber);
    public void unsub(Subscriber subscriber);
    public String notifySubscriber();
}
