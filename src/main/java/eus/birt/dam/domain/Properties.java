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
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "organismo",
        "direccion",
        "municipio",
        "provincia",
        "ubicacion",
        "horario",
        "numserie",
        "modelo",
        "codigo_dea"
})

@Data
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class Properties {

    @JsonProperty("organismo")
    private String organismo;
    @JsonProperty("direccion")
    private String direccion;
    @JsonProperty("municipio")
    private String municipio;
    @JsonProperty("provincia")
    private String provincia;
    @JsonProperty("ubicacion")
    private String ubicacion;
    @JsonProperty("horario")
    private String horario;
    @JsonProperty("numserie")
    private String numserie;
    @JsonProperty("modelo")
    private String modelo;
    @JsonProperty("codigo_dea")
    private String codigoDea;

}
