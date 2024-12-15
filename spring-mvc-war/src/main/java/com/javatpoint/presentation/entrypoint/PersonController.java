package com.javatpoint.presentation.entrypoint;

import com.javatpoint.domain.converter.PersonConverter;
import com.javatpoint.domain.service.PersonService;
import com.javatpoint.presentation.api.request.PersonRequest;
import com.javatpoint.presentation.api.response.Data;
import com.javatpoint.presentation.api.response.PersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/passengers")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping(value = "/counter", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Data<Long>> getPersonTotal() {

		long count = 0L;

        try {
			count = service.count();
            System.out.println("Person Counter: " + count);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return new ResponseEntity<>(new Data<>(count), HttpStatus.OK);
    }

	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Data<List<PersonResponse>>> getPersonList() {

		List<PersonResponse> list = null;
		try {

			list = service.findAll()
					.stream()
					.map(PersonConverter::toResponse)
					.collect(Collectors.toList());
			System.out.println("Person list: " + list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ResponseEntity<>(new Data<>(list), HttpStatus.OK);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Data<PersonResponse>> save(@RequestBody PersonRequest request) {

		PersonResponse response = null;
		try {
			response = PersonConverter.toResponse(service.save(request));
			System.out.println("Person saved: " + response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ResponseEntity<>(new Data<>(response), HttpStatus.CREATED);
	}
}
