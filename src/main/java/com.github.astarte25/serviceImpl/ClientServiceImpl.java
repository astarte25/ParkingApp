package com.github.astarte25.serviceImpl;

import com.github.astarte25.model.Client;
import com.github.astarte25.repository.ClientRepo;
import com.github.astarte25.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientServiceImpl implements ClientService {

    ClientRepo clientRepo;

    @Override
    public Client createClient() {
        Client client = new Client();
            client.getTicket();
            return clientRepo.save(client);
    }

    @Override
    public ArrayList getAllClients() {
        return new ArrayList<>(clientRepo.findAll());
    }

    @Override
    public Client getOneById(Long id) {
        return clientRepo.getOne(id);
    }

}
