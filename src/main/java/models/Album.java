package models;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Album {
    private int id;
    private String title;
    private int artist_id;
    private int quantity;

    public Album() {

    }

    public int getArtistId() {
        return artist_id;
    }

    public void setArtistId(int artist_id) {
        this.artist_id = artist_id;
    }

    public Album(String title, int artist_id, int quantity) {
        this.title = title;
        this.artist_id = artist_id;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String stockLevel() {
        if (quantity >= 10) {
            return "High";
        } else if (quantity >= 5) {
            return "Medium";
        } else {
            return "Low";
        }
    }
}
