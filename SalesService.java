package Main.SalesProject.Hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SalesService {

	private List<TeamDetails> Team = new ArrayList<>(Arrays.asList(new TeamDetails(1,"Raj"),
  		  new TeamDetails(2,"Vishu"),
  		  new TeamDetails(3,"Shubha")
  		  ));
	//private int id;
	
	public List<TeamDetails> getTeam()
	{
		return Team;	
	}
	
	public TeamDetails getMember(int id)
	{
		for(TeamDetails Details: Team )
		{
			if((Details.getId())==id)
			{
				return Details;
			}
		}
		return null;
	}

	public void deleteMember(int id) {
		for(TeamDetails Details: Team )
		{
			if((Details.getId())==id)
			{
				Team.remove(id-1);
			}
		}
	}
	public void addNew(TeamDetails teamDetails) {
		
		Team.add(teamDetails);
	}

	public void updateMember(TeamDetails teamDetails, int id2) {
		
		for(int i=0;i<Team.size();i++)
		{
			TeamDetails n= Team.get(i);
			if(n.getId()== id2)
			{
				Team.set(i, teamDetails);
			}
		}
		
	}


		
	}


 