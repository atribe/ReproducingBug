package com.atribe.reproducingbug;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChildObject {
    private UUID id;
    // Test passes if @JsonBackReference is removed.
    @JsonBackReference
    private ParentObject parentObject;
    private UUID componentId;
    private int orderNumber;
    private String orderLabel;
    private String title;

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public ParentObject getParentObject() {
        return parentObject;
    }

    public void setParentObject(final ParentObject parentObject) {
        this.parentObject = parentObject;
    }

    public UUID getComponentId() {
        return componentId;
    }

    public void setComponentId(final UUID componentId) {
        this.componentId = componentId;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(final int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderLabel() {
        return orderLabel;
    }

    public void setOrderLabel(final String orderLabel) {
        this.orderLabel = orderLabel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }
}
