package com.wyb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wyb.pojo.TbItem;
import com.wyb.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@ResponseBody
	@RequestMapping("/item/{id}")
	public TbItem findItemById(@PathVariable Long id){
		TbItem tbItem = itemService.findItemById(id);
		return tbItem;
	}
}
