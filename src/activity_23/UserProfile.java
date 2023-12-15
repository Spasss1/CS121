// AbstractClasses package

abstract class UserProfile {
    // Abstract method
    public abstract String getProfileInfo();
}

class User extends UserProfile {
    // Additional attributes specific to User
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public String getProfileInfo() {
        return "User Profile: Username - " + username;
    }
}

class Admin extends UserProfile {
    // Additional attributes specific to Admin
    private String adminName;

    public Admin(String adminName) {
        this.adminName = adminName;
    }

    @Override
    public String getProfileInfo() {
        return "Admin Profile: Admin Name - " + adminName;
    }
}

// Test class for AbstractClasses
public class AbstractClassesTest {
    public static void main(String[] args) {
        // Instantiate subclasses
        User user = new User("JohnDoe");
        Admin admin = new Admin("Admin123");

        // Call abstract method for each subclass instance
        System.out.println(user.getProfileInfo());
        System.out.println(admin.getProfileInfo());
    }
}
