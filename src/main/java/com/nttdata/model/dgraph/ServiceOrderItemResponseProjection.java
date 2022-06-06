package com.nttdata.model.dgraph;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ServiceOrderItem
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-03-25T10:09:44-0500"
)
public class ServiceOrderItemResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceOrderItemResponseProjection() {
    }

    public ServiceOrderItemResponseProjection all$() {
        return all$(1);
    }

    public ServiceOrderItemResponseProjection all$(int maxDepth) {
        this.id();
        this.type();
        this.action();
        
        this.service(new ServiceSOMResponseProjection());
        
        
//        if (projectionDepthOnFields.getOrDefault("ServiceOrderItemResponseProjection.ServiceSOMResponseProjection.service", 0) <= maxDepth) {
//            projectionDepthOnFields.put("ServiceOrderItemResponseProjection.ServiceSOMResponseProjection.service", projectionDepthOnFields.getOrDefault("ServiceOrderItemResponseProjection.ServiceSOMResponseProjection.service", 0) + 1);
//            this.service(new ServiceSOMResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderItemResponseProjection.ServiceSOMResponseProjection.service", 0)));
//        }
        if (projectionDepthOnFields.getOrDefault("ServiceOrderItemResponseProjection.PlaceResponseProjection.place", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderItemResponseProjection.PlaceResponseProjection.place", projectionDepthOnFields.getOrDefault("ServiceOrderItemResponseProjection.PlaceResponseProjection.place", 0) + 1);
            this.place(new PlaceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderItemResponseProjection.PlaceResponseProjection.place", 0)));
        }
        this.typename();
        return this;
    }

    public ServiceOrderItemResponseProjection id() {
        return id(null);
    }

    public ServiceOrderItemResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceOrderItemResponseProjection type() {
        return type(null);
    }

    public ServiceOrderItemResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public ServiceOrderItemResponseProjection action() {
        return action(null);
    }

    public ServiceOrderItemResponseProjection action(String alias) {
        fields.add(new GraphQLResponseField("action").alias(alias));
        return this;
    }

    public ServiceOrderItemResponseProjection service(ServiceSOMResponseProjection subProjection) {
        return service(null, subProjection);
    }

    public ServiceOrderItemResponseProjection service(String alias, ServiceSOMResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("service").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderItemResponseProjection place(PlaceResponseProjection subProjection) {
        return place(null, subProjection);
    }

    public ServiceOrderItemResponseProjection place(String alias, PlaceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("place").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderItemResponseProjection typename() {
        return typename(null);
    }

    public ServiceOrderItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
