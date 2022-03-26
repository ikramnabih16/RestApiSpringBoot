package ms.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class InternResponse {

	/** The intern fullName*/
	private String fullName ;
	
	/** The intern University */
	private String University;
	
	/** The response code. */
	private String responseCode;

	/** the response description. */
	private String responseDescription;

}
