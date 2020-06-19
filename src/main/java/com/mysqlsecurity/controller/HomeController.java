/**
 *
 */
package com.mysqlsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author manoranjan
 *
 */
@RestController
public class HomeController {

	@GetMapping(value = "/")
	public String home() {
		return "<h1>Home Page<h1>";
	}

	@GetMapping(value = "/user")
	public String user() {
		return "<h1>Welcome User</h1>";
	}

	@GetMapping(value = "/admin")
	public String admin() {
		return "<h1>Welcome Admin</h1>";
	}

}
