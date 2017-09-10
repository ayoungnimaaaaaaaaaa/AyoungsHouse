package place.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import place.dao.PlaceDAO;
import place.dao.UserDAO;
import place.service.DataService;
import place.vo.Place;
import place.vo.User;

@RestController
public class DataController {

	@Autowired
	private DataService dataService;
	
	/**user**/
	@RequestMapping("user/{userId}")
	public User getUser(@PathVariable String userId){
		return dataService.getUser(userId);
	}
	
	
	/**place**/
	@RequestMapping("place/list")
	public List<Place> getPlaceList(){		
		return dataService.getPlaceList();
	}
	@RequestMapping("place/name/{place_name}")
	public Place getPlaceByName(@PathVariable String place_name){
		return dataService.getPlaceByName(place_name);
	}
	@RequestMapping("place/address/{address}")
	public Place getPlaceByAddress(@PathVariable String address){
		return dataService.getPlaceByAddress(address);
	}	
	
}
