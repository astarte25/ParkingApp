package com.github.astarte25.service;

import com.github.astarte25.model.Client;

import java.util.ArrayList;

public interface ClientService {

    Client createClient();

    ArrayList getAllClients();

    Client getOneById(Long id);


}
