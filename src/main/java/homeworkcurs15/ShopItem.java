package homeworkcurs15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public interface ShopItem {
    String name();
    int price();
    Category category();
}

enum Category {
    ON_SALE, NEW, REFURBISHED;
}

class Clothes implements ShopItem {
    private String name;
    private int price;
    private Category category;

    public Clothes(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String name() {
        return name;
    }

    public int price() {
        return price;
    }

    public Category category() {
        return category;
    }
}

class Electronics implements ShopItem {
    private String name;
    private int price;
    private Category category;

    public Electronics(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String name() {
        return name;
    }

    public int price() {
        return price;
    }

    public Category category() {
        return category;
    }
}

class Fruits implements ShopItem {
    private String name;
    private int price;
    private Category category;

    public Fruits(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String name() {
        return name;
    }

    public int price() {
        return price;
    }

    public Category category() {
        return category;
    }
}

class Shop<T extends ShopItem> {
    private List<T> items;

    public Shop() {
        items = new ArrayList<T>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> findByCategory(Category cat) {
        List<T> result = new ArrayList<T>();
        for (T item : items) {
            if (item.category() == cat) {
                result.add(item);
            }
        }
        return result;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        List<T> result = new ArrayList<T>();
        for (T item : items) {
            if (item.price() <= maxPrice) {
                result.add(item);
            }
        }
        return result;
    }

    public Optional<T> findByName(String name) {
        for (T item : items) {
            if (item.name().equals(name)) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    public Optional<T> removeItem(String name) {
        for (Iterator<T> iter = items.iterator(); iter.hasNext(); ) {
            T item = iter.next();
            if (item.name().equals(name)) {
                iter.remove();
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }
}

