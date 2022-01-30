import models.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import presentation.ClientPresentation;
import presentation.FacturePresentation;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class APPLICATIONRUNNER {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientPresentation pres = (ClientPresentation) context.getBean("presentation");

         Client client = new Client("omar");
         ClientVip client1 = new ClientVip("haffsa","vipp");
         ClientNormal client2 = new ClientNormal("imane",345);
        pres.save(client);
        pres.save(client1);
        pres.save(client2);

    }
}
