package in.ashokit.binding.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket 
{
	private String pnr;
	private String prize;
	private String status;

}
