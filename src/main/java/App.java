//import java.util.Objects;
//
//import Item.Hero;
//import Item.Squad;
//import spark.ModelAndView;
//import spark.template.handlebars.HandlebarsTemplateEngine;
//import static spark.Spark.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class App {
//    public static void main(String[] args) {
//        staticFileLocation("/public");
//        get("/",(request, response) -> {
//            Map<String,Object> model = new HashMap<>();
//            List<Squad> squads = Squad.getInstances();
//            model.put("Squads",squads);
//            return new ModelAndView(model,"Index.hbs");
//        },new HandlebarsTemplateEngine());
//        // Squads
//        get("/Squads/new",(request, response) -> {
//            Map<String,Object> model = new HashMap<>();
//            List<Squad> squads = request.session().attribute("Squad");
//            model.put("Squads",squads);
//            return new ModelAndView(model,"Squads.hbs");
//        },new HandlebarsTemplateEngine());
//        get("/Squads/create",(request, response) -> {
//            Map<String,Object>model = new HashMap<>();
//            return new ModelAndView(model,"Squadform.hbs");
//        },new HandlebarsTemplateEngine());
//        post("/Squads/new",(request, response) ->{
//            Map<String,Object> model = new HashMap<>();
//            String Title = request.queryParams("Title");
//            String cause = request.queryParams("ideal");
//            int max = Integer.parseInt(request.queryParams("maximum"));
//            Squad squad = new Squad(Title,cause,max);
//            request.session().attribute("Squad",Squad.getmInstances());
//            return new ModelAndView(model,"Success.hbs");
//        },new HandlebarsTemplateEngine());
//        get("/Squad/Heroes/form",(request, response) -> {
//            Map<String,Object> model = new HashMap<>();
//            List<Squad> Squads = request.session().attribute("Squad");
//            model.put("Squads",Squads);
//            return new ModelAndView(model,"Hero_Form.hbs");
//        }, new HandlebarsTemplateEngine());
//        post("Squad/Heroes/new",(request, response) ->{
//            Map<String,Object>model = new HashMap<>();
//            List<Squad> Squads = new ArrayList<>();
//            String Name = request.queryParams("Name");
//            int Age = Integer.parseInt(request.queryParams("Age"));
//            String Superpower = request.queryParams("Proficiency");
//            String Weakness = request.queryParams("Fragility");
//            String Inputsquad = request.queryParams("squad");
//            Squad newSquad = null;
//            for ( Squad squad : Squads){
//                if( squad.getTitle().equals(Inputsquad)){
//                    newSquad = squad ;
//                    break;
//                }
//            }
//            assert newSquad != null;
//            Hero hero = new Hero(Name,Age,Proficiency,Fragility);
//            request.session().attribute("Hero",Hero.getInstances());
//            return new ModelAndView(model,"Success.hbs");
//        },new HandlebarsTemplateEngine());
//        // heroes
//        get("/Heroes/form", (request, response) ->{
//            Map<String,Object> model = new HashMap<>();
//            return new ModelAndView(model,"Hero_Form.hbs");
//        },new HandlebarsTemplateEngine());
//        get("/Squad/Heroes/new",(request, response) ->{
//            Map<String,Object>model = new HashMap<>();
//            List<Hero> Heroes = request.session().attribute("Hero");
//            model.put("Heroes",Heroes);
//            return new ModelAndView(model,"Hero.hbs");
//        },new HandlebarsTemplateEngine());
//    }
//
//
//}
