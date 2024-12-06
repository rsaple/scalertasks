public class Member extends User {
    int borrowedBooksCount;
    final int MAX_BORROW_LIMIT = 5;

    Member(){
        super();
    }

    Member(int borrowedBooksCount){
        super();
        this.borrowedBooksCount = borrowedBooksCount;
    }

    Member(Member other){
        super();
        this.borrowedBooksCount = other.borrowedBooksCount;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void displayDashboard(){
        System.out.println("Member Dashboard and Books Borrowed: " + borrowedBooksCount);
    }

    public boolean canBorrowBooks(){
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
