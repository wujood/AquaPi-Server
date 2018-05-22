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
import io.swagger.model.Feeder;
import io.swagger.model.Lamp;
import io.swagger.model.LightSensor;
import io.swagger.model.Pump;
import io.swagger.model.Thermometer;
import io.swagger.model.WaterFlowSensor;
import io.swagger.model.WaterLevelSensor;
import java.util.Date;
import javax.validation.constraints.*;

/**
 * Data structure that holds information about all used components. Also holds the Pi Id and a timestamp.
 */
@ApiModel(description = "Data structure that holds information about all used components. Also holds the Pi Id and a timestamp.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-05-20T08:07:13.780Z")
public class ComponentSettings   {
  @JsonProperty("PiId")
  private String piId = null;

  @JsonProperty("Timestamp")
  private Date timestamp = null;

  @JsonProperty("WaterFlowSensor")
  private WaterFlowSensor waterFlowSensor = null;

  @JsonProperty("LightSensor")
  private LightSensor lightSensor = null;

  @JsonProperty("WaterLevelSensor")
  private WaterLevelSensor waterLevelSensor = null;

  @JsonProperty("Thermometer")
  private Thermometer thermometer = null;

  @JsonProperty("Lamp")
  private Lamp lamp = null;

  @JsonProperty("Feeder")
  private Feeder feeder = null;

  @JsonProperty("Pump")
  private Pump pump = null;

  public ComponentSettings piId(String piId) {
    this.piId = piId;
    return this;
  }

  /**
   * Get piId
   * @return piId
   **/
  @JsonProperty("PiId")
  @ApiModelProperty(example = "abc123", value = "")
  public String getPiId() {
    return piId;
  }

  public void setPiId(String piId) {
    this.piId = piId;
  }

  public ComponentSettings timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  @JsonProperty("Timestamp")
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "")
  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public ComponentSettings waterFlowSensor(WaterFlowSensor waterFlowSensor) {
    this.waterFlowSensor = waterFlowSensor;
    return this;
  }

  /**
   * Get waterFlowSensor
   * @return waterFlowSensor
   **/
  @JsonProperty("WaterFlowSensor")
  @ApiModelProperty(value = "")
  public WaterFlowSensor getWaterFlowSensor() {
    return waterFlowSensor;
  }

  public void setWaterFlowSensor(WaterFlowSensor waterFlowSensor) {
    this.waterFlowSensor = waterFlowSensor;
  }

  public ComponentSettings lightSensor(LightSensor lightSensor) {
    this.lightSensor = lightSensor;
    return this;
  }

  /**
   * Get lightSensor
   * @return lightSensor
   **/
  @JsonProperty("LightSensor")
  @ApiModelProperty(value = "")
  public LightSensor getLightSensor() {
    return lightSensor;
  }

  public void setLightSensor(LightSensor lightSensor) {
    this.lightSensor = lightSensor;
  }

  public ComponentSettings waterLevelSensor(WaterLevelSensor waterLevelSensor) {
    this.waterLevelSensor = waterLevelSensor;
    return this;
  }

  /**
   * Get waterLevelSensor
   * @return waterLevelSensor
   **/
  @JsonProperty("WaterLevelSensor")
  @ApiModelProperty(value = "")
  public WaterLevelSensor getWaterLevelSensor() {
    return waterLevelSensor;
  }

  public void setWaterLevelSensor(WaterLevelSensor waterLevelSensor) {
    this.waterLevelSensor = waterLevelSensor;
  }

  public ComponentSettings thermometer(Thermometer thermometer) {
    this.thermometer = thermometer;
    return this;
  }

  /**
   * Get thermometer
   * @return thermometer
   **/
  @JsonProperty("Thermometer")
  @ApiModelProperty(value = "")
  public Thermometer getThermometer() {
    return thermometer;
  }

  public void setThermometer(Thermometer thermometer) {
    this.thermometer = thermometer;
  }

  public ComponentSettings lamp(Lamp lamp) {
    this.lamp = lamp;
    return this;
  }

  /**
   * Get lamp
   * @return lamp
   **/
  @JsonProperty("Lamp")
  @ApiModelProperty(value = "")
  public Lamp getLamp() {
    return lamp;
  }

  public void setLamp(Lamp lamp) {
    this.lamp = lamp;
  }

  public ComponentSettings feeder(Feeder feeder) {
    this.feeder = feeder;
    return this;
  }

  /**
   * Get feeder
   * @return feeder
   **/
  @JsonProperty("Feeder")
  @ApiModelProperty(value = "")
  public Feeder getFeeder() {
    return feeder;
  }

  public void setFeeder(Feeder feeder) {
    this.feeder = feeder;
  }

  public ComponentSettings pump(Pump pump) {
    this.pump = pump;
    return this;
  }

  /**
   * Get pump
   * @return pump
   **/
  @JsonProperty("Pump")
  @ApiModelProperty(value = "")
  public Pump getPump() {
    return pump;
  }

  public void setPump(Pump pump) {
    this.pump = pump;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentSettings componentSettings = (ComponentSettings) o;
    return Objects.equals(this.piId, componentSettings.piId) &&
        Objects.equals(this.timestamp, componentSettings.timestamp) &&
        Objects.equals(this.waterFlowSensor, componentSettings.waterFlowSensor) &&
        Objects.equals(this.lightSensor, componentSettings.lightSensor) &&
        Objects.equals(this.waterLevelSensor, componentSettings.waterLevelSensor) &&
        Objects.equals(this.thermometer, componentSettings.thermometer) &&
        Objects.equals(this.lamp, componentSettings.lamp) &&
        Objects.equals(this.feeder, componentSettings.feeder) &&
        Objects.equals(this.pump, componentSettings.pump);
  }

  @Override
  public int hashCode() {
    return Objects.hash(piId, timestamp, waterFlowSensor, lightSensor, waterLevelSensor, thermometer, lamp, feeder, pump);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentSettings {\n");
    
    sb.append("    piId: ").append(toIndentedString(piId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    waterFlowSensor: ").append(toIndentedString(waterFlowSensor)).append("\n");
    sb.append("    lightSensor: ").append(toIndentedString(lightSensor)).append("\n");
    sb.append("    waterLevelSensor: ").append(toIndentedString(waterLevelSensor)).append("\n");
    sb.append("    thermometer: ").append(toIndentedString(thermometer)).append("\n");
    sb.append("    lamp: ").append(toIndentedString(lamp)).append("\n");
    sb.append("    feeder: ").append(toIndentedString(feeder)).append("\n");
    sb.append("    pump: ").append(toIndentedString(pump)).append("\n");
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

