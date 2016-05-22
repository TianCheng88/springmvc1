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
 * <p>Description:ʵ��controller�ӿڵĴ�����</p>
 * @author �ﾺ��
 *
 */
public class ItemsCoontroller1 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
	//����service�������ݿ⣬��ѯ��Ʒ�б�����ʹ�þ�̬����ģ��
		List<Items> itemsList=new ArrayList<Items>();
		//��list����侲̬����
		Items items1=new Items();
		items1.setName("����ʼǱ�");
		items1.setPrice(6000d);
		items1.setDetails("ThinkPad T430 ����ʼǱ���");
		Items items2=new Items();
		items2.setName("ƻ���ֻ�");
		items2.setPrice(5000d);
		items2.setDetails("iphone6ƻ���ֻ���");
		itemsList.add(items1);
		itemsList.add(items2);
		//����ModelAndView
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("itemsList",itemsList);
		modelAndView.setViewName("/WEB-INF/jsp/Items/itemslist.jsp");
		return modelAndView;
	}

}
