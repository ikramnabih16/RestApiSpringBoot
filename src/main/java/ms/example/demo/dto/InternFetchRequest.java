package ms.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InternFetchRequest {

	/** The internship start date. */
	private Long startDate;

	/** The internship end date. */
	private Long endDate;

	/** University. */
	private String University;

	/** Subject. */
	private String fullName;

	/** The phone number. */
	private String phoneNumber;
}
