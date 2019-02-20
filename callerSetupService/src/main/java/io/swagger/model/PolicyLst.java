package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PolicyLst  {
  
  @ApiModelProperty(value = "")
  private String policyNo = null;

  @ApiModelProperty(value = "")
  private String dob = null;
 /**
   * Get policyNo
   * @return policyNo
  **/
  @JsonProperty("policyNo")
  public String getPolicyNo() {
    return policyNo;
  }

  public void setPolicyNo(String policyNo) {
    this.policyNo = policyNo;
  }

  public PolicyLst policyNo(String policyNo) {
    this.policyNo = policyNo;
    return this;
  }

 /**
   * Get dob
   * @return dob
  **/
  @JsonProperty("dob")
  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public PolicyLst dob(String dob) {
    this.dob = dob;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("  {\n");
    
    sb.append("    policyNo: ").append(toIndentedString(policyNo)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
  sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

