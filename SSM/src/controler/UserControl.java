package controler;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pojo.User;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UserControl {
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/getlist")
	public ModelAndView getuserlist(){
		List<User> user_list = new ArrayList<>();
		user_list = userservice.getlist();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user_list", user_list);
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping(value="/finduserbyid",method={RequestMethod.GET})
	public ModelAndView finduserbyid(int id){
		User info = userservice.findbyid(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("info", info);
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
