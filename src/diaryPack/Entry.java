package diaryPack;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String tittle;
    private String body;
    private LocalDateTime dateCreated;


    public Entry(int id, String tittle, String body) {
        this.id = id;
        this.tittle = tittle;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void updateBody(String body) {
        this.body = body;

    }

    public void updateTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }

    public String getBody() {
        return body;
    }
}