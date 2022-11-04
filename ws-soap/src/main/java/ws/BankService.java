package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankService")
public class BankService {

    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double montant){
        return montant * 10.52;
    }

    @WebMethod
    public Compte getCopte(@WebParam(name = "code")int code){
        return new Compte(code,Math.random()*9000,new Date());
    }

    @WebMethod
    public List<Compte> compteList(){
        return List.of(
                new Compte(1,Math.random()*9000,new Date()),
                new Compte(2,Math.random()*9000,new Date()),
                new Compte(3,Math.random()*9000,new Date())
        );
    }
}
