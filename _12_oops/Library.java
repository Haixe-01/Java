package _12_oops;

public class Library {
    String name;
    int year;
    Books[] book;

    Library(String name, int year, Books[] book) {
        this.name = name;
        this.year = year;
        this.book = book;
    }

    void displayInfo() {
        System.out.println("From " + this.name + " libraray " + this.year + " year ");
        System.out.println("books available: ");
        for (Books b : book) {
            System.out.println(b.displayBooks());
        }

    }

}
