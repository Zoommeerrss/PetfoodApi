/**
 * 
 */
package com.petfood.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Emerzoom
 *
 */
@RestController
@RequestMapping("/not-basic")
public class EndApiController {

	@GetMapping(value = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public ResponseEntity<String> api() {
		// TODO Auto-generated method stub
		return new ResponseEntity<String>("BasicController is off!", HttpStatus.OK);
	}
}
