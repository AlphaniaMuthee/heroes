package Item;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private int id;
    private String Title;
    private String Ideal;
    private int Maximum ;
    private static ArrayList<Squad> mInstances = new ArrayList<>();
    private List<Hero> heroes ;

    public Squad (String title, String ideal, int maximum) {
        this.Title = title;
        this.Ideal = ideal;
        this.Maximum = maximum;
        this.mInstances.add(this);
        id = mInstances.size();
        heroes = new ArrayList<Hero>();
    }
}
