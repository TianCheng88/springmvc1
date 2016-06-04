package cn.itcast.ssm.controller.httphandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import cn.itcast.ssm.po.Items;

public class HttpCustomHandler implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Items> itemsList=new ArrayList<Items>();
		//��list����侲̬����
		Items items1=new Items();
		items1.setId(1);
		items1.setName("����ʼǱ�");
		items1.setPrice(6000d);
		items1.setDetails("ThinkPad T430 ����ʼǱ���");
		Items items2=new Items();
		items2.setId(2);
		items2.setName("ƻ���ֻ�");
		items2.setPrice(5000d);
		items2.setDetails("iphone6ƻ���ֻ���");
		itemsList.add(items1);
		itemsList.add(items2);
		request.setAttribute("itemsList", itemsList);
		//request.getRequestDispatcher("jsp/Items/itemslist.jsp").forward(request, response);
		
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write("[\"apple\",\"orange\",\"hha\"]");
	}

}
