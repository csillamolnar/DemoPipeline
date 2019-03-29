import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testMissingName() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> new Person.Builder(null, AgeGroup.ADULT));
    }

    @Test
    public void testMissingAgeGroup() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> new Person.Builder("Person name", null));
    }

    @Test
    public void testBuildPerson() throws Exception {
        final String personName = "Good test person name";
        final Person testPerson = new Person.Builder(personName,AgeGroup.ADULT)
                .withHairColor(HairColor.BLOND)
                .withEyeColor(EyeColor.GREEN)
                .withDegreeLevel(DegreeLevel.MASTER)
                .withGender(Gender.FEMALE)
                .build();

        assertNotNull(testPerson);
        assertEquals(personName+"New", testPerson.getName());
        assertEquals(AgeGroup.ADULT, testPerson.getAgeGroup());
        assertEquals(HairColor.BLOND, testPerson.getHairColor());
        assertEquals(EyeColor.GREEN, testPerson.getEyeColor());
        assertEquals(DegreeLevel.MASTER, testPerson.getDegreeLevel());
        assertEquals(Gender.FEMALE, testPerson.getGender());
    }
}
