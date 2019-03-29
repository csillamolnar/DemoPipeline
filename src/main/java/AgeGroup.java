public enum AgeGroup {
    CHILD, YOUTH, ADULT, SENIOR;

    @Override
    public String toString(){
        return name().toLowerCase();
    }
}
