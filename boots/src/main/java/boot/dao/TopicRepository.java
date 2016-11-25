package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer>{

}
