package com.learn.graphql.domain.bank;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;
@Builder
@Value
public class BankAccount {
    UUID id;
    Client client;
    Currency currency;
}
