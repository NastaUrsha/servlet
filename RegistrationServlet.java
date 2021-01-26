package by.tms.servlet;

import by.tms.model.Role;
import by.tms.model.User;
import by.tms.storage.InMemoryUserStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/reg", name = "RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	private final InMemoryUserStorage inMemoryUserStorage
			= new InMemoryUserStorage();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/pages/reg.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		User user = new User(name, login, password, Role.USER);
		boolean save = inMemoryUserStorage.save(user);
		if (save) {
			resp.sendRedirect("/");
		} else {
			req.setAttribute("message", "User is exist!");
			req.setAttribute("oldName", name);
			req.setAttribute("oldLogin", login);
			req.setAttribute("oldPassword", password);
			getServletContext().getRequestDispatcher("/pages/reg.jsp").forward(req, resp);
		}
	}
}
