package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import service.CoffeeService;
import views.html.index;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Application extends Controller {

    private CoffeeService coffeeService;

    @Inject
    public Application(CoffeeService service) {
        coffeeService = service;
    }

    public Result index() {
        return ok(index.render("Your application " + this.toString() +" is ready. " + coffeeService.toString()));
    }

}
