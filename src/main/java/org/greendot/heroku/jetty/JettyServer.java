package org.greendot.heroku.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.webapp.WebAppContext;
public class JettyServer {
	  /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
        String webappDirLocation = "src/main/webapp/";
        
        //The port that we should run on can be set into an environment variable
        //Look for that variable and default to 8080 if it isn't there.
        String webPort = System.getenv("PORT");
        if(webPort == null || webPort.isEmpty()) {
            webPort = "9191";
        }

        Server server = new Server(Integer.valueOf(webPort));
        
				WebAppContext root = new WebAppContext();
				root.setContextPath("/WebService");
				root.setDescriptor(webappDirLocation+"/WEB-INF/web.xml");
				root.setResourceBase(webappDirLocation);

				WebAppContext jsp = new WebAppContext();
				jsp.setContextPath("/admin");
				jsp.setResourceBase(webappDirLocation+"admin/");
				
				WebAppContext servlet = new WebAppContext();
				servlet.setContextPath("/servlet");
        servlet.setDescriptor(webappDirLocation+"/WEB-INF/servlet.xml");
        servlet.setResourceBase(webappDirLocation);


				HandlerList handlers = new HandlerList();
				handlers.setHandlers(new Handler[] { root, jsp, servlet });
        
        //Parent loader priority is a class loader setting that Jetty accepts.
        //By default Jetty will behave like most web containers in that it will
        //allow your application to replace non-server libraries that are part of the
        //container. Setting parent loader priority to true changes this behavior.
        //Read more here: http://wiki.eclipse.org/Jetty/Reference/Jetty_Classloading
        root.setParentLoaderPriority(true);
        
        server.setHandler(handlers);
        
        server.start();
        server.join();   
    }

}
