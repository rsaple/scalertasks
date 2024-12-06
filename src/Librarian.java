class Librarian extends User {
    int employeeNumber;

    Librarian() {
        super();
    }
    Librarian(int employeeNumber) {
        super();
        this.employeeNumber = employeeNumber;
    }

    Librarian(Librarian other) {
        super(other.getName(), other.getContactInfo());
        this.employeeNumber = other.employeeNumber;
    }

    int getEmployeeNumber() {
       return employeeNumber;
    }

    void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    void displayDashboard(){
        System.out.println("Librarian Dashboard and Employee Number: " + employeeNumber);
    }

    boolean canBorrowBooks(){
        return true;
    }

    void addNewBook(Book book)
    {
        //To be implemented
    }

    void removeBook(Book book){
        //To be implemented
    }
}
