package com.winter.app.departments;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.winter.app.departments.DepartmentDAO;
import com.winter.app.departments.DepartmentDTO;

@Controller
@RequestMapping(value = "/department/*")
public class DepartmentController {
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(HttpServletRequest request)throws Exception{
		DepartmentDAO departmentDAO = new DepartmentDAO();
		DepartmentDTO departmentDTO = new DepartmentDTO();
		String id = request.getParameter("department_id");
		
		departmentDTO.setDepartment_id(Integer.parseInt(id));
		departmentDTO = departmentDAO.getDetail(departmentDTO);
		
		request.setAttribute("dto", departmentDTO);
		return "department/detail";
	}
	
	
	
	
	
	
	@RequestMapping(value = "list", method = RequestMethod.GET) 
	public String list(HttpServletRequest request)throws Exception {
		System.out.println("Department List");
		DepartmentDAO departmentDAO = new DepartmentDAO();
		List<DepartmentDTO> ar = departmentDAO.getList();
		request.setAttribute("list", ar);
		
		return "department/list";
	}
}
