import java.util.Scanner;

public class Puzzle {

    private String name;
    private String description;
    private String answer;
    private boolean solved;

    public Puzzle(String name, String description, String answer) {
        this.name = name;
        this.description = description;
        this.answer = answer;
        this.solved = false;
    }

    public String getName() {
        return name;
    }

    public boolean isSolved() {
        return solved;
    }

    public boolean solve(Scanner scanner) {

        if (solved) {
            System.out.println();
            System.out.println("This puzzle has already been solved.");
            return true;
        }

        System.out.println();
        System.out.println("========== PUZZLE ==========");
        System.out.println(name);
        System.out.println();
        System.out.println(description);
        System.out.println();
        System.out.print("Enter your answer: ");

       String playerAnswer = scanner.nextLine();

System.out.println();


if (playerAnswer.trim().equalsIgnoreCase(answer)) {
            solved = true;

            System.out.println();
            System.out.println("[PUZZLE SOLVED]");
            System.out.println("Correct. The terminal unlocks.");
            return true;
        }

        System.out.println();
        System.out.println("[INCORRECT]");
        System.out.println("That answer doesn't work.");
        return false;
    }
}