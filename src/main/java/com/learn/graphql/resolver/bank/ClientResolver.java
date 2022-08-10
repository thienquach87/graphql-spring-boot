package com.learn.graphql.resolver.bank;

import com.learn.graphql.domain.bank.BankAccount;
import com.learn.graphql.domain.bank.Client;
import com.learn.graphql.domain.bank.Currency;
import graphql.GraphQLException;
import graphql.execution.DataFetcherResult;
import graphql.kickstart.execution.error.GenericGraphQLError;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.UUID;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {
    public DataFetcherResult<Client> client(BankAccount bankAccount){
        log.info("Requesting client data for bank account id {}", bankAccount.getId());
        return DataFetcherResult.<Client>newResult()
            .data(Client.builder()
                .id(UUID.randomUUID())
                .firstName("Thien1")
                .lastName("Quach").build())
            .error(new GenericGraphQLError("Could not get sub-client id"))
            .build();
    }
}
