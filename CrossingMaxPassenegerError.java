package ticketReservation;

public class CrossingMaxPassenegerError extends Exception {
	public String getMessage()
	{
		return "You are crossing the Limit of Maximum Passengers";
	}
}
