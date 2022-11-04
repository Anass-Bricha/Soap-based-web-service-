import proxy.BankService;
import proxy.BankService_Service;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        //this a middleware
        BankService stub = new BankService_Service().getBankServicePort();
        System.out.println(stub.convert(500));

        Compte cp = stub.getCopte(1);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
