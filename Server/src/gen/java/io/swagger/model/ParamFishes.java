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
 * ParamFishes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-06-12T17:16:07.145Z")
public class ParamFishes   {
  @JsonProperty("piid")
  private String piid = null;

  public ParamFishes piid(String piid) {
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
    ParamFishes paramFishes = (ParamFishes) o;
    return Objects.equals(this.piid, paramFishes.piid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(piid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParamFishes {\n");
    
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

