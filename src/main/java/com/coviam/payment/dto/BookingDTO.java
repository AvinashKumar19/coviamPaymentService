package com.coviam.payment.dto;

import java.io.Serializable;
import java.util.List;

public class BookingDTO implements Serializable{

    private String id;
    private String userId;
    private String superPnr;
    private String bookingType;
    private String bookingSource;
    public static enum Status {PENDING, SUCCESSFUL, DEFERRED, CANCELLED};
    private Status bookingStatus;
    private Double amount;
    private String paymentId;
    private Status paymentStatus;
    private String phoneNumber;
    private String bookingEmail;
    private List<PassengerDTO> passengers;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookingType() {
        return bookingType;
    }

    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }

    public String getBookingSource() {
        return bookingSource;
    }

    public void setBookingSource(String bookingSource) {
        this.bookingSource = bookingSource;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBookingEmail() {
        return bookingEmail;
    }

    public void setBookingEmail(String bookingEmail) {
        this.bookingEmail = bookingEmail;
    }

    public String getSuperPnr() {
        return superPnr;
    }

    public void setSuperPnr(String superPnr) {
        this.superPnr = superPnr;
    }

    public List<PassengerDTO> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PassengerDTO> passengers) {
        this.passengers = passengers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Status getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(Status bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Status getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Status paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookingDTO that = (BookingDTO) o;

        if (!id.equals(that.id)) return false;
        if (!userId.equals(that.userId)) return false;
        if (!superPnr.equals(that.superPnr)) return false;
        if (!bookingType.equals(that.bookingType)) return false;
        if (!bookingSource.equals(that.bookingSource)) return false;
        if (bookingStatus != that.bookingStatus) return false;
        if (!amount.equals(that.amount)) return false;
        if (!paymentId.equals(that.paymentId)) return false;
        if (paymentStatus != that.paymentStatus) return false;
        if (!phoneNumber.equals(that.phoneNumber)) return false;
        if (!bookingEmail.equals(that.bookingEmail)) return false;
        return passengers.equals(that.passengers);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + userId.hashCode();
        result = 31 * result + superPnr.hashCode();
        result = 31 * result + bookingType.hashCode();
        result = 31 * result + bookingSource.hashCode();
        result = 31 * result + bookingStatus.hashCode();
        result = 31 * result + amount.hashCode();
        result = 31 * result + paymentId.hashCode();
        result = 31 * result + paymentStatus.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        result = 31 * result + bookingEmail.hashCode();
        result = 31 * result + passengers.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "BookingDTO{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", superPnr='" + superPnr + '\'' +
                ", bookingType='" + bookingType + '\'' +
                ", bookingSource='" + bookingSource + '\'' +
                ", bookingStatus=" + bookingStatus +
                ", amount=" + amount +
                ", paymentId='" + paymentId + '\'' +
                ", paymentStatus=" + paymentStatus +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", bookingEmail='" + bookingEmail + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
