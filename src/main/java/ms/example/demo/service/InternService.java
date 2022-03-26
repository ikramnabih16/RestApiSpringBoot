package ms.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.mapstruct.Mapper;
import ms.example.demo.domain.Intern;
import ms.example.demo.dto.InternResponse;
import ms.example.demo.mapper.InternMapper;
import ms.example.demo.repository.InternRepository;

@Service
public class InternService
//extends EntityService<Intern, Long> 
{

	public final InternRepository internRepository;

    @Autowired
    public InternService(InternRepository internRepository) {
        this.internRepository = internRepository;
    }
    
	/** The mapper. */
	@Autowired
	private InternMapper mapper;
	
	/**
	 * Instantiates a new Intern service.
	 * @param repository the repository
	 */
//	@Autowired
//	public InternService(InternRepository repository) {
//		super(repository);
//	}
	
	public InternResponse findById(Long id) {
		//System.out.print("\nHHHHHHHHHHHHHHHHHHHHHHHHHELLLO\n" + internRepository.findById(id).get());
		InternResponse dto = mapper.toDTO(internRepository.findById(id).get());
		return dto;
		
	}

}
