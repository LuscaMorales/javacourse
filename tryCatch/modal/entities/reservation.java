package modal.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class reservation {
	
	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;
	
	private DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	public reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	public reservation() {
	}
	
	public Integer getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public LocalDate getCheckin() {
		return checkin;
	}
	
	public LocalDate getCheckout() {
		return checkout;
	}
	
	public int duration() {
		int diff =  checkout.getDayOfYear() - checkin.getDayOfYear();
		return diff;
	}
	
	public void updateDates(LocalDate checkin, LocalDate checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ fmt1.format(checkin)
				+ ", check-out: "
				+ fmt1.format(checkout)
				+ ", "
				+ duration()
				+ "nights";
	}

}
