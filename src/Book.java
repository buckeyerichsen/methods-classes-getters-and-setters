public class Book {

    private String bookTitle;
    private String author;
    private String description;
    private int price;
    private boolean isInStock;

    public Book() {
    }

    public Book(String bookTitle, String author, String description, int price, String isInStock) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.description = description;
        this.price = price;
        isInStock = isInStock;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public void displayText() {
        System.out.println(getBookTitle());
        System.out.println(getAuthor());
        System.out.println(getDescription());

    }

    public double displayCost(int number) {
        double total = 0;

        if (isInStock()) {
            total = getPrice() * number;


        }

        return total;
    }
}





