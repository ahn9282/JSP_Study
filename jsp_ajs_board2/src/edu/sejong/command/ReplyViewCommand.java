package edu.sejong.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.sejong.dao.Bdao;
import edu.sejong.dto.Bdto;

public class ReplyViewCommand implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		int bidnum = Integer.valueOf(request.getParameter("bid"));
		Bdao dao = new Bdao();
		Bdto dto =new Bdto();
				dto = dao.replyView(bidnum);
				request.setAttribute("reply_view", dto);
	}

}
