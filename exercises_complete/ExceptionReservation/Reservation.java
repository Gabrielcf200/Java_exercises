package exercises_complete.ExceptionReservation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkin, Date checkout) throws DomainException {
		if(!checkout.after(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	

	public long duration() {
		
		long diff = checkin.getTime() - checkout.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updataDates(Date checkin, Date checkout) throws DomainException {	
		Date now = new Date();
		if(checkin.before(now) || checkout.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if(!checkout.after(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkin = checkin;
		this.checkout = checkout;

	}
	
	
	
	
	
	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	@Override
	public String toString() {
		return "Reservation [roomNumber=" + getRoomNumber() + ", checkin=" + sdf.format(getCheckin()) + ", checkout=" + sdf.format(getCheckout()) + ", duration" + duration();
	}

	
}

