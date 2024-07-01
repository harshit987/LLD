import java.time.LocalDate;


public class Reservation {
    Long reservationId;
    Vehicle vehicle;
    User user;
    LocalDate bookingDate;
    LocalDate bookingFrom;
    LocalDate bookingTill;
    ReservationStatus reservationStatus;

    public Long getReservationId() {
        return reservationId;
    }

    public Reservation(Vehicle vehicle, User user, LocalDate bookingDate, LocalDate bookingFrom, LocalDate bookingTill) {
        this.vehicle = vehicle;
        this.user = user;
        this.bookingDate = bookingDate;
        this.bookingFrom = bookingFrom;
        this.bookingTill = bookingTill;
        reservationStatus = ReservationStatus.SCHEDULED;
    }

    public void completeReservation() {
        this.reservationStatus = ReservationStatus.COMPLETED;
    }

    public void updateStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public LocalDate getBookingFrom() {
        return bookingFrom;
    }

    public LocalDate getBookingTill() {
        return bookingTill;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }
}

