public class Book {

    private String bookTitle;
    private String author;
    private String description;
    private int price;
    private String isInStock;

    public Book() {
    }

    public Book(String bookTitle, String author, String description, int price, String isInStock) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
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

    public String getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(String isInStock) {
        this.isInStock = isInStock;
    }

    public void displayText() {
        System.out.println(getBookTitle());
        System.out.println(getAuthor());
        System.out.println(getDescription());

    }
}

