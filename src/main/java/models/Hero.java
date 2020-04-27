package models;

import java.util.ArrayList;
import java.util.Objects;

public class Hero {
    private static ArrayList<Hero> instances = new ArrayList<>();
    private int Id ;
    private String Name ;
    private int Age ;
    private String Proficiency ;
    private String Fragility ;

    public Hero(int id, String name, int age, String proficiency, String fragility) {
        Id = id;
        Name = name;
        Age = age;
        Proficiency = proficiency;
        Fragility = fragility;
        instances.add(this);
        this.Id = instances.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return Age == hero.Age &&
                Id == hero.Id &&
                Objects.equals(Name, hero.Name) &&
                Objects.equals(Proficiency, hero.Proficiency) &&
                Objects.equals(Fragility, hero.Fragility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age, Proficiency, Fragility, Id);
    }


    public static ArrayList<Hero> getAll() {
        return instances;
    }

    public static void setInstances(ArrayList<Hero> instances) {
        Hero.instances = instances;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getProficiency() {
        return Proficiency;
    }

    public void setProficiency(String proficiency) {
        Proficiency = proficiency;
    }

    public String getFragility() {
        return Fragility;
    }

    public void setFragility(String fragility) {
        Fragility = fragility;
    }

    public static void clearAll(){
        instances.clear();
    }

    public static Hero findById(int id){
        return instances.get(id-1);
    }

    public void update(String name, int age, String proficiency, String fragility) {
        this.Name = name;
        this.Age = age;
        this.Proficiency = proficiency;
        this.Fragility =fragility;
    }

    public void deleteHero(){
        instances.remove(Id-1);
    }
}
