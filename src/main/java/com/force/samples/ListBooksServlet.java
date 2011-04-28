package com.force.samples;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.force.samples.entity.Book;
import com.force.samples.util.PersistenceUtil;

public class ListBooksServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		EntityManager em = PersistenceUtil.getEntityManager();
		Query query = em.createQuery("select b from Book b");
		List<Book> books = query.getResultList();
		System.out.println("Books = " + books);
		
		req.setAttribute("books", books);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listResults.jsp");
		rd.forward(req, resp);
	}
}
