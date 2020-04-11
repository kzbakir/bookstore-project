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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
