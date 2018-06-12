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
import java.util.Date;
import javax.validation.constraints.*;

/**
 * ParamComponentSettingsPost
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-06-12T17:16:07.145Z")
public class ParamComponentSettingsPost   {
  @JsonProperty("piid")
  private String piid = null;

  @JsonProperty("since")
  private Date since = null;

  @JsonProperty("until")
  private Date until = null;

  public ParamComponentSettingsPost piid(String piid) {
    this.piid = piid;
    return this;
  }

  /**
   * Get piid
   * @return piid
   **/
  @JsonProperty("piid")
  @ApiModelProperty(example = "abc123", required = true, value = "")
  @NotNull
  public String getPiid() {
    return piid;
  }

  public void setPiid(String piid) {
    this.piid = piid;
  }

  public ParamComponentSettingsPost since(Date since) {
    this.since = since;
    return this;
  }

  /**
   * Get since
   * @return since
   **/
  @JsonProperty("since")
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "")
  public Date getSince() {
    return since;
  }

  public void setSince(Date since) {
    this.since = since;
  }

  public ParamComponentSettingsPost until(Date until) {
    this.until = until;
    return this;
  }

  /**
   * Get until
   * @return until
   **/
  @JsonProperty("until")
  @ApiModelProperty(example = "2017-07-22T17:32:28Z", value = "")
  public Date getUntil() {
    return until;
  }

  public void setUntil(Date until) {
    this.until = until;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParamComponentSettingsPost paramComponentSettingsPost = (ParamComponentSettingsPost) o;
    return Objects.equals(this.piid, paramComponentSettingsPost.piid) &&
        Objects.equals(this.since, paramComponentSettingsPost.since) &&
        Objects.equals(this.until, paramComponentSettingsPost.until);
  }

  @Override
  public int hashCode() {
    return Objects.hash(piid, since, until);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParamComponentSettingsPost {\n");
    
    sb.append("    piid: ").append(toIndentedString(piid)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
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

