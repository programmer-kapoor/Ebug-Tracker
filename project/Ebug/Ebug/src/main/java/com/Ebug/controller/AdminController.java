package com.Ebug.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Ebug.dto.TicketDtoForEmploye;
import com.Ebug.entity.CriticalLevel_Table;
import com.Ebug.entity.Customer_Table;
import com.Ebug.entity.Employee_Table;
import com.Ebug.entity.Project_Table;
import com.Ebug.entity.Status_Table;
import com.Ebug.entity.Ticket_Table;
import com.Ebug.exception.UserAlreadyRegisterd;
import com.Ebug.service.IAdminService;

@Controller
@RequestMapping("/api")
public class AdminController {
	
	@Autowired
	private IAdminService adminService;
	
	@PostMapping(path = "/registerEmployee")
	ResponseEntity<Employee_Table> registerEmployee(@RequestBody Employee_Table employee) {
		Employee_Table response = adminService.registerEmployee(employee);
		if(response == null) {

			throw new UserAlreadyRegisterd("400", "User Alredy Register");			
		}
		 return new ResponseEntity<Employee_Table>(response, HttpStatus.OK);
	}
	
	@GetMapping("/tickets")
	ResponseEntity<List<Ticket_Table>> getAllTickets() {
	    return new ResponseEntity<List<Ticket_Table>>(adminService.getAllTickets(), HttpStatus.OK);
	}
	
	@GetMapping("/ticketsnotassign")
	ResponseEntity<List<Ticket_Table>> getAllNotAssigendTickets() {
	    return new ResponseEntity<List<Ticket_Table>>(adminService.getAllNotAssigendTickets(), HttpStatus.OK);
	}
	
	@GetMapping("/tickets/{ticketId}")
	ResponseEntity<Ticket_Table> getTicketById(@PathVariable("ticketId") Long id) {
	    return new ResponseEntity<Ticket_Table>(adminService.getTicketById(id), HttpStatus.OK);
	}
	
	@GetMapping("/ticketbystatusid/{id}")
	ResponseEntity<List<Ticket_Table>> getTicketsByStatusId(@PathVariable("id") Long id) {
	    return new ResponseEntity<List<Ticket_Table>>(adminService.getTicketByStatusId(id), HttpStatus.OK);
	}
	
	@GetMapping("/ticketbycriticalid/{id}")
	ResponseEntity<List<Ticket_Table>> getTicketsByCriticalId(@PathVariable("id") Long id) {
	    return new ResponseEntity<List<Ticket_Table>>(adminService.getTicketByCriticalLevelId(id), HttpStatus.OK);
	}
	
	@GetMapping("/ticketbyprojectid/{id}")
	ResponseEntity<List<Ticket_Table>> getTicketsByProjectId(@PathVariable("id") Long id) {
	    return new ResponseEntity<List<Ticket_Table>>(adminService.getTicketByProjectId(id), HttpStatus.OK);
	}
	
	@GetMapping("/getstatus")
	ResponseEntity<List<Status_Table>> getAllStatus() {
	    return new ResponseEntity<List<Status_Table>>(adminService.getAllStatus(), HttpStatus.OK);
	}
	
	
	@PostMapping("/updateticket")
	ResponseEntity<Ticket_Table> updateTicketsByAdmin(@RequestBody Ticket_Table ticket) {

	    return new ResponseEntity<Ticket_Table>(adminService.updateTicketByAdmin(ticket), HttpStatus.OK);
	}
	
	@PostMapping("/assignticket")
	ResponseEntity<Ticket_Table> assignTicketToEmployeeByAdmin(@RequestBody TicketDtoForEmploye emp ) {
	    
//		return null;
		return new ResponseEntity<Ticket_Table>(adminService.assignTicketToEmployeeByAdmin(emp.getTicketId(), emp.getAssignedId()), HttpStatus.OK);
	}
	
	
	@GetMapping("/getcritical")
	ResponseEntity<List<CriticalLevel_Table>> getAllCritical() {
	    return new ResponseEntity<List<CriticalLevel_Table>>(adminService.getAllCritical(), HttpStatus.OK);
	}
	
	// Project
	@PostMapping("/createproject")
	ResponseEntity<Project_Table> createTickets(@RequestBody Project_Table project) {
	    return new ResponseEntity<Project_Table>(adminService.addProject(project), HttpStatus.OK);
	}
	
	@GetMapping("/getproject")
	ResponseEntity<List<Project_Table>> getAllProject() {
	    return new ResponseEntity<List<Project_Table>>(adminService.getAllProject(), HttpStatus.OK);
	}
	
	@GetMapping("/getproject/{id}")
	ResponseEntity<Project_Table> getProjectByID(@PathVariable("id") Long id) {
	    return new ResponseEntity<Project_Table>(adminService.getProjectByID(id), HttpStatus.OK);
	}


	
	
}
