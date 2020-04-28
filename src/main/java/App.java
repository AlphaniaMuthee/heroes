import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        ProcessBuilder process = new ProcessBuilder();
        int port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }
        port(port);
        
        staticFileLocation("/public");

        get("/",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            ArrayList<Squad> squads = Squad.getAll();
            model.put("Squads",squads);
            return new ModelAndView(model,"Index.hbs");
        },new HandlebarsTemplateEngine());
        // Squads
        get("/Squads/",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            ArrayList<Squad> squads = request.session().attribute("Squad");
            model.put("Squads",squads);
            return new ModelAndView(model,"Squads.hbs");
        },new HandlebarsTemplateEngine());
        get("/Squads/create",(request, response) -> {
            Map<String,Object>model = new HashMap<>();
            return new ModelAndView(model,"Squadform.hbs");
        },new HandlebarsTemplateEngine());
        post("/Squads/",(request, response) ->{
            Map<String,Object> model = new HashMap<>();
            int Id = Integer.parseInt(request.queryParams("Id"));
            String Title = request.queryParams("Title");
            String  Ideal = request.queryParams("Ideal");
            int Maximum = Integer.parseInt(request.queryParams("Maximum"));
            Squad squad = new Squad(Id,Title,Ideal,Maximum);
            request.session().attribute("Squad",Squad.getAll());
            return new ModelAndView(model,"Success.hbs");
        },new HandlebarsTemplateEngine());
        get("/Squad/Heroes/",(request, response) -> {
            Map<String,Object> model = new HashMap<>();
            ArrayList<Squad> Squads = request.session().attribute("Squad");
            model.put("Squads",Squads);
            return new ModelAndView(model,"Hero_Form.hbs");
        }, new HandlebarsTemplateEngine());
        post("Squad/Heroes/",(request, response) ->{
            Map<String,Object>model = new HashMap<>();
            ArrayList<Squad> Squads = new ArrayList<>();
            int Id = Integer.parseInt(request.queryParams("Id"));
            String Name = request.queryParams("Name");
            int Age = Integer.parseInt(request.queryParams("Age"));
            String Proficiency = request.queryParams("Proficiency");
            String Fragility = request.queryParams("Fragility");
            String Inputsquad = request.queryParams("squad");
            Squad newSquad = null;
            for ( Squad squad : Squads){
                if( squad.getTitle().equals(Inputsquad)){
                    newSquad = squad ;
                    break;
                }
            }
            assert newSquad != null;
            Hero hero = new Hero(Id,Name,Age,Proficiency,Fragility);
            request.session().attribute("Hero",Hero.getAll());
            return new ModelAndView(model,"Success.hbs");
        },new HandlebarsTemplateEngine());
        // heroes
        get("/Heroes/create", (request, response) ->{
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"Hero_Form.hbs");
        },new HandlebarsTemplateEngine());
        get("/Squad/Heroes/",(request, response) ->{
            Map<String,Object>model = new HashMap<>();
            ArrayList<Hero> Heroes = request.session().attribute("Hero");
            model.put("Heroes",Heroes);
            return new ModelAndView(model,"Hero.hbs");
        },new HandlebarsTemplateEngine());
   }


}
