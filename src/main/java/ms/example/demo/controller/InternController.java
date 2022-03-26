package ms.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms.example.demo.domain.Intern;
import ms.example.demo.dto.InternResponse;
import ms.example.demo.service.InternService;

@RestController
@RequestMapping(path ="ms/v1/intern")
public class InternController {

	/** The intern Service */
	private final InternService internService ;
	    @Autowired
	    public InternController(InternService internservice) {
	        this.internService = internservice;
	    }
	    
	    @PostMapping
	    public String getStudents() {
	        return "hello";
	    }    
	    
	/**
	 * Gets the intern by id.
	 * @param id the id
	 * @return the intern which id=id 
	 */ 
	@GetMapping("/{id}")
	public InternResponse getById(@PathVariable("id") Long id) {
		//System.out.print(id);
		System.out.print(internService.findById(id));
		return internService.findById(id);
	}
}
