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
import io.swagger.model.MessagesMessages;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Messages
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-03T14:14:41.367Z")
public class Messages   {
  @JsonProperty("messages")
  private List<MessagesMessages> messages = null;

  public Messages messages(List<MessagesMessages> messages) {
    this.messages = messages;
    return this;
  }

  public Messages addMessagesItem(MessagesMessages messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<MessagesMessages>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Get messages
   * @return messages
   **/
  @JsonProperty("messages")
  @ApiModelProperty(value = "")
  public List<MessagesMessages> getMessages() {
    return messages;
  }

  public void setMessages(List<MessagesMessages> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Messages messages = (Messages) o;
    return Objects.equals(this.messages, messages.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Messages {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
