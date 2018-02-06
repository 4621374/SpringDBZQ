package com.dbzq.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.validator.HibernateValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dbzq.po.ItemsQuerVo;
import com.dbzq.exception.CustomException;
import com.dbzq.po.Items;
import com.dbzq.po.ItemsCustom;
import com.dbzq.service.ItemsService;
import com.dbzq.validation.ValidateGroup;
import com.sun.org.apache.xml.internal.security.Init;
import com.sun.xml.internal.bind.v2.runtime.Name;

@Controller
@RequestMapping("/items")
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	@ModelAttribute(value="itemsType")
	public Map<String, String>getItemsType() {
		Map<String, String> itemsType=new HashMap<String, String>();
		itemsType.put("001", "电子产品");
		itemsType.put("002", "服装");
		itemsType.put("003", "食品");
		return itemsType;
		
	}
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception {
		List<ItemsCustom> itemsList=itemsService.findItemlist(null);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("items",itemsList);
		modelAndView.setViewName("itemList2");
		return modelAndView;
		
	}
	@RequestMapping("/editItemsList")
	public ModelAndView editItemsList() throws Exception {
		List<ItemsCustom> itemsList=itemsService.findItemlist(null);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("items",itemsList);
		modelAndView.setViewName("editItemsList");
		return modelAndView;
		
	}
	
	@RequestMapping("/deleteItems")
	public String deleteItems(Integer[] delete_id) throws Exception {

		return "success";
		
	}
	@RequestMapping("/updateItems")
	public String updateItems(ItemsQuerVo itemsQuerVo) throws Exception {
		

		return "success";
	}
		
	@RequestMapping("/editItemsSubmit")
	public String editItemsSubmit(Model model,HttpServletRequest httpServletRequest,Integer id,@Validated(value= {ValidateGroup.class} )@ModelAttribute(value="item")ItemsCustom itemsCustom,BindingResult bindingResult,MultipartFile picFile) throws Exception {
	
	model.addAttribute("id",id);
	String filePath=httpServletRequest.getRealPath("/");
	String oldFileName=picFile.getOriginalFilename();
	String newFileName=UUID.randomUUID()+oldFileName.substring(oldFileName.indexOf("."));
	File file=new File(filePath+"images/"+newFileName);
	picFile.transferTo(file);
	itemsCustom.setPic(newFileName);
	if(bindingResult.hasErrors()) {
		List<ObjectError> errors=bindingResult.getAllErrors();
		model.addAttribute("errors",errors);
		for(ObjectError error:errors){
		System.out.println(error.getDefaultMessage());
		}
	}

	itemsService.updateItems(id, itemsCustom);
	//	return "redirect:queryItems.action";
	
		
		

		return "editItems";
	}
	@RequestMapping("/editItems")
	public String editItems(Model model,Integer id,ItemsCustom itemsCustom) throws Exception {
		if(id<0) {
			throw new CustomException("id erroe");
		}

		 itemsCustom=itemsService.findItemByID(id);
		model.addAttribute("item",itemsCustom);

		return "editItems";
		
	}
////	@RequestMapping("/editItems")
//	public ModelAndView editItems(Model model) throws Exception {
//		ItemsCustom itemsCustom=itemsService.findItemByID(1);
//		model.addAttribute("item",itemsCustom);
//		ModelAndView modelAndView=new ModelAndView();
//		modelAndView.addObject("item",itemsCustom);
//		modelAndView.setViewName("editItems");
//		return modelAndView;
//	
//		
//	}
//	@RequestMapping("/editItems")
//	public void editItems(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse ,@RequestParam(value="id",required=false,defaultValue="1") Integer id ) throws Exception {
//		ItemsCustom itemsCustom=itemsService.findItemByID(id);
//		httpServletRequest.setAttribute("item",itemsCustom);
//		httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/editItems.jsp").forward(httpServletRequest, httpServletResponse);
//
//		
//	}
////	@RequestMapping("/editItems")
//	public String editItems(Model model) throws Exception {
//
//		return "redirect:queryItems.action";
//		//return "forword:queryItems.action";
//	}
//	@InitBinder
//	public void initBinder(WebDataBinder binder)throws Exception {
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-DD"), true));
//	}
	@RequestMapping("/viewItems/{id}")
	public @ResponseBody ItemsCustom viewItems(@PathVariable Integer id) throws Exception {
		
		ItemsCustom itemsCustom=itemsService.findItemByID(id);
		return itemsCustom;
		
		
	}
}
