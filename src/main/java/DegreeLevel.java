public enum DegreeLevel {
    HIGHSCHOOL("High school diploma"), BACHALEOR("Bachelor's degree"), MASTER("Master's degree"), DOCTORAL("Doctoral degree");

    private String title;

    DegreeLevel(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
