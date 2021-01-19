/**
 * 
 */
package com.petfood.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

/**
 * @author Emerzoom
 *
 */
@RestController
@RequestMapping("/basic")
public class InitialApiController {

	@ApiOperation(value = "Welcome Api", notes = "Welcome Api", response = String.class, responseContainer = "List" )
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "200", description = "Welcome Api success"),
			@ApiResponse(responseCode = "401", description = "You are not authorized to view the resource"),
		    @ApiResponse(responseCode = "403", description = "Accessing the resource you were trying to reach is forbidden"),
		    @ApiResponse(responseCode = "404", description = "The resource you were trying to reach is not found") })
	@GetMapping(value = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public ResponseEntity<String> api() {
		// TODO Auto-generated method stub
		
		return new ResponseEntity<String>("BasicController is on!", HttpStatus.OK);
	}
	
	@ApiOperation(value = "Add a text message", notes = "Add a text message", response = String.class )
	@ApiResponses({
        @ApiResponse(responseCode = "201", description = "Add a text message success")
    })
	@PostMapping(value = "/sayHi", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> sayHi(@Validated @RequestBody String message) {
		// TODO Auto-generated method stub
		
		String msg = "BasicController is on, " + message;
		System.out.println(msg);
		
		return ResponseEntity.ok(msg);
	}
}
