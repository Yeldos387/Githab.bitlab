package hw;

public class Library {

    private String name;
    private String city;
    private Book books[];
    private int index = 0;

    public Library(String name, String city, Book[] books) {
        this.name = name;
        this.city = city;
        this.books = books;
    }

    public void printBooks() {
        for (Book b: books) {
            try {
                b.getData();
            }catch (NullPointerException n){
                System.out.println("Полка пустая");
            }

        }
    }

    public void addBook(Book book){
        try {
            books[index] = book;
            index++;
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Мест больше нет");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
