package com.app.Transanction_Mangement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Transanction_Mangement.dto.FlightBookingAcknowledgement;
import com.app.Transanction_Mangement.dto.FlightBookingRequest;
import com.app.Transanction_Mangement.service.FlightBookingService;

@RestController
@EnableTransactionManagement
public class FlightBookingController {
	
	@Autowired
	private FlightBookingService flightBookingService;
	
	@PostMapping("/bookTickets")
	public FlightBookingAcknowledgement FlightTicketBooking(@RequestBody FlightBookingRequest bookingRequest) {
		return flightBookingService.bookFlightTickets(bookingRequest);
		
	}

}
