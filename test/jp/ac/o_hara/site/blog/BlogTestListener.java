package jp.ac.o_hara.site.blog;

import java.sql.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class BlogTestListener
 *
 */
@WebListener
public class BlogTestListener implements ServletContextListener {
	
	BlogDAO dao = null;
	
    /**
     * Default constructor. 
     */
    public BlogTestListener() {
        // TODO Auto-generated constructor stub
    	dao = BlogDAO.getInstance();
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	dao = null;
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	if (System.getenv("DATABASE_URL") != null) {
    	} else {
    		if (dao.execSQL("CREATE TABLE IF NOT EXISTS blogtbl"
    				+ "(id IDENTITY, userID VARCHAR(64), date DATE, title VARCHAR(64), article VARCHAR(256)")) {
    			System.out.println("TestBlogDB is READY.");
    		} else {
    			System.out.println("TestBlogDB is NOT READY.");
    		}
    	}
    	dao.create(new BlogBean("hoge", Date.valueOf("2020-12-08"), "ほげ", "ほげほげ"));
    	dao.create(new BlogBean("piyo", Date.valueOf("2020-12-07"), "ぴよ", "ぴよぴよ"));
    }
	
}
