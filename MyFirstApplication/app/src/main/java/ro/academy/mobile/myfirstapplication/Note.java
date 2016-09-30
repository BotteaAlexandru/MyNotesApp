package ro.academy.mobile.myfirstapplication;

/**
 * Created by Alex on 9/25/2016.
 */

public class Note {

    private String title = "";
    private String description = "";
    private String where = "";
    private String date = "";

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Note(String aTitle, String aDescription, String aWhere, String aDate) {
        this.title = aTitle;
        this.description = aDescription;
        this.where = aWhere;
        this.date =aDate;
    }

    public String getTitle() {
        return title;
    }

    public Note setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Note setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getWhere() {
        return where;
    }

    public Note setWhere(String where) {
        this.where = where;
        return this;
    }

    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", where='" + where + '\'' +
                '}';
    }
}
