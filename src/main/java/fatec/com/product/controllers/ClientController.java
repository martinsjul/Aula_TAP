package fatec.com.product.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fatec.com.product.models.Client;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @GetMapping
    public List<Client> getClients() {
        List<Client> clients = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            Client c = new Client();
            c.setId((long) i);
            c.setName("Cliente " + i);
            c.setEmail("contato" + i + "@email.com");
            c.setPhone("(15) 9999-000" + i);
            c.setCpf("123.456.789-0" + i);
            c.setCity("Sorocaba");
            
            clients.add(c);
        }

        return clients;
    }
}
