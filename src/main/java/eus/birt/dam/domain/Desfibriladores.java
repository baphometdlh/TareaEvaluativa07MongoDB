package eus.birt.dam.domain;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_id",
        "id",
        "type",
        "geometry",
        "properties"
})

@Data
@AllArgsConstructor
@Document(collection="desfibriladores_euskadi")
@Generated("jsonschema2pojo")
public class Desfibriladores {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("id")
    private Integer desfibriladoresId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonProperty("properties")
    private Properties properties;

}
