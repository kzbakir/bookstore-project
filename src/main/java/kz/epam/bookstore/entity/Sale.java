package kz.epam.bookstore.entity;

import java.util.Date;

public class Sale {
    private int id;
    private double price;
    private Date dateOfSale;
    private int userId;
    private int bookId;

    public Sale(int id, double price, Date dateOfSale, int userId, int bookId) {
        this.id = id;
        this.price = price;
        this.dateOfSale = dateOfSale;
        this.userId = userId;
        this.bookId = bookId;
    }

    public Sale(double price, Date dateOfSale, int userId, int bookId) {
        this.price = price;
        this.dateOfSale = dateOfSale;
        this.userId = userId;
        this.bookId = bookId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
