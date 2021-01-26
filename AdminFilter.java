package by.tms.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(servletNames = "FindAllServlet")
public class AdminFilter extends HttpFilter {
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
		boolean isAdmin = (boolean) req.getSession().getAttribute("isAdmin");
		if (isAdmin){
			chain.doFilter(req, res);
		} else {
			res.sendRedirect("/");
		}
	}
}
