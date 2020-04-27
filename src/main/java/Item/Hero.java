package Item;

import java.util.ArrayList;
import java.util.Objects;

public class Hero {
    private static ArrayList<Hero> instances = new ArrayList<>();
    private int Id ;
    private String Name ;
    private int Age ;
    private String Proficiency ;
    private String Fragility ;


    public Hero(String name, int age, String proficiency, String fragility, int id) {
        this.Name = name;
        this.Age = age;
        this.Proficiency = proficiency;
        this.Fragility = fragility;
        instances.add(this);
        this.Id = instances.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return  Age == hero.Age &&
                Id == hero.Id &&
                Objects.equals(Name, hero.Name)&&
                Objects.equals(Proficiency, hero.Proficiency) &&
                Objects.equals(Fragility, hero.Fragility);

    }
    public static ArrayList<Hero> getInstances() {
        return instances;
    }
    @Override
    public int hashCode() {
        return Objects.hash(Name, Age, Proficiency, Fragility, Id);
    }
    public String getName(){
        return Name;
    }

    public static void setInstances(ArrayList<Hero> instances) {
        Hero.instances = instances;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setProficiency(String proficiency) {
        Proficiency = proficiency;
    }

    public void setFragility(String fragility) {
        Fragility = fragility;
    }

    public String getProficiency(){
        return Proficiency;
    }
    public String getFragility(){
        return Fragility;
    }
    public int getAge(){
        return Age;
    }
    public static void clearAll(){
        instances.clear();
    }

}
