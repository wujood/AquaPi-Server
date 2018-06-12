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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-06-12T17:16:07.145Z")
public class ComponentSettings   {
  @JsonProperty("piid")
  private String piid = null;

  @JsonProperty("timestamp")
  private Date timestamp = null;

  @JsonProperty("waterflowsensor")
  private WaterFlowSensor waterflowsensor = null;

  @JsonProperty("lightsensor")
  private LightSensor lightsensor = null;

  @JsonProperty("waterlevelsensor")
  private WaterLevelSensor waterlevelsensor = null;

  @JsonProperty("waterthermometer")
  private Thermometer waterthermometer = null;

  @JsonProperty("airthermometer")
  private Thermometer airthermometer = null;

  @JsonProperty("lamp")
  private Lamp lamp = null;

  @JsonProperty("feeder")
  private Feeder feeder = null;

  @JsonProperty("pump")
  private Pump pump = null;

  public ComponentSettings piid(String piid) {
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

  public ComponentSettings timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  @JsonProperty("timestamp")
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "")
  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public ComponentSettings waterflowsensor(WaterFlowSensor waterflowsensor) {
    this.waterflowsensor = waterflowsensor;
    return this;
  }

  /**
   * Get waterflowsensor
   * @return waterflowsensor
   **/
  @JsonProperty("waterflowsensor")
  @ApiModelProperty(value = "")
  public WaterFlowSensor getWaterflowsensor() {
    return waterflowsensor;
  }

  public void setWaterflowsensor(WaterFlowSensor waterflowsensor) {
    this.waterflowsensor = waterflowsensor;
  }

  public ComponentSettings lightsensor(LightSensor lightsensor) {
    this.lightsensor = lightsensor;
    return this;
  }

  /**
   * Get lightsensor
   * @return lightsensor
   **/
  @JsonProperty("lightsensor")
  @ApiModelProperty(value = "")
  public LightSensor getLightsensor() {
    return lightsensor;
  }

  public void setLightsensor(LightSensor lightsensor) {
    this.lightsensor = lightsensor;
  }

  public ComponentSettings waterlevelsensor(WaterLevelSensor waterlevelsensor) {
    this.waterlevelsensor = waterlevelsensor;
    return this;
  }

  /**
   * Get waterlevelsensor
   * @return waterlevelsensor
   **/
  @JsonProperty("waterlevelsensor")
  @ApiModelProperty(value = "")
  public WaterLevelSensor getWaterlevelsensor() {
    return waterlevelsensor;
  }

  public void setWaterlevelsensor(WaterLevelSensor waterlevelsensor) {
    this.waterlevelsensor = waterlevelsensor;
  }

  public ComponentSettings waterthermometer(Thermometer waterthermometer) {
    this.waterthermometer = waterthermometer;
    return this;
  }

  /**
   * Get waterthermometer
   * @return waterthermometer
   **/
  @JsonProperty("waterthermometer")
  @ApiModelProperty(value = "")
  public Thermometer getWaterthermometer() {
    return waterthermometer;
  }

  public void setWaterthermometer(Thermometer waterthermometer) {
    this.waterthermometer = waterthermometer;
  }

  public ComponentSettings airthermometer(Thermometer airthermometer) {
    this.airthermometer = airthermometer;
    return this;
  }

  /**
   * Get airthermometer
   * @return airthermometer
   **/
  @JsonProperty("airthermometer")
  @ApiModelProperty(value = "")
  public Thermometer getAirthermometer() {
    return airthermometer;
  }

  public void setAirthermometer(Thermometer airthermometer) {
    this.airthermometer = airthermometer;
  }

  public ComponentSettings lamp(Lamp lamp) {
    this.lamp = lamp;
    return this;
  }

  /**
   * Get lamp
   * @return lamp
   **/
  @JsonProperty("lamp")
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
  @JsonProperty("feeder")
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
  @JsonProperty("pump")
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
    return Objects.equals(this.piid, componentSettings.piid) &&
        Objects.equals(this.timestamp, componentSettings.timestamp) &&
        Objects.equals(this.waterflowsensor, componentSettings.waterflowsensor) &&
        Objects.equals(this.lightsensor, componentSettings.lightsensor) &&
        Objects.equals(this.waterlevelsensor, componentSettings.waterlevelsensor) &&
        Objects.equals(this.waterthermometer, componentSettings.waterthermometer) &&
        Objects.equals(this.airthermometer, componentSettings.airthermometer) &&
        Objects.equals(this.lamp, componentSettings.lamp) &&
        Objects.equals(this.feeder, componentSettings.feeder) &&
        Objects.equals(this.pump, componentSettings.pump);
  }

  @Override
  public int hashCode() {
    return Objects.hash(piid, timestamp, waterflowsensor, lightsensor, waterlevelsensor, waterthermometer, airthermometer, lamp, feeder, pump);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentSettings {\n");
    
    sb.append("    piid: ").append(toIndentedString(piid)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    waterflowsensor: ").append(toIndentedString(waterflowsensor)).append("\n");
    sb.append("    lightsensor: ").append(toIndentedString(lightsensor)).append("\n");
    sb.append("    waterlevelsensor: ").append(toIndentedString(waterlevelsensor)).append("\n");
    sb.append("    waterthermometer: ").append(toIndentedString(waterthermometer)).append("\n");
    sb.append("    airthermometer: ").append(toIndentedString(airthermometer)).append("\n");
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

