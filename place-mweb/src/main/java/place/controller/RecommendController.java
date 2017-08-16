package place.controller;

import org.apache.mahout.cf.taste.model.DataModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecommendController {
	
	@RequestMapping(value="/recommend")
	public String recommend(){
				
		return "";
	}

}
