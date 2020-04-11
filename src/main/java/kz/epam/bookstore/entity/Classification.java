package kz.epam.bookstore.entity;

public class Classification {
    private Integer id;

    public Classification(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Classification(){}

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

    private String name;
}
