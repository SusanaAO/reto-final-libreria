package com.nttdata.model.dgraph;

import java.util.HashMap;
import java.util.Map;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ServiceOrder
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-02-17T10:15:22-0500"
)
public class ServiceOrderResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceOrderResponseProjection() {
    }

    public ServiceOrderResponseProjection all$() {
        return all$();
    }

    public ServiceOrderResponseProjection all$(int maxDepth) {
        this.id();
        this.type();
        this.category();
        this.description();
        this.externalId();
        this.priority();
        this.requestedCompletionDate();
        this.requestedStartDate();
        this.state();

        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.PartyResponseProjection.relatedto", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.PartyResponseProjection.relatedto", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.PartyResponseProjection.relatedto", 0) + 1);
            this.relatedto(new PartyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.PartyResponseProjection.relatedto", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.FlowExecutionRefResponseProjection.fulfilledby", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.FlowExecutionRefResponseProjection.fulfilledby", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.FlowExecutionRefResponseProjection.fulfilledby", 0) + 1);
            this.fulfilledby(new FlowExecutionRefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.FlowExecutionRefResponseProjection.fulfilledby", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.CancellationRequestResponseProjection.cancelrequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.CancellationRequestResponseProjection.cancelrequest", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.CancellationRequestResponseProjection.cancelrequest", 0) + 1);
            this.cancelrequest(new CancellationRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.CancellationRequestResponseProjection.cancelrequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ModificationRequestResponseProjection.modifyrequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.ModificationRequestResponseProjection.modifyrequest", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ModificationRequestResponseProjection.modifyrequest", 0) + 1);
            this.modifyrequest(new ModificationRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ModificationRequestResponseProjection.modifyrequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ServiceOrderItemResponseProjection.composedof", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.ServiceOrderItemResponseProjection.composedof", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ServiceOrderItemResponseProjection.composedof", 0) + 1);
            this.composedof(new ServiceOrderItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.ServiceOrderItemResponseProjection.composedof", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.NoteResponseProjection.has", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceOrderResponseProjection.NoteResponseProjection.has", projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.NoteResponseProjection.has", 0) + 1);
            this.has(new NoteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceOrderResponseProjection.NoteResponseProjection.has", 0)));
        }
        return this;
    }
    
    
    public ServiceOrderResponseProjection serviceOrder() {
        return serviceOrder(null);
    }
    
    public ServiceOrderResponseProjection serviceOrder(String alias) {
        fields.add(new GraphQLResponseField("serviceOrder").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection id() {
        return id(null);
    }

    public ServiceOrderResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection msg() {
        return msg(null);
    }

    public ServiceOrderResponseProjection msg(String alias) {
        fields.add(new GraphQLResponseField("msg").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection type() {
        return type(null);
    }
    
    public ServiceOrderResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("@type").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection category() {
        return category(null);
    }

    public ServiceOrderResponseProjection category(String alias) {
        fields.add(new GraphQLResponseField("category").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection description() {
        return description(null);
    }

    public ServiceOrderResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection externalId() {
        return externalId(null);
    }

    public ServiceOrderResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection priority() {
        return priority(null);
    }

    public ServiceOrderResponseProjection priority(String alias) {
        fields.add(new GraphQLResponseField("priority").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection requestedCompletionDate() {
        return requestedCompletionDate(null);
    }

    public ServiceOrderResponseProjection requestedCompletionDate(String alias) {
        fields.add(new GraphQLResponseField("requestedCompletionDate").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection requestedStartDate() {
        return requestedStartDate(null);
    }

    public ServiceOrderResponseProjection requestedStartDate(String alias) {
        fields.add(new GraphQLResponseField("requestedStartDate").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection state() {
        return state(null);
    }

    public ServiceOrderResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public ServiceOrderResponseProjection relatedto(PartyResponseProjection subProjection) {
        return relatedto(null, subProjection);
    }

    public ServiceOrderResponseProjection relatedto(String alias, PartyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("relatedParty").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderResponseProjection fulfilledby(FlowExecutionRefResponseProjection subProjection) {
        return fulfilledby(null, subProjection);
    }

    public ServiceOrderResponseProjection fulfilledby(String alias, FlowExecutionRefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("flowExecutionRef").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderResponseProjection cancelrequest(CancellationRequestResponseProjection subProjection) {
        return cancelrequest(null, subProjection);
    }

    public ServiceOrderResponseProjection cancelrequest(String alias, CancellationRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cancelrequest").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderResponseProjection modifyrequest(ModificationRequestResponseProjection subProjection) {
        return modifyrequest(null, subProjection);
    }

    public ServiceOrderResponseProjection modifyrequest(String alias, ModificationRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("modifyrequest").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderResponseProjection composedof(ServiceOrderItemResponseProjection subProjection) {
        return composedof(null, subProjection);
    }

    public ServiceOrderResponseProjection composedof(String alias, ServiceOrderItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceOrderItem").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceOrderResponseProjection has(NoteResponseProjection subProjection) {
        return has(null, subProjection);
    }

    public ServiceOrderResponseProjection has(String alias, NoteResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("note").alias(alias).projection(subProjection));
        return this;
    }


	public boolean hasErrors() {
		return false;
	}


	
	
	
}
