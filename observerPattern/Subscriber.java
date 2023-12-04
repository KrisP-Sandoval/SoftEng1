package SoftEng1.observerPattern;
import java.util.*;

public class Subscriber implements Observer{
    private String subscriberName;

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void updateNews(NewsAgency newsAgency) {

    }
}
