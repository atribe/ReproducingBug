package com.atribe.reproducingbug;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "parentObject")
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
}
