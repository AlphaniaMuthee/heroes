package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private static ArrayList<Squad> instances = new ArrayList<>();
    private int Id;
    private String Title;
    private String Ideal;
    private int Maximum ;

    public Squad(int id, String title, String ideal, int maximum) {
        Id = id;
        Title = title;
        Ideal = ideal;
        Maximum = maximum;
        instances.add(this);
        this.Id = instances.size();
    }

    public static ArrayList<Squad> getAll() {
        return instances;
    }

    public static void setAll(ArrayList<Squad> instances) {
        Squad.instances = instances;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public static Squad findById(int id){
        return instances.get(id-1);
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getIdeal() {
        return Ideal;
    }

    public void setIdeal(String ideal) {
        Ideal = ideal;
    }

    public int getMaximum() {
        return Maximum;
    }

    public void setMaximum(int maximum) {
        Maximum = maximum;
    }

    public void update(String title, String ideal) {
        this.Title = title;
        this.Ideal = ideal;
    }

    public static void clearWholeSquad() {
        instances.clear();
    }
    public  void deleteSquad(){
        instances.remove(Id-1);
    }
}


