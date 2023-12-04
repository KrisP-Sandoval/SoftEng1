package SoftEng1.observerPattern;
import java.util.*;
public class RTS {
    public static void main(String[] args){

        Subscriber maria = new Subscriber();
        maria.setSubscriberName("Maria");

        Subscriber juan = new Subscriber();
        juan.setSubscriberName("Juan");

        Subscriber oliver = new Subscriber();
        oliver.setSubscriberName("Oliver");

        //add the subscribers to the list
        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(maria);
        subscriberList.add(juan);
        subscriberList.add(oliver);

        //create news and add the list of subscribers
        NewsAgency stock = new NewsAgency();
        stock.setNews("Jollibee Christmas Specials");
        stock.setLink("https://www.jollibee.com.ph/promos/");
        stock.setSubscriberList(subscriberList);

        //notify the subscribers
        System.out.println("News!");
        System.out.println(stock.notifySubscriber());

        // remove Juan, add Jerry and notify updates
        stock.unsub(juan);

        Subscriber jerry = new Subscriber();
        jerry.setSubscriberName("Jerry");
        stock.sub(jerry);

        // here is the updates
        System.out.println("Breaking News!");
        System.out.println(stock.notifySubscriber());
    }
}
