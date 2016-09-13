import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      int intHeight = Integer.parseInt(request.queryParams("length"));
      int intWidth = Integer.parseInt(request.queryParams("width"));
      Rectangle rectangle = new Rectangle(intHeight, intWidth);
      ArrayList<Rectangle> myRectangleArrayList = Rectangle.all();
      model.put("myRectangles", myRectangleArrayList);
      model.put("template", "templates/result.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
