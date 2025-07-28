package ru.store.online.model;
import ru.store.online.model.enumeration.Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {
    private LocalDateTime orderDate;
    private User user;
    private Address address;
    private BigDecimal totalPrice;
    private Status status;
    private CartItem[] cartItemsArray;

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public CartItem[] getCartItemsArray() {
        return cartItemsArray;
    }
    public void setCartItemsArray(CartItem[] cartItemsArray) {
        this.cartItemsArray = cartItemsArray;
    }
}
