package com.winter.app.bank;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/bank/*")
public class BankController {
	
	private Bank_DAO bank_DAO;
	public BankController() {
		this.bank_DAO = new Bank_DAO();
	}
	
	//list
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView  getList() throws Exception {
		ModelAndView mv = new ModelAndView();

		return mv;
	}

	// detail
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(Long productNum, Model model ) throws Exception {

		return "bank/detail";
	}

}
