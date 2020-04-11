package kz.epam.bookstore.entity;

public class OrderDetail {
    private Integer orderId;
    private Integer bookId;
    private Integer count;
    private Double price;

    public OrderDetail(Integer orderId, Integer bookId, Integer count, Double price) {
        this.orderId = orderId;
        this.bookId = bookId;
        this.count = count;
        this.price = price;
    }

    public OrderDetail(){}

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
