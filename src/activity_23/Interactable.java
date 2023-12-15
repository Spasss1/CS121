// Interfaces package

// Interface
interface Interactable {
    void performInteraction();
}

// Class implementing Interactable
class UserInteractor implements Interactable {
    @Override
    public void performInteraction() {
        System.out.println("User is liking, commenting, and sharing posts.");
    }
}

// Class implementing Interactable
class AdminInteractor implements Interactable {
    @Override
    public void performInteraction() {
        System.out.println("Admin is handling interactions on the platform.");
    }
}

// Test class for Interfaces
public class InterfacesTest {
    public static void main(String[] args) {
        // Instantiate classes implementing the interface
        UserInteractor userInteractor = new UserInteractor();
        AdminInteractor adminInteractor = new AdminInteractor();

        // Call interface method for each class instance
        userInteractor.performInteraction();
        adminInteractor.performInteraction();
    }
}
