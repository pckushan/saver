package io.javabrains.springsecurityjpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kushan
 * @date 19.09.2019
 * @time 20:00
 */
@RestController
public class HomeResource {
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}

	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome User</h1>");
	}

	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Welcome Admin</h1>");
	}
	
}
