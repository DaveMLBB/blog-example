package co.develhope.team3.blog.controllers;

import it.pasqualecavallo.studentsmaterial.authorization_framework.security.HierarchicalSecurity;
import it.pasqualecavallo.studentsmaterial.authorization_framework.security.PublicEndpoint;
import it.pasqualecavallo.studentsmaterial.authorization_framework.security.RoleSecurity;
import it.pasqualecavallo.studentsmaterial.authorization_framework.security.ZeroSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/default-deny")
	public String defaultDeny() {
		return "defaultDeny";
	}

	@PublicEndpoint
	@GetMapping("/public-endpoint")
	public String publicEndpoint() {
		return "publicEndpoint";
	}

	@ZeroSecurity
	@GetMapping("/zero-security")
	public String allAuthenticated() {
		return "allAuthenticated";
	}

	@RoleSecurity(value = { "ROLE_USER", "ROLE_ADMIN" })
	@GetMapping("/role-security")
	public String roleSecurity() {
		return "roleSecurity";
	}

	@HierarchicalSecurity(bottomRole = "ROLE_ADMIN")
	@GetMapping("/hierachical-security")
	public String hierachicalSecurity() {
		return "hierachicalSecurity";
	}

	@GetMapping("/litterally-unfiltered")
	public String litterallyUnfiltered() {
		return "litterallyUnfiltered";
	}

	@GetMapping("/litterally-unfiltered/subpath")
	public String litterallyUnfilteredSubpath() {
		return "litterallyUnfilteredSubpath";
	}
}
