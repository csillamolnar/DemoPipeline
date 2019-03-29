import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Person child =
                new Person.Builder("FirstPerson", AgeGroup.CHILD).withHairColor(HairColor.BLACK)
                        .withEyeColor(EyeColor.BLUE).build();
        LOGGER.info(child.toString());


        Person youth =
                new Person.Builder("SecondPerson", AgeGroup.YOUTH).withHairColor(HairColor.BLOND)
                        .withGender(Gender.MALE).build();
        LOGGER.info(youth.toString());

        Person adult =
                new Person.Builder("ThirdPerson", AgeGroup.ADULT).withHairColor(HairColor.BROWN)
                        .withDegreeLevel(DegreeLevel.MASTER).build();
        LOGGER.info(adult.toString());




    }
}
