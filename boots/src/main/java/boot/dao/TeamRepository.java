package boot.dao;

import org.springframework.data.repository.CrudRepository;

import boot.model.Team;

public interface TeamRepository extends CrudRepository<Team, Integer>{

}
