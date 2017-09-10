package place.controller;

import java.util.List;

import org.apache.mahout.cf.taste.model.DataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import place.service.ApiService;
import place.service.RecommendService;
import place.vo.Place;

@RestController
public class RecommendController {
	
	@Autowired
	ApiService apiService;
	@Autowired
	RecommendService recommendService;
	
	@RequestMapping(value="/recommend/{userId}")
	public List<Place> recommend(@PathVariable String userId){				
		//recommendService.rescore(userId);
		return null;
	}

}
