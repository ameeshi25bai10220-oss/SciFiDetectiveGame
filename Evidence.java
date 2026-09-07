public class Evidence {

    private String name;
    private String description;
    private boolean analyzed;

    public Evidence(String name, String description) {
        this.name = name;
        this.description = description;
        this.analyzed = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAnalyzed() {
        return analyzed;
    }

    public void analyze() {
        analyzed = true;
    }

    public String getStatus() {
        if (analyzed) {
            return "Analyzed";
        }

        return "Not Analyzed";
    }
}