package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.RelationRepository;
import boot.model.RelationProperties;

@Service @Transactional
public class RelationService {
	private final RelationRepository relationRepository;

	public RelationService(RelationRepository relationRepository) {
		super();
		this.relationRepository = relationRepository;
	}
	
	public List<RelationProperties> findAll(){
		List<RelationProperties> relations = new ArrayList<RelationProperties>();
		for (RelationProperties relation : relationRepository.findAll()) {
			relations.add(relation);
		}
		return relations;
	}
	
	public void save(RelationProperties relationProperties){
		relationRepository.save(relationProperties);
	}
	
	public void delete(int id){
		relationRepository.delete(id);
	}
	
	public RelationProperties findRelation(int id){
		return relationRepository.findOne(id);
	}
}
