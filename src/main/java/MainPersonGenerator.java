
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

public class MainPersonGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainPersonGenerator.class);


    public static void main(String[] args) {

        Person child =
                new Person.Builder("FirstPerson", AgeGroup.CHILD).withHairColor(HairColor.BLACK)
                        .withEyeColor(EyeColor.BLUE).build();
        System.out.println("Let me see "+child.toString());

      /*  if (!child.getEyeColor().name().equals(EyeColor.BLUE.name())) {
            LOGGER.info("A non blue eye child was created");
        } else {
            LOGGER.info("A blue eye child was created");
        }*/


    }
}
