package com.atribe.reproducingbug;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Created by atribe on 12/27/2016.
 * MasterBatchRecord model mapped to ebr.master_batch_records table.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
