package kz.epam.bookstore.entity;

public class Genre {
    private Integer id;
    private String name;
    private Integer classificationId;

    public Genre(Integer id, String name, Integer classificationId) {
        this.id = id;
        this.name = name;
        this.classificationId = classificationId;
    }

    public Genre(String name) {
        this.name = name;
    }

    public Genre() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
