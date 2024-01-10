package com.xzc.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import com.xzc.model.User;
import com.xzc.util.SessionManager;

/**
 * Application Lifecycle Listener implementation class SessionAttributeListener
 *
 */
@WebListener
public class SessionAttributeListener implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public SessionAttributeListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  {
    	if(arg0.getName().equals("user")) {
    		User u = (User) arg0.getValue();
    		//判断是否有其他客户端已经登录
    		if(SessionManager.sessionMap.containsKey(u.getUsername())) {
    			//获得另外一个客户端的session
    			HttpSession session = SessionManager.sessionMap.get(u.getUsername());
    			//把登录信息从这个客户端抹除
    			session.removeAttribute("user");
    			//从sessionMap中移除
    			SessionManager.sessionMap.remove(u.getUsername());
    		}
    		
    		SessionManager.sessionMap.put(u.getUsername(), arg0.getSession());
    	}
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("attributeRemoved");
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("sessionattributeReplaced");
    }
	
}
