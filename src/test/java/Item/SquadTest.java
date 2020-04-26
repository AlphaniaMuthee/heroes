package Item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquadTest {

    @Test
    public void getTitle() {
        Squad trial = new Squad("X-men","Fight Crime",15);
        assertEquals("X-men",trial.getTitle());
    }

}