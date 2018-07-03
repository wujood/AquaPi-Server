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
 * ParamPushConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-03T15:06:07.764Z")
public class ParamPushConfiguration   {
  @JsonProperty("piid")
  private String piid = null;

  public ParamPushConfiguration piid(String piid) {
    this.piid = piid;
    return this;
  }

  /**
   * Get piid
   * @return piid
   **/
  @JsonProperty("piid")
  @ApiModelProperty(value = "")
  public String getPiid() {
    return piid;
  }

  public void setPiid(String piid) {
    this.piid = piid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParamPushConfiguration paramPushConfiguration = (ParamPushConfiguration) o;
    return Objects.equals(this.piid, paramPushConfiguration.piid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(piid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParamPushConfiguration {\n");
    
    sb.append("    piid: ").append(toIndentedString(piid)).append("\n");
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

