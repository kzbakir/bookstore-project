package kz.epam.bookstore.entity;

public class Book {
    private int id;
    private String title;
    private String description;
    private float price;
    private int authorId;
    private int publisherId;
    private int genreId;
    private int imageId;
    private int languageId;

    public Book(String title, String description, float price, int authorId, int publisherId, int genreId, int imageId, int languageId) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.authorId = authorId;
        this.publisherId = publisherId;
        this.genreId = genreId;
        this.imageId = imageId;
        this.languageId = languageId;
    }
    public Book(){}

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
}
