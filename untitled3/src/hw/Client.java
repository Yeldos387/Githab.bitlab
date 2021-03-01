package hw;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Book [] books = new Book[10];
        Library library = new Library("Central", "Alamty", books);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("list - 1");
            System.out.println("add - 2");
            System.out.println("exit - 0");
            int choice = scanner.nextInt();
            if (choice == 1) {
                library.printBooks();
            } else if (choice == 2) {
                System.out.println("id: ");
                int id = scanner.nextInt();
                System.out.println("name: ");
                String name = scanner.next();
                System.out.println("author: ");
                String author = scanner.next();
                Book book = new Book(id, name, author);
                library.addBook(book);
            } else {
                System.exit(0);
            }
        }
    }
}
