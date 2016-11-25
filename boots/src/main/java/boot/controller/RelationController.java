package boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.RelationProperties;
import boot.service.RelationService;

@Controller
public class RelationController {
	@Autowired
	private RelationService relationService;
	
	@GetMapping("/all-relation")
	public String allRelation(HttpServletRequest request){
		request.setAttribute("relations", relationService.findAll());
		request.setAttribute("mode", "MODE_RELATION");
		return "relation";
	}
	
	@GetMapping("/new-relation")
	public String newRelation(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "relation";
	}
	
	@PostMapping("/save-relation")
	public String newRelation(@ModelAttribute RelationProperties relation,BindingResult bindingResult,HttpServletRequest request){
		relationService.save(relation);
		request.setAttribute("relations", relationService.findAll());
		request.setAttribute("mode", "MODE_RELATION");
		return "relation";
	}
	
	@GetMapping("/update-relation")
	public String updateRelation(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("relations", relationService.findRelation(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "relation";
	}
	
	@GetMapping("/delete-relation")
	public String deleteRelation(@RequestParam int id,HttpServletRequest request){
		relationService.delete(id);
		request.setAttribute("relations", relationService.findAll());
		request.setAttribute("mode", "MODE_RELATION");
		return "relation";
	}
	
}
