import db.DBAlbum;
import db.DBArtist;
import models.Album;
import models.Artist;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        DBAlbum.deleteAll();
        DBArtist.deleteAll();
        Artist artist1 = new Artist("AC/DC");

        DBArtist.save(artist1);

        artist1.setName("Iron Maiden");
        DBArtist.update(artist1);

        Album album = new Album("Number of the Beast", artist1.getId(),3);
        DBAlbum.saveAlbum(album);

        Artist artist2 = new Artist("AC/DC");
        DBArtist.save(artist2);

        Album album2 = new Album("High Voltage", artist2.getId(), 5);
        DBAlbum.saveAlbum(album2);


//        Artist artist2 = DBArtist.getArtistById(1);
//        System.out.println(artist2.getId() + " : " + artist2.getName());
//
//        Album album2 = new Album("Back in Black", artist2,5);
//        dbAlbum.saveAlbum(album2);
//
//        //dbArtist.deleteArtist(artist2.getId());
//
//        List<Artist> allArtists = DBArtist.getArtists();
//        for (Artist a : allArtists) {
//            System.out.println(a.getId() + " : " + a.getName());
//        }
//
     }
}
