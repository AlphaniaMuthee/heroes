package Item;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    public void Hero_available() {
        Hero test = new Hero ("Wolverine", 38, "Retractable bone claws & superhuman strength", "Poor eye-sight");
        assertEquals("Wolverine", test.getName());
    }

    @Test
    public void Hero_Age() {
        Hero test = new Hero ("Wolverine", 38, "Retractable bone claws & superhuman strength", "Poor eye-sight");
        assertEquals( 38, test.getAge());
    }
    @Test
    public void Hero_Proficiency() {
        Hero test = new Hero ("Wolverine", 38, "Retractable bone claws & superhuman strength", "Poor eye-sight");
        assertEquals("Retractable bone claws & superhuman strength", test.getProficiency());
    }

    @Test
    public void Hero_Fragility() {
        Hero test = new Hero ("Wolverine", 38, "Retractable bone claws & superhuman strength", "Poor eye-sight");
        assertEquals("Poor eye-sight", test.getFragility());
    }

}