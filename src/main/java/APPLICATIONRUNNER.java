import models.Client;
import models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import presentation.ClientPresentation;
import presentation.FacturePresentation;

import java.util.Date;

public class APPLICATIONRUNNER {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//        ClientPresentation pres = (ClientPresentation) context.getBean("presentation");
        FacturePresentation presFact = (FacturePresentation) context.getBean("presentationFact");



        // Test save use case for three clients
            presFact.save(new Facture(1L,new Date(),1.9D));
            presFact.save(new Facture(2L,new Date(),4.66D));
//            presFact.save(new Client("ali"));
//            presFact.save(new Client("ahmed"));
//            presFact.save(new Client("omar"));

        // Test modify use case for client with id==1
            //presFact.modify(new Facture(1,new Date(),1.5));

        // Test remove use case for client with id==1
//            pres.removeById(1L);

        // Test find use case for client with id==1
            //pres.getById(1L);

//        Client client = new Client("Omar");
//        pres.save(client);
    }
}
