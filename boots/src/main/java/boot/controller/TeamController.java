package boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Team;
import boot.service.TeamService;

@Controller
public class TeamController {
	@Autowired
	private TeamService teamService;
	
	@GetMapping("/all-team")
	public String allTeam(HttpServletRequest request){
		request.setAttribute("teams", teamService.findAll());
		request.setAttribute("mode", "MODE_TEAM");
		return "team";
	}
	
	@GetMapping("/new-team")
	public String newTeam(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "team";
	}
	
	@PostMapping("/save-team")
	public String saveTeam(@ModelAttribute Team team,BindingResult bindingResult,HttpServletRequest request){
		teamService.save(team);
		request.setAttribute("teams", teamService.findAll());
		request.setAttribute("mode", "MODE_TEAM");
		return "team";
	}
	
	@GetMapping("/update-team")
	public String updateTeam(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("team", teamService.findTeam(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "team";
	}
	
	@GetMapping("/delete-team")
	public String deleteTeam(@RequestParam int id,HttpServletRequest request){
		teamService.delete(id);
		request.setAttribute("teams", teamService.findAll());
		request.setAttribute("mode", "MODE_TEAM");
		return "team";
	}
	
	
}
