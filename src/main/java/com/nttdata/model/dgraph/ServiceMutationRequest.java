package com.nttdata.model.dgraph;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class ServiceMutationRequest implements GraphQLOperationRequest {

    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private String operationName;
    private String alias;

    public Map<String, Object> input = new LinkedHashMap<>();

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    @Override
    public String getOperationName() {
        return operationName;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    public void setInput(Object input) {
        this.input.put("input", input);
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String getAlias() {
        return alias;
    }
}
