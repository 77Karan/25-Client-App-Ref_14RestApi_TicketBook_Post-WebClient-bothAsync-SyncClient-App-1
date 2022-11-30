package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.webClient.AsyncResponseService;
import in.ashokit.webClient.SyncResponseService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	
		
	ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	SyncResponseService srs = context.getBean(SyncResponseService.class);
	//srs.invokeTicketBookingApp();
	
	AsyncResponseService ars = context.getBean(AsyncResponseService.class);
	ars.invokeTicketBookingAppAsync();

	
	}
	
	
	

}
