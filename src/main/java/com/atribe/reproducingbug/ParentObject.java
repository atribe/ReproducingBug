package com.atribe.reproducingbug;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Created by atribe on 12/27/2016.
 * MasterBatchRecord model mapped to ebr.master_batch_records table.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParentObject {
    private UUID id;
    private String productId;
    private String productName;
    private String companyName;
    private UUID companyLogoImageId;
    private String recordNumber;
    private String revisionNumber;
    private LocalDateTime createDate;
    private String jsonString;

    // Test passes if @JsonManagedReference is removed.
    @JsonManagedReference
    private List<ChildObject> childSet;

    /**
     * Converts from JSON to ParentObject.
     *
     * @param json the json string.
     * @return ParentObject object from json
     * @throws IOException json processing exceptions
     */
    public static ParentObject deserialize(final String json) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        ParentObject parentObject = mapper.readValue(json, ParentObject.class);

        return parentObject;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(final String productName) {
        this.productName = productName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    public UUID getCompanyLogoImageId() {
        return companyLogoImageId;
    }

    public void setCompanyLogoImageId(final UUID companyLogoImageId) {
        this.companyLogoImageId = companyLogoImageId;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(final String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getRevisionNumber() {
        return revisionNumber;
    }

    public void setRevisionNumber(final String revisionNumber) {
        this.revisionNumber = revisionNumber;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(final LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(final String jsonString) {
        this.jsonString = jsonString;
    }

    public List<ChildObject> getChildSet() {
        return childSet;
    }

    public void setChildSet(final List<ChildObject> childSet) {
        this.childSet = childSet;
    }
}
