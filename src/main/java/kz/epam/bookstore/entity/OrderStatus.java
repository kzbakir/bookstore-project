package kz.epam.bookstore.entity;

public class OrderStatus {
    private Integer id;
    private Integer status;
    private String name;

    public OrderStatus(Integer id, Integer status, String name) {
        this.id = id;
        this.status = status;
        this.name = name;
    }

    public OrderStatus(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
