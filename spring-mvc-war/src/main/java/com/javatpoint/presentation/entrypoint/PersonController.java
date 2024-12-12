package com.javatpoint.presentation.entrypoint;

import com.javatpoint.domain.converter.PersonConverter;
import com.javatpoint.domain.service.PersonService;
import com.javatpoint.presentation.api.request.PersonRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/springmvc/people")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping(value = "/counter", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getPersonTotal() {

        try {
            System.out.println("Person Counter: " + service.count());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return new ResponseEntity<>("Counted data", HttpStatus.OK);
    }

	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getPersonList() {

		try {
			System.out.println("Person list: " + service.findAll()
					.stream()
					.map(PersonConverter::toResponse)
					.collect(Collectors.toList()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ResponseEntity<>("Listed data", HttpStatus.OK);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> save(@RequestBody PersonRequest request) {

		try {
			System.out.println("Person saved: " + service.save(request));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ResponseEntity<>("Saved data", HttpStatus.CREATED);
	}
}
