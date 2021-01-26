package by.tms.servlet;

import by.tms.model.User;
import by.tms.storage.InMemoryItemStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/")
public class HomeServlet extends HttpServlet {

    private InMemoryItemStorage inMemoryItemStorage = InMemoryItemStorage.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("items", inMemoryItemStorage.getAll());
        getServletContext().getRequestDispatcher("/pages/index.jsp").forward(req, resp);
    }
}
