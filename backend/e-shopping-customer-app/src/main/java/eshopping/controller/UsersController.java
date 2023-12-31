package eshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eshopping.entity.Users;
import eshopping.service.UsersService;

@RestController
@RequestMapping("phase3/customer")
@CrossOrigin
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	@PostMapping(value = "signUp", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signUp(@RequestBody Users users) {
		return usersService.signUp(users);
	}
	
	@PostMapping(value = "signIn", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signIn(@RequestBody Users users) {
		return usersService.signIn(users);
	}
	
	@GetMapping(value = "findAllUsers", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Users> findAllUsers() {
		return usersService.findAllUsers();
	}

}
