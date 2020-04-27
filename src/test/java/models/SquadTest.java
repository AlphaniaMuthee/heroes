package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquadTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        Squad.clearWholeSquad();
    }

    @Test
    public void squadCorrectlyCreated_true() throws Exception {
        Squad squad=createSquad();
        assertEquals(true,squad instanceof Squad);
    }

    @Test
    public void squadCorrectlyInstantiated_true() throws Exception {
        Squad squad= createSquad();
        assertEquals(01,squad.getId());
        assertEquals("X-men",squad.getTitle());
        assertEquals("Fighting crime",squad.getIdeal());
        assertEquals(5, squad.getMaximum());
    }

    @Test
    public void squadHasAllSquads() throws Exception {
        Squad squad= createSquad();
        Squad anotherSquad= new Squad(2,"Men In Black", "Fight business crimes", 6);
        assertEquals(2,Squad.getAll().size());
    }

    @Test
    public void findMultipleSquads() throws Exception {
        Squad squad= createSquad();
        Squad anotherSquad= new Squad(2,"Men In Black", "Fight business crimes", 6);
        assertEquals(2,Squad.findById(anotherSquad.getId()).getId());
    }

    @Test
    public void squadsFoundCorrectlyById() throws Exception {
        Squad squad= createSquad();
        assertEquals(1, Squad.findById(squad.getId()).getId());
    }

    @Test
    public void updateSquadDetails() {
        Squad squad= createSquad();
        int previousId=squad.getId();
        String previousTitle=squad.getTitle();
        String previousIdeal = squad.getIdeal();

        squad.update("Men In Black","Fight business crimes");

        assertEquals(previousId,squad.getId());
        assertNotEquals(previousTitle,squad.getTitle());
        assertNotEquals(previousIdeal,squad.getIdeal());
    }

    @Test
    public void deleteByIdRemovesSquadById_true() throws Exception {
        Squad squad=createSquad();
        Squad anotherSquad= new Squad(2,"Men In Black", "Fight business crimes", 6);
        squad.deleteSquad();
        assertEquals(1,squad.getAll().size());
        assertEquals(squad.getAll().get(0).getId(),2);
    }

    @Test
    public void clearAllClearsSquadList_true() throws Exception {
        Squad squad=createSquad();
        Squad anotherSquad=createSquad();
        Squad.clearWholeSquad();
        assertEquals(0,Squad.getAll().size());
    }


    public Squad createSquad() {
        return new Squad(01,"X-men", "Fighting crime", 5);
    }
}