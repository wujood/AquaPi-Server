/*
 * AquaPi Swagger API
 * REST API for the AquaPi
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Feeder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-02T11:53:15.413Z")
public class Feeder   {
  @JsonProperty("value")
  private Float value = null;

  @JsonProperty("message")
  private String message = null;

  public Feeder value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @JsonProperty("value")
  @ApiModelProperty(example = "0.5", value = "")
  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }

  public Feeder message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @JsonProperty("message")
  @ApiModelProperty(example = "everything is fine", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feeder feeder = (Feeder) o;
    return Objects.equals(this.value, feeder.value) &&
        Objects.equals(this.message, feeder.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feeder {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

