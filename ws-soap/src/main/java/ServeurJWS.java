import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class ServeurJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new BankService());
        System.out.println("Web service deploié sur http://0.0.0.0:9191");
    }
}
