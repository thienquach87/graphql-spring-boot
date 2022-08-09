package com.learn.graphql.resolver;

import com.learn.graphql.domain.bank.BankAccount;
import com.learn.graphql.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id) {
        log.info("Retrieving bank account id: {}", id);
        return BankAccount.builder().id(id).currency(Currency.USD).name("thien.quach").build();
    }

}
