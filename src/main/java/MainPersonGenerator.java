
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MainPersonGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainPersonGenerator.class);

    public static void main(String[] args) {

        Person child =
                new Person.Builder("FirstPerson", AgeGroup.CHILD).withHairColor(HairColor.BLACK)
                        .withEyeColor(EyeColor.BLUE).build();


        LOGGER.info(child.getEyeColor().name());






    }
}
