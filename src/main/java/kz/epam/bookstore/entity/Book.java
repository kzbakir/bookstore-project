package kz.epam.bookstore.entity;

public class Book {
    private Integer id;
    private String title;
    private String description;
    private Double price;
    private Integer publisherId;
    private Integer imageId;
    private Integer languageId;

    public Book(String title, String description, Double price, Integer publisherId, Integer imageId, Integer languageId) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.publisherId = publisherId;
        this.imageId = imageId;
        this.languageId = languageId;
    }

    public Book() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }
}
