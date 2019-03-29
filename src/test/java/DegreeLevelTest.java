import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DegreeLevelTest {
    @Test
    public void testDegreeLevel() {
        assertEquals(DegreeLevel.HIGHSCHOOL.toString(), "High school diploma");
    }
}
