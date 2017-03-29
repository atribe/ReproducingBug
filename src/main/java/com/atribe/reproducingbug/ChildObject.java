package com.atribe.reproducingbug;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Data
/*
 * Test only passes if the @AllArgsConstructor on the child is commented out.
 * The parent object can have @AllArgsConstructor.
 */
//@AllArgsConstructor
@ToString(exclude = "parentObject")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChildObject {
    private UUID id;
    @JsonBackReference
    private ParentObject parentObject;
    private UUID componentId;
    private int orderNumber;
    private String orderLabel;
    private String title;
}
