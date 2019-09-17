import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {

       Book one = new Book();
       int number;

       one.setAuthor("N.T. Wright");
       one.setBookTitle("justification");
       one.setDescription("New Perspective");
       one.setPrice(5);
       one.setInStock(true);

        one.displayText();

        System.out.println("how many books are present?");


        Scanner key = new Scanner(System.in);
        number = key.nextInt();


        System.out.println(one.displayCost(number));













    }
}
