package com.example.demo;

import java.util.List;





import java.util.Map;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.ErrorException.GlobalException;

import com.example.demo.validation.Validation;


@Controller
public class HomeController {

//	@Autowired
//	private InterfacUserService ser;
//	@Autowired
//	private UserRepository repo;
//
//
//
//
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private FruitService service;


	@RequestMapping("/")
	public String home()
	{
		log.info("Home Page is Created Successufully");
		return "index.jsp";

	}



	@RequestMapping("/admin")
	public String adminpage()
	{
		return "adminlogin.jsp";
	}

	
	@ExceptionHandler(Exception.class)
	@RequestMapping("/login")
	public String view( @Valid @ModelAttribute ("user") Validation v ,BindingResult br) {
		
		if(br.hasErrors()){

			log.error("error while login");
			return "redirect:/admin";
		}
		log.info("successfully login");
		return "redirect:/listfruits";
	}



	@ExceptionHandler(value = Exception.class)
	@RequestMapping("/listfruits")
	public String getAll(Model m){
		List<Fruit> lists = service.getAllFruit();
		m.addAttribute("fruitlist", lists);
		log.info(" Successufully Get into View Page");
		return "fruitview.jsp";	

	}



	

	
	@RequestMapping("/addform")
	public String UserAddform() {
		return "useraddform.jsp";

	}

	@RequestMapping("/addnew")
	public String addnewrow()
	{
		log.info(" SuccessufullyAdded the List using add Method");
		return "addform.jsp";
	}
	@RequestMapping("/deletebyid/{id}")
	public ModelAndView delete(@PathVariable("id") int id)
	{
		service.deleteFruit(id);
		log.info(" Successufully Deleted the record by Id");
		return new ModelAndView("redirect:/listfruits");
	}
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView saveFruit(@ModelAttribute Fruit fruit){
		service.saveOrUpdate(fruit);

		log.info(" Successufully Update the Record");
		return new ModelAndView("redirect:/listfruits");
	}

	
	@RequestMapping(value="/usersave",method = RequestMethod.POST)
	public ModelAndView usersaveFruit(@ModelAttribute Fruit fruit){
		service.saveOrUpdate(fruit);

		log.info(" Successufully Update the Record");
		return new ModelAndView("redirect:/");
	}

}

