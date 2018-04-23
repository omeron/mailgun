package net.sargue.mailgun;

import javax.ws.rs.client.Client;

public interface HttpClientConfigurator {

  Client configure(Client client);

}