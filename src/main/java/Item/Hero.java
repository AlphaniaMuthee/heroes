package Item;

import java.util.ArrayList;
import java.util.Objects;

public class Hero {
    private int Id ;
    private String Name ;
    private int Age ;
    private String Proficiency ;
    private String Fragility ;
    private static ArrayList<Hero> mInstances = new ArrayList<>();

    public Hero(String name, int age, String proficiency, String fragility) {
        this.Name = name;
        this.Age = age;
        this.Proficiency = proficiency;
        this.Fragility = fragility;
        this.mInstances.add(this);
        Id = mInstances.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return Objects.equals(Proficiency, hero.Proficiency) &&
                Objects.equals(Fragility, hero.Fragility);

    }
    public static ArrayList<Hero> getmInstances() {
        return mInstances;
    }
    @Override
    public int hashCode() {
        return Objects.hash(Proficiency, Fragility);
    }
    public String getName(){
        return Name;
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

}
