package weekTwo;


import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a planet");
        String Planet = console.nextLine();
        String message;

        switch (Planet) {
            case "Earth":
                message = "Life lives on it";
                break;
            case "Mars":
                message = "its red";
                break;
            case "Venus":
                message = "its hot";
                break;
            case "Saturn":
                message = "it has rings";
                break;
            default:
                message = "invalid planet";
                break;

        }
        System.out.println(message);
    }
}
