import java.util.UUID;

abstract class User {
    private static int totalUsers;
    private String userId;
    private String name;
    private String contactInfo;

    User(){
        userId = generateUniqueId();
        name = null;
        contactInfo = null;
    }

    User(String name, String contactInfo){
        this.name = name;
        this.contactInfo = contactInfo;
    }

    User(User other){
        this.userId = generateUniqueId();
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }

    String getContactInfo() {
        return contactInfo;
    }

    void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getUserId() {
        return userId;
    }

    final String generateUniqueId() {
        return "User-"+(++totalUsers);
    }

    public static int getTotalUsers()
    {
        return totalUsers;
    }

    abstract void displayDashboard();

    abstract boolean canBorrowBooks();
}
