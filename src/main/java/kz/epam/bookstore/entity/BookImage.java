package kz.epam.bookstore.entity;

public class BookImage {
    private Integer id;
    private byte[] image;
    private String description;

    public BookImage(int id, byte[] image, String description) {
        this.id = id;
        this.image = image;
        this.description = description;
    }

    public BookImage(byte[] image, String description) {
        this.image = image;
        this.description = description;
    }

    public  BookImage(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getImage(byte image) {
        return this.image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescription(String desription) {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
