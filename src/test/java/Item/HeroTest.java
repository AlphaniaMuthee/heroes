package Item;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeroTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        Hero.clearAll();
    }

//    @Test
//    public void Hero_available() {
//        Hero hero = new Hero ("Wolverine", 38, "Retractable bone claws & superhuman strength", "Poor eye-sight", 01);
//        assertEquals("Wolverine", hero.getName());
//    }
//
//    @Test
//    public void Hero_Age() {
//        Hero hero = new Hero ("Wolverine", 38, "Retractable bone claws & superhuman strength", "Poor eye-sight", 01);
//        assertEquals( 38, hero.getAge());
//    }
//    @Test
//    public void Hero_Proficiency() {
//        Hero hero = new Hero ("Wolverine", 38, "Retractable bone claws & superhuman strength", "Poor eye-sight", 01);
//        assertEquals("Retractable bone claws & superhuman strength", hero.getProficiency());
//    }
//
//    @Test
//    public void Hero_Fragility() {
//        Hero hero = new Hero ("Wolverine", 38, "Retractable bone claws & superhuman strength", "Poor eye-sight", 01);
//        assertEquals("Poor eye-sight", hero.getFragility());
//    }

    @Test
    public void instantiateCorrectly() throws Exception{
    }
}