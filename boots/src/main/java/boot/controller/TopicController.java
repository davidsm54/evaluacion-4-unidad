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
import boot.model.Topic;
import boot.service.TopicService;

@Controller
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/all-topics")
	public String allTopic(HttpServletRequest request){
		request.setAttribute("topics", topicService.findAll());
		request.setAttribute("mode", "MODE_TOPIC");
		return "topic";
	}
	
	@GetMapping("/new-topic")
	public String newTopic(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "topic";
	}
	
	@PostMapping("/save-topic")
	public String saveTopic(@ModelAttribute Topic topic,BindingResult bindingResult,HttpServletRequest request){
		topicService.save(topic);
		request.setAttribute("topics", topicService.findAll());
		request.setAttribute("mode", "MODE_TOPIC");
		return "topic";
	}
	
	@GetMapping("/update-topic")
	public String updateTopic(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("topic", topicService.findTopic(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "topic";
	}
	
	@GetMapping("/delete-topic")
	public String deleteTopic(@RequestParam int id,HttpServletRequest request){
		topicService.delete(id);
		request.setAttribute("topics", topicService.findAll());
		request.setAttribute("mode", "MODE_TOPIC");
		return "topic";
	}
	
}
