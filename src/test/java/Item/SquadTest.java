package Item;


import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Test
    public void NewSquadObjectGetsCorrectlyCreated_true() throws Exception {
        Squad squad = setupNewSquad();
        assertEquals(true, squad instanceof Squad);

    }
    @Test
    public void SquadInstantiatesWithTitle_String() throws Exception {
        Squad squad = setupNewSquad();
        assertEquals("X-men", squad.getTitle());
    }
    public Squad setupNewSquad() {
        return new Squad("X-men","Fight Crime",15);
    }

}