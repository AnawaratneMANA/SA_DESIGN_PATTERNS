package proxyPattern;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RemoteClient {
    public static void main(String[] args) {
        new RemoteClient().go();
    }

    private void go() {
        try {
            RemoteServiceImpl service = (RemoteServiceImpl) Naming.lookup("rmi://localhost/RemoteHello");
            String ss = service.sayingHello();
            System.out.println(ss);
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (RemoteException e){
            e.printStackTrace();
        } catch (NotBoundException e){
            e.printStackTrace();
        }
    }
}
