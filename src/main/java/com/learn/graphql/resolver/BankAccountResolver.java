package com.learn.graphql.resolver;

import com.learn.graphql.domain.bank.BankAccount;
import com.learn.graphql.domain.bank.Client;
import com.learn.graphql.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id) {
        log.info("Retrieving bank account id: {}", id);

        var clientA = Client.builder()
                .id(UUID.randomUUID())
                .firstName("Thien")
                .lastName("Quach")
                .build();

        var clientB = Client.builder()
                .id(UUID.randomUUID())
                .firstName("Thien1")
                .lastName("Quach")
                .build();

        clientA.setClient(clientB);

        clientB.setClient(clientA);

        return BankAccount.builder()
                .id(id)
                .currency(Currency.USD)
                .client(clientA)
                .build();
    }

}
