package in.ashokit.webClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.request.Passenger;
import in.ashokit.binding.response.Ticket;
@Service
public class AsyncResponseService 
{
	//Representing JSON RESPONSE in TicketObject
public void invokeTicketBookingAppAsync()
{
	WebClient webClient = WebClient.create();
	
	String url ="htts://localhost:1000/bookTicket";
	Passenger passenger = new Passenger("18-OCT-2021","Hydrabad","Ashok Kumar","Vizak");
	 webClient.post()
	 .uri(url)
	 .body(BodyInserters.fromValue(passenger))
	 .accept(MediaType.APPLICATION_JSON)
	 .retrieve()
	 .bodyToMono(Ticket.class)
	 .subscribe(t->System.out.println(t));
	System.out.println("Response rendered in Async");
	
	
}


}