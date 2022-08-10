package com.learn.graphql.resolver.bank;

import com.learn.graphql.domain.bank.BankAccount;
import com.learn.graphql.domain.bank.Client;
import com.learn.graphql.domain.bank.Currency;
import graphql.GraphQLException;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {
    public Client client(BankAccount bankAccount){
        log.info("Requesting client data for bank account id {}", bankAccount.getId());
        throw new GraphQLException("Client unavailable");
//        return Client.builder()
//                .id(UUID.randomUUID())
//                .firstName("Thien1")
//                .lastName("Quach")
//                .build();
    }
}
