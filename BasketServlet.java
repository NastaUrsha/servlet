package by.tms.servlet;

import by.tms.model.Basket;
import by.tms.model.Item;
import by.tms.storage.InMemoryItemStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/basket")
public class BasketServlet extends HttpServlet {

	private InMemoryItemStorage inMemoryItemStorage = InMemoryItemStorage.getInstance();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		Item byId = inMemoryItemStorage.getById(Integer.parseInt(id));
		Basket basket = (Basket) req.getSession().getAttribute("basket");
		basket.addItem(byId);
		resp.sendRedirect("/item/view?id=" + id);
	}
}
