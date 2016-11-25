package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.TopicRepository;
import boot.model.RelationProperties;
import boot.model.Topic;

@Service @Transactional
public class TopicService {
	private final TopicRepository topicRepository;

	public TopicService(TopicRepository topicRepository) {
		super();
		this.topicRepository = topicRepository;
	}
		
	public List<Topic> findAll(){
		List<Topic> topics = new ArrayList<Topic>();
		for (Topic topic : topicRepository.findAll()) {
			topics.add(topic);
		}
		return topics;
	}
	
	public void save(Topic topic){
		topicRepository.save(topic);
	}
	
	public void delete(int id){
		topicRepository.delete(id);
	}
	
	public Topic findTopic(int id){
		return topicRepository.findOne(id);
	}
}