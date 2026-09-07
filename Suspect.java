public class Suspect {

    private String name;
    private String occupation;
    private String description;
    private String statement;
    private boolean questioned;

    public Suspect(String name, String occupation, String description, String statement) {

        this.name = name;
        this.occupation = occupation;
        this.description = description;
        this.statement = statement;
        this.questioned = false;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getDescription() {
        return description;
    }

    public String getStatement() {
        return statement;
    }

    public boolean isQuestioned() {
        return questioned;
    }

    public void question() {
        questioned = true;
    }

    public void displayProfile() {

        System.out.println();
        System.out.println("========== SUSPECT PROFILE ==========");
        System.out.println("Name: " + name);
        System.out.println("Occupation: " + occupation);
        System.out.println();
        System.out.println(description);
        System.out.println();
        System.out.println("Statement:");
        System.out.println("\"" + statement + "\"");
        System.out.println();
        System.out.println("Status: " + (questioned ? "Questioned" : "Not Questioned"));
        System.out.println("=====================================");
    }
}