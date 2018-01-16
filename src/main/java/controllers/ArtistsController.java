package controllers;

import db.DBArtist;
import models.Artist;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
import static spark.SparkBase.staticFileLocation;


public class ArtistsController {

    public ArtistsController(){
        this.setupEndpoints();
    }

    private void setupEndpoints() {
        staticFileLocation("/public");



    }
}
