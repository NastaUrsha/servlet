package by.tms.listener;

import by.tms.model.Basket;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class Listener implements ServletContextListener, HttpSessionListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		se.getSession().setAttribute("basket", new Basket());
		se.getSession().setAttribute("isGuest", true);
		se.getSession().setAttribute("isUser", false);
		se.getSession().setAttribute("isAdmin", false);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {

	}
}
