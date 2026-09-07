import java.util.ArrayList;

public class Investigation {

    private ArrayList<Evidence> evidenceList;
    private ArrayList<Suspect> suspects;
    private ArrayList<Puzzle> puzzles;
    private boolean securityOfficeUnlocked;

    public Investigation() {
        evidenceList = new ArrayList<>();
        suspects = new ArrayList<>();
        puzzles = new ArrayList<>();
        securityOfficeUnlocked = false;
    }

    // ================= EVIDENCE =================

    public void addEvidence(Evidence evidence) {
        evidenceList.add(evidence);
    }

    public void showEvidence() {

        System.out.println();
        System.out.println("========== EVIDENCE ==========");

        if (evidenceList.isEmpty()) {
            System.out.println("No evidence has been collected yet.");
        } else {

            for (int i = 0; i < evidenceList.size(); i++) {

                Evidence evidence = evidenceList.get(i);

                System.out.println();
                System.out.println((i + 1) + ". " + evidence.getName());
                System.out.println("   " + evidence.getDescription());
                System.out.println("   Status: " + evidence.getStatus());
            }
        }

        System.out.println("==============================");
    }

    public ArrayList<Evidence> getEvidenceList() {
        return evidenceList;
    }

    public int getEvidenceCount() {
        return evidenceList.size();
    }
    
    public boolean hasEvidence(String name) {

    for (Evidence evidence : evidenceList) {

        if (evidence.getName().equalsIgnoreCase(name)) {
            return true;
        }
    }

    return false;
}

    // ================= SUSPECTS =================

    public void addSuspect(Suspect suspect) {
        suspects.add(suspect);
    }

    public ArrayList<Suspect> getSuspects() {
        return suspects;
    }

    public ArrayList<Suspect> getSuspectList() {
        return suspects;
    }

    public int getQuestionedSuspectCount() {

        int count = 0;

        for (Suspect suspect : suspects) {

            if (suspect.isQuestioned()) {
                count++;
            }
        }

        return count;
    }

    // ================= PUZZLES =================

    public void addPuzzle(Puzzle puzzle) {
        puzzles.add(puzzle);
    }

    public ArrayList<Puzzle> getPuzzles() {
        return puzzles;
    }

    public int getSolvedPuzzleCount() {

        int count = 0;

        for (Puzzle puzzle : puzzles) {

            if (puzzle.isSolved()) {
                count++;
            }
        }

        return count;
    }

    // ================= STATUS =================

    public void showStatus() {

        int solvedPuzzles = getSolvedPuzzleCount();

        System.out.println();
        System.out.println("======= INVESTIGATION STATUS =======");
        System.out.println("Evidence collected : " + getEvidenceCount());
        System.out.println("Suspects questioned: " + getQuestionedSuspectCount());
        System.out.println("Puzzles solved     : " + solvedPuzzles);

        int progress = getEvidenceCount() * 10
                + getQuestionedSuspectCount() * 10
                + solvedPuzzles * 20;

        if (progress > 100) {
            progress = 100;
        }

        System.out.println("Case progress      : " + progress + "%");
        System.out.println("====================================");
    }
public boolean isSecurityOfficeUnlocked() {
    return securityOfficeUnlocked;
}

public void unlockSecurityOffice() {
    securityOfficeUnlocked = true;
}
}