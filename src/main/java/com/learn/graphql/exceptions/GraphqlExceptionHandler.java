package com.learn.graphql.exceptions;

import graphql.GraphQLException;
import graphql.kickstart.spring.error.ThrowableGraphQLError;
import org.ietf.jgss.GSSException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
public class GraphqlExceptionHandler {

    @ExceptionHandler(GraphQLException.class)
    public ThrowableGraphQLError handle(GraphQLException e){
        return new ThrowableGraphQLError(e);
    }
    @ExceptionHandler(RuntimeException.class)
    public ThrowableGraphQLError handle(RuntimeException e){
        return new ThrowableGraphQLError(e, "Internal Server Error");
    }
}
