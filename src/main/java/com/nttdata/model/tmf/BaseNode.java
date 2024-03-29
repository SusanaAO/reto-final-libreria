package com.nttdata.model.tmf;

import java.net.URI;
import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseNode {
    @JsonProperty("@baseType")
    String baseType;

    @JsonProperty("@schemaLocation")
    URI schemaLocation;

    @JsonProperty("@type")
    String type;

    @JsonProperty("@referredType")
    String referredType;

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (baseType != null) {
            joiner.add("@baseType: " + GraphQLRequestSerializer.getEntry(baseType));
        }
        if (schemaLocation != null) {
            joiner.add("@schemaLocation: " + GraphQLRequestSerializer.getEntry(schemaLocation));
        }
        if (type != null) {
            joiner.add("@type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (referredType != null) {
            joiner.add("@referredType: " + GraphQLRequestSerializer.getEntry(referredType));
        }

        

        return joiner.toString();
    }

}