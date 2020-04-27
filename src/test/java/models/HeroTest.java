package models;

import models.Hero;
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

    @Test
   public void Hero_available() {
   Hero hero = createHero();
   assertEquals("Wolverine", hero.getName());
    }

    @Test
    public void Hero_Age() {
        Hero hero = createHero();
        assertEquals(38, hero.getAge());
    }

    @Test
    public void Hero_Proficiency() {
        Hero hero = createHero();
        assertEquals("Retractable bone claws & superhuman strength", hero.getProficiency());
    }

    @Test
    public void Hero_Fragility() {
        Hero hero = createHero();
        assertEquals("Poor eye-sight", hero.getFragility());
    }

    @Test
    public void HeroCreatedCorrectly_true() throws Exception {
        Hero hero=createHero();
        assertEquals(true, hero instanceof Hero);
    }

    @Test
    public void HeroIsCorrectlyReturned_true() throws Exception {
        Hero hero = createHero();
        Hero otherHero = new Hero(02, "Hulk", 40, "Superhuman strength", "Rage nullification");
        assertEquals(02, Hero.getAll().size());
    }

    @Test
    public void findHeroInfo() throws Exception {
        Hero hero = createHero();
        Hero anotherHero = new Hero(02, "Hulk", 40, "Superhuman strength", "Rage nullification");
        assertEquals(2, Hero.findById(anotherHero.getId()).getId());
    }

    @Test
    public void updateHeroInfo() throws Exception {
        Hero hero = createHero();
        String previousName=hero.getName();
        int previousAge=hero.getAge();
        String previousProficiency=hero.getProficiency();
        String previousFragility=hero.getFragility();
        int previousId=hero.getId();

        hero.update("Hulk",40,"superhuman strength", "Rage nullification");

        assertEquals(previousId,hero.getId());
        assertNotEquals(previousName,hero.getName());
        assertNotEquals(previousAge, hero.getAge());
        assertNotEquals(previousProficiency,hero.getProficiency());
        assertNotEquals(previousFragility,hero.getFragility());
    }

    @Test
    public void deleteHeroById() throws Exception {
        Hero hero= createHero();
        Hero anotherHero = new Hero(02, "Hulk", 40, "Superhuman strength", "Rage nullification");
        hero.deleteHero();
        assertEquals(01,hero.getAll().size());
        assertEquals(hero.getAll().get(0).getId(),02);
    }

    @Test
    public void deleteAll() throws Exception {
        Hero hero = createHero();
        Hero anotherHero = createHero();
        Hero.clearAll();
        assertEquals(0,Hero.getAll().size());
    }

    public Hero createHero() {
        return new Hero(01, "Wolverine", 38, "Retractable bone claws & superhuman strength", "Poor eye-sight");
    }

}