package net.edu.isistan.taller;

public class Jaula {
    private String title;
    private Integer position;
    private String section;

    public Jaula(String title, Integer position, String section) {
        this.title = title;
        this.position = position;
        this.section = section;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
