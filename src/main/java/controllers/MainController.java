package controllers;

import db.DBAlbum;
import models.Album;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;

public class MainController {
    public static void main(String[] args) {
        ArtistsController artistsController = new ArtistsController();
        AlbumsController albumsController = new AlbumsController();

        get("/", (req, res) -> {
            return "Hi";});
    }

}
