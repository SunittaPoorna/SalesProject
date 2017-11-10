package Main.SalesProject.Hello;

//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesAppController {
	
	@Autowired
	private SalesService salesService;

	//Listing all the Members GET
@RequestMapping("/member")	
	public List<TeamDetails> listMembers()
	{

      return salesService.getTeam();

	}

//Returning Single Member GET
@RequestMapping("/member/{id}")
public TeamDetails getMember(@PathVariable int id)
{
	return salesService.getMember(id);
}

//To Delete a member
@RequestMapping(method=RequestMethod.DELETE,value="/member/{id}")
public void deleteMember(@PathVariable int id)
{
	salesService.deleteMember(id);

}

//To add New member
@RequestMapping(method=RequestMethod.POST,value="/member")
public void addMember(@RequestBody TeamDetails teamDetails)
{
	salesService.addNew(teamDetails);

}
//To Update details
@RequestMapping(method=RequestMethod.PUT,value="/member/{id}")
public void updateMember(@RequestBody TeamDetails teamDetails,@PathVariable int id)
{
	salesService.updateMember(teamDetails,id);

}


}
