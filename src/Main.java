import java.util.Scanner;

public class Main {
    public static Book[] listBook;

    public static void main(String[] args) {
        listBook = new Book[5];
        listBook[0] = new Book("Doanh nhân","author1",50,4,0.6);
        listBook[1] = new Book("Bí ẩn","author2",40,5,0.5);
        listBook[2] = new Book("Nghệ Thuật","author3",60,5,0.7);
        listBook[3] = new Book("1000 thư ngắn","author4",20,3,0.2);
        listBook[4] = new Book("Người bán hàng vĩ đại","author5",100,2,0.9);

        int totalPrice = getSumPrice(listBook);
        System.out.println("Tổng giá tiền của sách (đơn vị k): " + totalPrice);
        double totalWeight = getSumWeight(listBook);
        System.out.println("Tổng trọng lượng của sách (đơn vị kg): " + totalWeight);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();
        searchBook(bookName);

    }
    public static void searchBook(String bookName){
        int index = indexOfBook(bookName);
        if (index==-1){
            System.out.println("Not Found");
        } else {
            System.out.printf("%s have been found. Price : %d k .Quantity: %d left.Weight: " + listBook[index].getWeight() ,bookName,listBook[index].getPrice(),listBook[index].getQuantity());
        }
    }
    public static int getSumPrice(Book[] books){
        int totalPrice = 0;
        for (int i = 0; i < books.length; i++) {
            totalPrice += books[i].getTotalPrice();
        }
        return totalPrice;
    }
    public static double getSumWeight(Book[] books){
        double totalWeight = 0;
        for (int i = 0; i < books.length; i++) {
            totalWeight += books[i].getTotalWeight();
        }
        return totalWeight;
    }
    public  static int indexOfBook(String bookName){
        int index = -1;
        for (int i = 0; i < listBook.length; i++) {
            if (bookName.equals(listBook[i].getName())){
                index= i;
                break;
            }
        } return index;
    }
    }

