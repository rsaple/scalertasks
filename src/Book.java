public abstract class Book implements Lendable {

    String isbn;
    String title;
    String author;
    boolean isAvailable;

    Book(){
        isAvailable = true;
    }

    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(Book other){
        this.isbn = other.isbn;
        this.title = other.title;
        this.author = other.author;
        this.isAvailable = true;
    }

    public boolean lend(User user){
        if (isAvailable() && user.canBorrowBooks()) {
            isAvailable = false;
            return true;
        }
        return false;
    }
    public void returnBook(User user){
        isAvailable = true;
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    abstract void displayBookDetails();
}
