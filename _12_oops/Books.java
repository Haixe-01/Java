package _12_oops;

public class Books {
    String name;
    int pages;

    Books(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    String displayBooks() {
        return this.name + " (" + this.pages + ") " + "pages";
    }
}
