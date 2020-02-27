package binhct.prj.jetty.server;

import binhct.prj.jetty.servlet.BlockingServlet;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

public class BasicServer {
    private Server server;

    public void start() throws Exception {
        server = new Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8080);
        server.setConnectors(new Connector[] {connector});

        ServletHandler servletHandler = new ServletHandler();
        servletHandler.addServletWithMapping(BlockingServlet.class, "/status");
        server.setHandler(servletHandler);
        server.start();
    }

    public static void main(String[] args) throws Exception {
        BasicServer basicServer = new BasicServer();
        basicServer.start();
    }

}
