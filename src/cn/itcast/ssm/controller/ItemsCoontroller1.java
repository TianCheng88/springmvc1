package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.itcast.ssm.po.Items;

/**
 * <p> Title:ItemsController1</p>
 * <p>Description:实现controller接口的处理器</p>
 * @author 田竞成
 *
 */
public class ItemsCoontroller1 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
	//调用service查找数据库，查询商品列表，这里使用静态数据模拟
		List<Items> itemsList=new ArrayList<Items>();
		//向list中填充静态数据
		Items items1=new Items();
		items1.setName("联想笔记本");
		items1.setPrice(6000d);
		items1.setDetails("ThinkPad T430 联想笔记本！");
		Items items2=new Items();
		items2.setName("苹果手机");
		items2.setPrice(5000d);
		items2.setDetails("iphone6苹果手机！");
		itemsList.add(items1);
		itemsList.add(items2);
		//返回ModelAndView
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("itemsList",itemsList);
		modelAndView.setViewName("/WEB-INF/jsp/Items/itemslist.jsp");
		return modelAndView;
	}

}
