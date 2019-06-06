package com.tc.sec.oauth2.resource.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tc.sec.oauth2.resource.model.CustomPrincipal;


@RestController
public class ResourceController {

	
	public ResourceController () {
	}
	
	@GetMapping("/admins")
	@PreAuthorize("hasAuthority('role_admin')")
	public String context() {
		CustomPrincipal principal = (CustomPrincipal) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		return principal.getUsername() + " " + principal.getEmail();
	}

	@GetMapping("/users")
	@PreAuthorize("hasAnyAuthority('role_admin','role_user')")
	public String secured(CustomPrincipal principal) {
		return principal.getUsername() + " " + principal.getEmail();
	}

	@GetMapping("/common")
	public String general() {
		return "common api success";
	}
	
	
	@GetMapping("/getevents")
	@PreAuthorize("hasAuthority('role_apiuser')")
	public String getEvents(CustomPrincipal principal) {
		return "[{\"eventname\":\"Football Premier League Chelsea FC\",\"dateofevent\":\"2020-10-02 02:00:00\",\"description\":\"Football Premier League\",\"eventtype\":\"Premier League\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football Premier League Everton \",\"dateofevent\":\"2020-10-03 02:00:00\",\"description\":\"Football Premier League\",\"eventtype\":\"Premier League\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football Premier League Liverpool FC\",\"dateofevent\":\"2020-10-04 02:00:00\",\"description\":\"Football Premier League\",\"eventtype\":\"Premier League\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football Premier League Manchester City\",\"dateofevent\":\"2020-10-05 02:00:00\",\"description\":\"Football Premier League\",\"eventtype\":\"Premier League\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football Premier League Manchester United\",\"dateofevent\":\"2020-10-06 02:00:00\",\"description\":\"Football Premier League\",\"eventtype\":\"Premier League\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football Premier League Newcastle United\",\"dateofevent\":\"2020-10-07 02:00:00\",\"description\":\"Football Premier League\",\"eventtype\":\"Premier League\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football Premier League Southampton FC\",\"dateofevent\":\"2020-10-08 02:00:00\",\"description\":\"Football Premier League\",\"eventtype\":\"Premier League\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football Premier League Tottenham Hotspur\",\"dateofevent\":\"2020-10-09 02:00:00\",\"description\":\"Football Premier League\",\"eventtype\":\"Premier League\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football Premier League Wolverhampton Wanderers\",\"dateofevent\":\"2020-10-10 02:00:00\",\"description\":\"Football Premier League\",\"eventtype\":\"Premier League\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football Serie A Inter Milan\",\"dateofevent\":\"2020-10-01 11:00:00\",\"description\":\"Football Serie A\",\"eventtype\":\"Serie A\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football La Liga Atletico Madrid\",\"dateofevent\":\"2020-10-12 02:00:00\",\"description\":\"Football La Liga\",\"eventtype\":\"La Liga\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football La Liga Barcelona FC\",\"dateofevent\":\"2020-10-01 14:00:00\",\"description\":\"Football La Liga\",\"eventtype\":\"La Liga\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football La Liga Espanyol\",\"dateofevent\":\"2020-10-15 02:00:00\",\"description\":\"Football La Liga\",\"eventtype\":\"La Liga\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football La Liga Girona FC\",\"dateofevent\":\"2020-10-16 02:00:00\",\"description\":\"Football La Liga \",\"eventtype\":\"La Liga\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football La Liga Real Madrid\",\"dateofevent\":\"2020-10-17 02:00:00\",\"description\":\"Football La Liga \",\"eventtype\":\"La Liga\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football La Liga Sevilla\",\"dateofevent\":\"2020-10-18 02:00:00\",\"description\":\"Football La Liga\",\"eventtype\":\"La Liga\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football La Liga Valencia\",\"dateofevent\":\"2020-10-19 02:00:00\",\"description\":\"Football La Liga\",\"eventtype\":\"La Liga\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football Primeira Liga SL Benfica\",\"dateofevent\":\"2020-10-20 02:00:00\",\"description\":\"Football La \",\"eventtype\":\"Liga La Liga \",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"},{\"eventname\":\"Football Primeira LigaSporting CP\",\"dateofevent\":\"2020-10-21 02:00:00\",\"description\":\"Football Primeira Liga\",\"eventtype\":\"La Liga\",\"venue\":\"Test Vanue\",\"importantinfo\":\"importantInfo\",\"roomtypes\":\"test\",\"eventimage\":\"someURL\"}]";
	}
	
	
}
