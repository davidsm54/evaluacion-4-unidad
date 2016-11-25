package boot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import boot.model.RelationProperties;

@Repository
public interface RelationRepository extends CrudRepository<RelationProperties, Integer> {

}
