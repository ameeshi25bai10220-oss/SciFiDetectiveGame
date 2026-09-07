import java.util.Scanner;

public class Game {

    private Scanner scanner;
    private Player player;
    private Investigation investigation;

    public Game() {
        scanner = new Scanner(System.in);
        investigation = new Investigation();
    }

    // ==============================
    // START GAME
    // ==============================

    public void start() {

        System.out.println();
        System.out.println("==========================================");
        System.out.println("        NOVA STATION: CASE 01");
        System.out.println("        THE SILENT SIGNAL");
        System.out.println("==========================================");

        System.out.println();
        System.out.println("A routine research mission has gone wrong.");
        System.out.println("A scientist has disappeared.");
        System.out.println("Security systems are malfunctioning.");
        System.out.println("And someone on Nova Station is hiding the truth.");

        System.out.println();
        System.out.print("Enter your detective name: ");

        String name = scanner.nextLine();

        player = new Player(name);

        System.out.println();
        System.out.println("Welcome, Detective " + player.getName() + ".");
        System.out.println("Your investigation begins now.");

        setupInvestigation();
        showCaseInformation();
        runGameLoop();
    }

    // ==============================
    // SETUP INVESTIGATION
    // ==============================

    private void setupInvestigation() {

        investigation.addSuspect(
                new Suspect(
                        "Mira Chen",
                        "Security Officer",
                        "Responsible for maintaining Nova Station's security systems.",
                        "I was monitoring the security systems when the alarm went off. I did not leave my post."
                )
        );

        investigation.addSuspect(
                new Suspect(
                        "Victor Drake",
                        "Research Assistant",
                        "Worked closely with the missing scientist before the incident.",
                        "I was working in the laboratory. I didn't see anything unusual before the systems failed."
                )
        );

        investigation.addSuspect(
                new Suspect(
                        "Lena Ortiz",
                        "Medical Officer",
                        "Responsible for the medical facilities and crew health records.",
                        "The medical bay was empty when I arrived. I only examined the records after the alarm."
                )
        );
                Puzzle securityPuzzle = new Puzzle(
                "Security Terminal",
                "The terminal is locked.\n"
                + "It asks: How many sectors does Nova Station have multiplied by 3?\n"
                + "Hint: Nova Station has 4 sectors.",
                "12"
        );

        investigation.addPuzzle(securityPuzzle);
    }

    // ==============================
    // CASE INFORMATION
    // ==============================

    private void showCaseInformation() {

        System.out.println();
        System.out.println("==========================================");
        System.out.println("              CASE INFORMATION");
        System.out.println("==========================================");

        System.out.println();
        System.out.println("Case: The Silent Signal");

        System.out.println();
        System.out.println("Location: Nova Research Station");

        System.out.println();
        System.out.println("Incident:");
        System.out.println("Dr. Elias Voss, a senior research scientist,");
        System.out.println("has disappeared from the station.");

        System.out.println();
        System.out.println("Current Situation:");
        System.out.println("- Security systems are malfunctioning.");
        System.out.println("- Communication with Earth has been interrupted.");
        System.out.println("- Several station records are missing.");
        System.out.println("- Three people may have information about the incident.");

        System.out.println();
        System.out.println("Objective:");
        System.out.println("Investigate Nova Station, collect evidence,");
        System.out.println("question suspects, solve the mystery,");
        System.out.println("and determine what happened to Dr. Voss.");

        System.out.println("==========================================");
    }

    // ==============================
    // MAIN GAME LOOP
    // ==============================

    private void runGameLoop() {

        boolean gameRunning = true;

        while (gameRunning) {

            System.out.println();
            System.out.println("=================================");
            System.out.println("        INVESTIGATION MENU");
            System.out.println("=================================");
           System.out.println("1. Explore Nova Station");
System.out.println("2. View Case Information");
System.out.println("3. View Investigation Status");
System.out.println("4. View Inventory");
System.out.println("5. View Evidence");
System.out.println("6. View Suspects");
System.out.println("7. Solve Puzzles");
System.out.println("8. Resolve Case");
System.out.println("9. Exit Game");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    exploreStation();
                    break;

                case "2":
                    showCaseInformation();
                    break;

                case "3":
                    showInvestigationStatus();
                    break;

                case "4":
                    player.showInventory();
                    break;

                case "5":
                    investigation.showEvidence();
                    break;

                case "6":
                    investigateSuspects();
                    break;

                case "7":
                    solvePuzzles();
                    break;

                case "8":
                    resolveCase();
                    break;

                case "9":
                    exitGame();
                    return;

                default:
                    System.out.println();
                    System.out.println("Invalid choice.");
                    System.out.println("Please enter a number from 1 to 8.");            }
        }

        scanner.close();
    }

    // ==============================
    // EXPLORATION
    // ==============================

    private void exploreStation() {

        boolean exploring = true;

        while (exploring) {

            System.out.println();
            System.out.println("=================================");
            System.out.println("         NOVA STATION");
            System.out.println("=================================");
            System.out.println("1. Research Laboratory");
            System.out.println("2. Security Office");
            System.out.println("3. Medical Bay");
            System.out.println("4. Return to Investigation Menu");
            System.out.println("=================================");

            System.out.print("Choose a location: ");
            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    researchLaboratory();
                    break;

                case "2":
                    securityOffice();
                    break;

                case "3":
                    medicalBay();
                    break;

                case "4":
                    exploring = false;
                    System.out.println("Returning to investigation menu...");
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid choice.");
                    System.out.println("Please select a number from 1 to 4.");
            }
        }
    }

    // ==============================
    // RESEARCH LABORATORY
    // ==============================

    private void researchLaboratory() {

        System.out.println();
        System.out.println("==========================================");
        System.out.println("          RESEARCH LABORATORY");
        System.out.println("==========================================");

        System.out.println();
        System.out.println("The laboratory is unusually quiet.");
        System.out.println("Several monitors are still running.");

        if (!player.hasItem("Strange Data Chip")) {

            System.out.println();
            System.out.println("You notice a small data chip lying");
            System.out.println("beside one of the research terminals.");

            System.out.println();
            System.out.println("You pick up the Strange Data Chip.");

            player.addItem("Strange Data Chip");

            Evidence evidence = new Evidence(
                    "Strange Data Chip",
                    "A data chip found inside the research laboratory. It may contain important information."
            );

            investigation.addEvidence(evidence);

        } else {

            System.out.println();
            System.out.println("You have already searched this area.");
            System.out.println("Nothing else immediately stands out.");
        }

        System.out.println();
        System.out.println("Press ENTER to continue.");
        scanner.nextLine();
    }

    // ==============================
    // SECURITY OFFICE
    // ==============================

    private void securityOffice() {

        System.out.println();
        System.out.println("==========================================");
        System.out.println("             SECURITY OFFICE");
        System.out.println("==========================================");

        System.out.println();

        if (!investigation.isSecurityOfficeUnlocked()) {

            System.out.println();
            System.out.println("The Security Office is locked.");
            System.out.println("You need to unlock the security terminal first.");

        } else {

            System.out.println();
            System.out.println("The security terminal has been unlocked.");
            System.out.println("The Security Office door opens.");

            System.out.println();
            System.out.println("Inside, several security terminals");
            System.out.println("display corrupted system logs.");

            System.out.println();
            System.out.println("One terminal contains a partially recovered access log.");

            System.out.println();
            System.out.println("SECURITY LOG FRAGMENT");
            System.out.println("----------------------");
            System.out.println("23:41 - Research Laboratory access detected.");
            System.out.println("23:43 - Access authorization: STAFF LEVEL 2");
            System.out.println("23:45 - Laboratory systems disconnected.");
            System.out.println("----------------------");

            if (!investigation.hasEvidence("Security Log Fragment")) {

    Evidence securityLog = new Evidence(
            "Security Log Fragment",
            "A recovered security log shows that someone with"
            + " STAFF LEVEL 2 access entered the Research Laboratory"
            + " shortly before the systems were disconnected."
    );

    investigation.addEvidence(securityLog);

    System.out.println();
    System.out.println("[NEW EVIDENCE]");
    System.out.println("Security Log Fragment has been added to your evidence.");

} else {

    System.out.println();
    System.out.println("You have already collected this evidence.");
}
        }

        System.out.println();
        System.out.println("Press ENTER to continue.");
        scanner.nextLine();
    }

    // ==============================
    // MEDICAL BAY
    // ==============================

    private void medicalBay() {

        System.out.println();
        System.out.println("==========================================");
        System.out.println("               MEDICAL BAY");
        System.out.println("==========================================");

        System.out.println();
        System.out.println("The medical bay is empty.");

        if (!player.hasItem("Medical Report")) {

            System.out.println();
            System.out.println("You search through the medical records.");

            System.out.println();
            System.out.println("You find a medical report connected");
            System.out.println("to Dr. Elias Voss.");

            System.out.println();
            System.out.println("You take the Medical Report.");

            player.addItem("Medical Report");

            Evidence evidence = new Evidence(
                    "Medical Report",
                    "A medical report belonging to Dr. Elias Voss. It may reveal something about his condition."
            );

            investigation.addEvidence(evidence);

        } else {

            System.out.println();
            System.out.println("You have already searched the medical bay.");
            System.out.println("There is nothing new to find.");
        }

        System.out.println();
        System.out.println("Press ENTER to continue.");
        scanner.nextLine();
    }

    // ==============================
    // SUSPECT INVESTIGATION
    // ==============================

    private void investigateSuspects() {

        boolean viewingSuspects = true;

        while (viewingSuspects) {

            System.out.println();
            System.out.println("========== SUSPECT INVESTIGATION ==========");
            System.out.println();

            System.out.println("1. Mira Chen");
            System.out.println("2. Victor Drake");
            System.out.println("3. Lena Ortiz");
            System.out.println("4. Return to Investigation Menu");
            System.out.println();

            System.out.print("Select a suspect: ");
            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    questionSuspect(0);
                    break;

                case "2":
                    questionSuspect(1);
                    break;

                case "3":
                    questionSuspect(2);
                    break;

                case "4":
                    viewingSuspects = false;
                    System.out.println("Returning to investigation menu...");
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid choice.");
                    System.out.println("Please select a number from 1 to 4.");
            }
        }
    }

// ==============================
// PUZZLE SYSTEM
// ==============================

private void solvePuzzles() {

    System.out.println();
    System.out.println("========== PUZZLES ==========");

    if (investigation.getPuzzles().isEmpty()) {
        System.out.println("No puzzles are currently available.");
        return;
    }

    for (int i = 0; i < investigation.getPuzzles().size(); i++) {

        Puzzle puzzle = investigation.getPuzzles().get(i);

        System.out.println(
                (i + 1) + ". "
                + puzzle.getName()
                + (puzzle.isSolved() ? " [SOLVED]" : "")
        );
    }

    System.out.println();
    System.out.print("Select a puzzle (0 to go back): ");

    String input = scanner.nextLine();

    try {

        int choice = Integer.parseInt(input);

        if (choice == 0) {
            return;
        }

        if (choice < 1 || choice > investigation.getPuzzles().size()) {
            System.out.println("Invalid puzzle selection.");
            return;
        }

        Puzzle selectedPuzzle =
                investigation.getPuzzles().get(choice - 1);

        if (selectedPuzzle.solve(scanner)) {

    if (selectedPuzzle.getName().equals("Security Terminal")) {

        investigation.unlockSecurityOffice();

        System.out.println();
        System.out.println("[NEW LOCATION UNLOCKED]");
        System.out.println("Security Office is now accessible.");
    }
}

    } catch (NumberFormatException e) {

        System.out.println("Please enter a valid number.");
    }
}

    // ==============================
    // QUESTION SUSPECT
    // ==============================

    private void questionSuspect(int index) {

        Suspect suspect = investigation.getSuspectList().get(index);

        System.out.println();
        System.out.println("==========================================");
        System.out.println("            SUSPECT INTERVIEW");
        System.out.println("==========================================");

        System.out.println();
        System.out.println("Name: " + suspect.getName());
        System.out.println("Occupation: " + suspect.getOccupation());

        System.out.println();
        System.out.println(suspect.getDescription());

        System.out.println();

        if (!suspect.isQuestioned()) {

            System.out.println("You begin questioning " + suspect.getName() + "...");

            System.out.println();

            System.out.println(suspect.getName() + ":");
            System.out.println("\"" + suspect.getStatement() + "\"");
            if (suspect.getName().equals("Victor Drake")
        && investigation.hasEvidence("Security Log Fragment")) {

    System.out.println();
    System.out.println("[EVIDENCE COMPARISON]");
    System.out.println("The Security Log Fragment indicates that");
    System.out.println("someone with STAFF LEVEL 2 access entered");
    System.out.println("the Research Laboratory at 23:41.");

    System.out.println();
    System.out.println("Victor's statement may require further investigation.");
}

            suspect.question();

            System.out.println();
            System.out.println("You record the statement in the case file.");

        } else {

            System.out.println(
                    "You have already questioned "
                    + suspect.getName()
                    + "."
            );

            System.out.println();

            System.out.println("Recorded statement:");
            System.out.println("\"" + suspect.getStatement() + "\"");
        }

        System.out.println();
        System.out.println("Press ENTER to return.");
        scanner.nextLine();
    }

    // ==============================
// INVESTIGATION STATUS
// ==============================

private void showInvestigationStatus() {

    System.out.println();
    System.out.println("======= INVESTIGATION STATUS =======");

    System.out.println("Evidence collected : "
            + investigation.getEvidenceCount());

    System.out.println("Suspects questioned: "
            + investigation.getQuestionedSuspectCount());

    System.out.println("Puzzles solved     : "
            + investigation.getSolvedPuzzleCount());

    int progress = investigation.getEvidenceCount() * 10
            + investigation.getQuestionedSuspectCount() * 10
            + investigation.getSolvedPuzzleCount() * 20;

    if (progress > 100) {
        progress = 100;
    }

    System.out.println("Case progress      : " + progress + "%");

    System.out.println("====================================");
}

// ==============================
// CASE RESOLUTION
// ==============================

private void resolveCase() {

    System.out.println();
    System.out.println("==========================================");
    System.out.println("             CASE RESOLUTION");
    System.out.println("==========================================");

    int evidenceCount = investigation.getEvidenceCount();
    int suspectsQuestioned = investigation.getQuestionedSuspectCount();
    int puzzlesSolved = investigation.getSolvedPuzzleCount();

    if (evidenceCount < 3 || suspectsQuestioned < 3 || puzzlesSolved < 1) {

        System.out.println();
        System.out.println("You do not have enough information to resolve the case.");

        System.out.println();
        System.out.println("Investigation requirements:");
        System.out.println("- At least 3 pieces of evidence");
        System.out.println("- All 3 suspects questioned");
        System.out.println("- Security terminal puzzle solved");

        System.out.println();
        System.out.println("Current progress:");
        System.out.println("Evidence collected : " + evidenceCount);
        System.out.println("Suspects questioned: " + suspectsQuestioned);
        System.out.println("Puzzles solved     : " + puzzlesSolved);

        System.out.println();
        System.out.println("You should continue investigating.");

        System.out.println();
        System.out.println("Press ENTER to return.");
        scanner.nextLine();
        return;
    }

    System.out.println();
    System.out.println("You have gathered enough evidence.");
    System.out.println("It is time to identify the person responsible.");

    System.out.println();
    System.out.println("Who do you believe is responsible?");
    System.out.println();
    System.out.println("1. Mira Chen");
    System.out.println("2. Victor Drake");
    System.out.println("3. Lena Ortiz");
    System.out.println("4. Continue investigating");
    System.out.println();

    System.out.print("Enter your accusation: ");
    String choice = scanner.nextLine();

    switch (choice) {

        case "1":
            checkAccusation("Mira Chen");
            break;

        case "2":
            checkAccusation("Victor Drake");
            break;

        case "3":
            checkAccusation("Lena Ortiz");
            break;

        case "4":
            System.out.println();
            System.out.println("You decide to continue investigating.");
            System.out.println("The case remains open.");
            break;

        default:
            System.out.println();
            System.out.println("Invalid accusation.");
            System.out.println("Please select a number from 1 to 4.");
            break;
    }

    System.out.println();
    System.out.println("Press ENTER to return.");
    scanner.nextLine();
}

// ==============================
// CHECK ACCUSATION
// ==============================

private void checkAccusation(String accusedName) {

    System.out.println();
    System.out.println("You accuse " + accusedName + ".");
    System.out.println();

    if (accusedName.equals("Victor Drake")) {

        System.out.println("[CASE SOLVED]");
        System.out.println();
        System.out.println("Your evidence points to Victor Drake.");
        System.out.println("The Security Log Fragment places a");
        System.out.println("STAFF LEVEL 2 access card inside the");
        System.out.println("Research Laboratory at 23:41.");

        System.out.println();
        System.out.println("Victor's statement does not fully match");
        System.out.println("the recovered security records.");

        System.out.println();
        System.out.println("The investigation is complete.");
        System.out.println("Victor Drake has been identified as the");
        System.out.println("primary suspect responsible for the incident.");

        System.out.println();
        System.out.println("========== CASE CLOSED ==========");

    } else {

        System.out.println("[INCORRECT ACCUSATION]");
        System.out.println();
        System.out.println("The evidence does not support your accusation.");
        System.out.println("The case remains unresolved.");

        System.out.println();
        System.out.println("You must continue investigating.");
    }
}


    // ==============================
    // EXIT
    // ==============================

    private void exitGame() {

        System.out.println();
        System.out.println("==========================================");
        System.out.println("          INVESTIGATION TERMINATED");
        System.out.println("==========================================");

        System.out.println();
        System.out.println("Thank you for playing, Detective "
                + player.getName() + ".");

        System.out.println();
        System.out.println("Nova Station remains silent...");
    }
}