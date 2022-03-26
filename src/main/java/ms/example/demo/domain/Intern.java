package ms.example.demo.domain;

import javax.persistence.*;

import lombok.*;


@Entity
@Table(name = "T_INTERN")
@Setter
@Getter
/**
 * Instantiates a new wallet history.
 */
@NoArgsConstructor
public class Intern {

	/** The Constant INTERN_SEQ. */
	public static final String INTERN_SEQ = "INTERN_SEQ";

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = INTERN_SEQ)
	@SequenceGenerator(name = INTERN_SEQ, sequenceName = INTERN_SEQ, allocationSize = 1)
	private Long id;
	
	/** The intern fullName*/
	@Column(name = "IN_FN")
	private String fullName ;
	
	/** The intern University */
	@Column(name = "IN_UNI")
	private String University;
	
	/** The response code. */
	@Column(name = "RESP_CODE")
	private String responseCode;

	/** the response description. */
	@Column(name = "RESP_DESC")
	private String responseDescription;
	
	  @Override
	    public String toString() {
	        return "Intern{" +
	                "id=" + id +
	                ", name='" + fullName + '\'' +
	                ", University='" + University + '\'' +
	                ", responseCode=" + responseCode +
	                ", responseDescription=" + responseDescription +
	                '}';
	    }
	
}







