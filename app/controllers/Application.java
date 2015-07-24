package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

import views.html.*;

public class Application extends Controller {

    public  Result index() {
        return ok(index.render("Your new application is ready."));
    }



}
