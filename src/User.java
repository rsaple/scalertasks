import java.util.UUID;

abstract class User {
    String userId;
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

        User(other.name, other.contactInfo);
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

    String generateUniqueId() {
        return UUID.randomUUID().toString();
    }

    abstract void displayDashboard();

    abstract boolean canBorrowBooks();

}
