package Item;

import java.util.ArrayList;

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

}
