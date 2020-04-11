package kz.epam.bookstore.entity;

import java.util.Date;

public class OrderInfo {
    private Integer id;
    private Date dateOfSale;
    private Integer userId;
    private Integer statusId;
    private Double totalPrice;

    public OrderInfo(Integer id, Double totalPrice, Date dateOfSale, Integer userId, Integer statusId) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.dateOfSale = dateOfSale;
        this.userId = userId;
        this.statusId = statusId;
    }

    public OrderInfo(Double totalPrice, Date dateOfSale, Integer userId, Integer statusId) {
        this.totalPrice = totalPrice;
        this.dateOfSale = dateOfSale;
        this.userId = userId;
        this.statusId = statusId;
    }

    public OrderInfo(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer bookId) {
        this.statusId = statusId;
    }
}
