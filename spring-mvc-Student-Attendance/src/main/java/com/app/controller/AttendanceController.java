package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AttendanceController {
	
	@RequestMapping("/") 
	public String home() {
		
		
		
		return "home";
		
	}
	
	@RequestMapping("attendancePage")
	public String openAttendance() {
		
		return "attendanceForm";
		
	}
	
	@RequestMapping("checkAttendance")
	public String calculateAttendance(@RequestParam ("name") String name, 
			@RequestParam ("classes") int classes, 
			@RequestParam ("attend") int attend, 
			Model model ) {
		
		double result = (attend * 100) / classes;
		
		String attendance;
		
		if(result >= 75) {
			
			attendance = "Allowed";
			
		} else {
			
			attendance = "Not Allowed";
			
		}
		
		model.addAttribute("name", name);
		model.addAttribute("classes", classes);
		model.addAttribute("attend", attend);
		model.addAttribute("attendance", attendance);
			
		return "result";
		
	}


}
