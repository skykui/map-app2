package sg.asia21at.webdev.mapapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/map")
public class IndexController {
	@RequestMapping("/1")
	public String index(){
        
        return "/index";
    }
	@RequestMapping("/2")
	public String index2(){
		
		return "/index2";
	}
}
