import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenderTest {
    @Test
    public void genderColor() {
        assertEquals(Gender.FEMALE.toString(), "female");
    }
}
