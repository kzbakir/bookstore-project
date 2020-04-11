package kz.epam.bookstore.entity;

public class Stock {
    private Integer bookId;
    private Integer quantity;

    public Stock(int bookId, int quantity) {
        this.bookId = bookId;
        this.quantity = quantity;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
