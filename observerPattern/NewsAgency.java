package SoftEng1.observerPattern;
import java.util.*;

public class NewsAgency implements NewsLetter{
    private String news;
    private String link;
    private List<Subscriber> subscriberList ;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getLink() {
        return link;
    }

    public void setLink (String link) {
        this.link = link;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public void sub(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsub(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public String notifySubscriber() {
        String output = new String();
        for(Subscriber client : subscriberList){
            output +=  "Hey, " + client.getSubscriberName() + "!\n";
            output += "New today " + news + " click the link to know more: " + link +"!\n\n";
        }
        return output;
    }
}
