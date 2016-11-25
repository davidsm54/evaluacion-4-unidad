package boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boot.dao.TeamRepository;
import boot.model.Team;

@Service @Transactional
public class TeamService {
	private TeamRepository teamRepository;

	public TeamService(TeamRepository teamRepository) {
		super();
		this.teamRepository = teamRepository;
	}
	
	public List<Team> findAll(){
		List<Team> teams = new ArrayList<Team>();
		for (Team team : teamRepository.findAll()) {
			teams.add(team);
		}
		return teams;
	}
	
	public void save(Team team){
		teamRepository.save(team);
	}
	
	public void delete(int id){
		teamRepository.delete(id);
	}
	
	public Team findTeam(int id){
		return teamRepository.findOne(id);
	}
}
