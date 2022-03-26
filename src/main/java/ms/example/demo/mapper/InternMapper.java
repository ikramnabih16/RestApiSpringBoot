package ms.example.demo.mapper;

import java.util.Optional;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;

import ms.example.demo.domain.Intern;
import ms.example.demo.dto.InternResponse;

/**
 * The Interface TransactionHistoryMapper.
 */
@Mapper(componentModel = "spring")
public interface InternMapper {
	
	 InternResponse toDTO(Intern intern);

}
