package binhct.prj.jetty.server;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;

public class BasicServer {
    private Server server;

    public void start(){
        server = new Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8080);
        server.setConnectors(new Connector[] {connector});
    }

    public static void main(String[] args) {
        BasicServer basicServer = new BasicServer();
        basicServer.start();
    }

}
