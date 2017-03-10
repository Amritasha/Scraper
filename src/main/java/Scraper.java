import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;





/**
 * Created by amritasha on 10/03/17.
 */
public class Scraper {
    public static void main(String[] args) throws Exception {
        final Document document = Jsoup.connect("http://www.imdb.com/chart/top").get();
        System.out.println(document.outerHtml());


    }
}
