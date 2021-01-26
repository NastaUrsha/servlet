package by.tms.servlet;

import by.tms.model.Item;
import by.tms.storage.InMemoryItemStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/item/view")
public class ItemViewServlet extends HttpServlet {
	private InMemoryItemStorage inMemoryItemStorage = InMemoryItemStorage.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Item id = inMemoryItemStorage.getById(Integer.parseInt(req.getParameter("id")));
		req.setAttribute("item", id);
		getServletContext().getRequestDispatcher("/pages/itemView.jsp").forward(req, resp);
	}
}
