package in.ashokit.webClient;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.request.Passenger;
import in.ashokit.binding.response.Ticket;

@Service
public class SyncResponseService 
{
	//Representing JSON RESPONSE in TicketObject
	public void invokeTicketBookingApp()
	{
		WebClient webClient = WebClient.create();
		
		String url ="htts://localhost:1000/bookTicket";
		Passenger passenger = new Passenger("18-OCT-2021","Hydrabad","Ashok Kumar","Vizak");
		Ticket tickDtls = webClient.post()
		 .uri(url)
		 .body(BodyInserters.fromValue(passenger))
		 .accept(MediaType.APPLICATION_JSON)
		 .retrieve()
		 .bodyToMono(Ticket.class)
		 .block();
		
		System.out.println(tickDtls);
		System.out.println("Response rendered");
		
	}

}
