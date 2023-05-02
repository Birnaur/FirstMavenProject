package homeworkcurs13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class QuoteService {
    private List<Quote> quotes;

    public QuoteService(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<String> getAllQuotes() {
        return quotes.stream()
                .map(Quote::getQuote)
                .collect(Collectors.toList());
    }

    public List<Quote> getQuotesForAuthor(String author) {
        return quotes.stream()
                .filter(q -> q.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public List<String> getAuthors() {
        return quotes.stream()
                .map(Quote::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }

    public void setFavourite(int id) {
        quotes.stream()
                .filter(q -> q.getId() == id)
                .findFirst()
                .ifPresent(q -> q.setFavourite(true));
    }

    public List<Quote> getFavourites() {
        return quotes.stream()
                .filter(Quote::isFavourite)
                .collect(Collectors.toList());
    }

    public String getRandomQuote() {
        Random random = new Random();
        int randomIndex = random.nextInt(quotes.size());
        return quotes.get(randomIndex).getQuote();
    }
}

