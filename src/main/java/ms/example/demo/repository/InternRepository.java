package ms.example.demo.repository;

import org.springframework.stereotype.Repository; 
import ms.example.demo.domain.Intern;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;



@Repository
public interface InternRepository 
	//extends PagingAndSortingRepository<Intern, Long>, JpaSpecificationExecutor<Intern>{
   extends JpaRepository<Intern, Long>{
	
}
