package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.Items;

@Controller("/list")
public class ItemsAnnotationController {
	
	@RequestMapping("/queryItems_haha")
	public ModelAndView queryItems()
	{
		List<Items> itemsList=new ArrayList<Items>();
		//向list中填充静态数据
		Items items1=new Items();
		items1.setId(1);
		items1.setName("联想笔记本");
		items1.setPrice(6000d);
		items1.setDetails("ThinkPad T430 联想笔记本！");
		Items items2=new Items();
		items2.setId(2);
		items2.setName("苹果手机");
		items2.setPrice(5000d);
		items2.setDetails("iphone6苹果手机！");
		itemsList.add(items1);
		itemsList.add(items2);
		//返回ModelAndView
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("itemsList",itemsList);
		modelAndView.setViewName("itemslist");
		return modelAndView;
	}

}
