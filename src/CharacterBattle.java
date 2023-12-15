import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Character Battle Game!");
        System.out.print("Enter the number of rounds (odd number): ");
        int numRounds = scanner.nextInt();

        if (numRounds % 2 == 0) {
            System.out.println("Please enter an odd number of rounds.");
            return;
        }

        int player1Wins = 0;
        int player2Wins = 0;

        for (int round = 1; round <= numRounds; round++) {
            System.out.println("\nRound " + round + ":");
            Character player1 = createCharacter(scanner, "Player 1");
            Character player2 = createCharacter(scanner, "Player 2");

            int speedComparison = Integer.compare(player1.getSpeed(), player2.getSpeed());

            if (speedComparison > 0) {
                player1Attack(player1, player2);
                if (player2.getHitPoints() <= 0) {
                    player1Wins++;
                    System.out.println("Player 1 is the round winner!");
                } else {
                    player2Attack(player1, player2);
                    if (player1.getHitPoints() <= 0) {
                        player2Wins++;
                        System.out.println("Player 2 is the round winner!");
                    }
                }
            } else if (speedComparison < 0) {
                player2Attack(player1, player2);
                if (player1.getHitPoints() <= 0) {
                    player2Wins++;
                    System.out.println("Player 2 is the round winner!");
                } else {
                    player1Attack(player1, player2);
                    if (player2.getHitPoints() <= 0) {
                        player1Wins++;
                        System.out.println("Player 1 is the round winner!");
                    }
                }
            } else {
                // Speeds are equal; use random number to decide
                int randomWinner = random.nextInt(2);
                if (randomWinner == 0) {
                    player1Attack(player1, player2);
                    if (player2.getHitPoints() <= 0) {
                        player1Wins++;
                        System.out.println("Player 1 is the round winner!");
                    } else {
                        player2Attack(player1, player2);
                        if (player1.getHitPoints() <= 0) {
                            player2Wins++;
                            System.out.println("Player 2 is the round winner!");
                        }
                    }
                } else {
                    player2Attack(player1, player2);
                    if (player1.getHitPoints() <= 0) {
                        player2Wins++;
                        System.out.println("Player 2 is the round winner!");
                    } else {
                        player1Attack(player1, player2);
                        if (player2.getHitPoints() <= 0) {
                            player1Wins++;
                            System.out.println("Player 1 is the round winner!");
                        }
                    }
                }
            }
        }

        System.out.println("\nFinal Scores:");
        System.out.println("Player 1 wins: " + player1Wins);
        System.out.println("Player 2 wins: " + player2Wins);

        if (player1Wins > player2Wins) {
            System.out.println("Player 1 has won the battle!");
        } else if (player2Wins > player1Wins) {
            System.out.println("Player 2 has won the battle!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    private static Character createCharacter(Scanner scanner, String playerName) {
        System.out.println(playerName + ", enter your character's stats:");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Hit Points: ");
        int hitPoints = scanner.nextInt();
        System.out.print("Move: ");
        String move = scanner.next();
        System.out.print("Move's Power: ");
        int movePower = scanner.nextInt();
        System.out.print("Attack Speed: ");
        int attackSpeed = scanner.nextInt();

        return new Character(name, hitPoints, move, movePower, attackSpeed);
    }

    private static void player1Attack(Character player1, Character player2) {
        player2.setHitPoints(player2.getHitPoints() - player1.getMovePower());
    }

    private static void player2Attack(Character player1, Character player2) {
        player1.setHitPoints(player1.getHitPoints() - player2.getMovePower());
    }
}

class Character {
    private String name;
    private int hitPoints;
    private String move;
    private int movePower;
    private int attackSpeed;

    public Character(String name, int hitPoints, String move, int movePower, int attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }

    public int getSpeed() {
        return attackSpeed;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMovePower() {
        return movePower;
    }
}

