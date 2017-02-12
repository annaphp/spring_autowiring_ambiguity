package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballGame implements Game{
	
	private Team homeTeam;
	private Team awayTeam;
	
	public BaseballGame(){}
	

	public BaseballGame(Team homeTeam,  Team awayTeam){
		
		if(homeTeam == awayTeam) System.out.println("home and away are the same object on the heap");
		
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}

	@Autowired //Without qualifier Spring cannot decide between two Teams
	@Qualifier("redSox")
	public void setHomeTeam(Team team) {
		homeTeam = team;
		
	}

	public Team getHomeTeam() {
		return homeTeam;
	}
	
	@Autowired
	@Qualifier("cubs")
	public void setAwayTeam(Team team) {
		awayTeam=team;
	}

	public Team getAwayTeam() {
		return awayTeam;
	}

	public String playGame() {
		if(homeTeam == awayTeam) System.out.println("home and away are the same object on the heap");
		return Math.random() < 0.5 ? getHomeTeam().getName() : getAwayTeam().getName();
	}

}
