package boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("/topic")
	public String homeTopic(HttpServletRequest request){
		request.setAttribute("mode", "HOME_TOPIC");
		return "topic";
	}
	
	@GetMapping("/task")
	public String homeTask(HttpServletRequest request){
		request.setAttribute("mode", "HOME_TASK");
		return "task";
	}
	
	@GetMapping("/relation")
	public String homeRelation(HttpServletRequest request){
		request.setAttribute("mode", "HOME_RELATION");
		return "relation";
	}
	@GetMapping("/team")
	public String homeTeam(HttpServletRequest request){
		request.setAttribute("mode", "HOME_TEAM");
		return "team";
	}
}
