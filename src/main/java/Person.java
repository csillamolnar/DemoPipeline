public final class Person {

    private final String name;
    private final EyeColor eyeColor;
    private final HairColor hairColor;
    private final DegreeLevel degreeLevel;
    private final AgeGroup ageGroup;
    private final Gender gender;

    private Person(Builder builder) {
        this.name = builder.name;
        this.eyeColor = builder.eyeColor;
        this.hairColor = builder.hairColor;
        this.degreeLevel = builder.degreeLevel;
        this.ageGroup = builder.ageGroup;
        this.gender = builder.gender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The person name is ")
                .append(name)
                .append(", belongs to ")
                .append(ageGroup)
                .append(" life cycle group");
        if(hairColor != null){
            sb.append(", with hair "+ hairColor);
        }
        if(eyeColor != null){
            sb.append(", with eye "+ eyeColor);
        }
        if (degreeLevel!=null){
            sb.append(", with degree level "+ degreeLevel);
        }
        if (gender !=null){
            sb.append(", with gender "+gender);
        }

        return sb.toString();

    }


    public String getName() {
        return name;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public DegreeLevel getDegreeLevel() {
        return degreeLevel;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public Gender getGender(){
        return gender;
    }

    public static class Builder {

        private final String name;
        private HairColor hairColor;
        private EyeColor eyeColor;
        private DegreeLevel degreeLevel;
        private AgeGroup ageGroup;
        private Gender gender;

        /**
         * Constructor
         */
        public Builder(String name, AgeGroup ageGroup) {
            if (ageGroup == null || name == null) {
                throw new IllegalArgumentException("name and the life cycle group can not be null");
            }
            this.name = name;
            this.ageGroup = ageGroup;
        }

        public Builder withHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withEyeColor(EyeColor eyeColor) {
            this.eyeColor = eyeColor;
            return this;
        }

        public Builder withDegreeLevel(DegreeLevel degreeLevel) {
            this.degreeLevel = degreeLevel;
            return this;
        }

        public Builder withGender(Gender gender) {
            this.gender = gender;
            return this;
        }


        public Person build() {
            return new Person(this);
        }

    }
}
