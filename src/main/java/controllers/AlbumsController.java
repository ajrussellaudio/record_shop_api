package controllers;

import db.DBAlbum;

import static spark.Spark.*;
import static spark.SparkBase.staticFileLocation;


public class AlbumsController {
    public AlbumsController(){
        this.setupEndpoints();
    }

    private void setupEndpoints() {
        //staticFileLocation("/public");


    }
}

