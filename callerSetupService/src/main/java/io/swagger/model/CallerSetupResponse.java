package io.swagger.model;

import io.swagger.model.PolicyLst;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
@XmlRootElement(name = "callerSetupResponse")
public class CallerSetupResponse  {
  
  @ApiModelProperty(value = "")
  private String status = null;

  @ApiModelProperty(value = "")
  private String policies = null;

  @ApiModelProperty(value = "")
  private List<PolicyLst> policyLst = null;

  @ApiModelProperty(value = "")
  private String finalMessage = null;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CallerSetupResponse status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get policies
   * @return policies
  **/
  @JsonProperty("policies")
  public String getPolicies() {
    return policies;
  }

  public void setPolicies(String policies) {
    this.policies = policies;
  }

  public CallerSetupResponse policies(String policies) {
    this.policies = policies;
    return this;
  }

 /**
   * Get policyLst
   * @return policyLst
  **/
  @JsonProperty("policyLst")
  public List<PolicyLst> getPolicyLst() {
    return policyLst;
  }

  public void setPolicyLst(List<PolicyLst> policyLst) {
    this.policyLst = policyLst;
  }

  public CallerSetupResponse policyLst(List<PolicyLst> policyLst) {
    this.policyLst = policyLst;
    return this;
  }

  public CallerSetupResponse addPolicyLstItem(PolicyLst policyLstItem) {
    this.policyLst.add(policyLstItem);
    return this;
  }

 /**
   * Get finalMessage
   * @return finalMessage
  **/
  @JsonProperty("finalMessage")
  public String getFinalMessage() {
    return finalMessage;
  }

  public void setFinalMessage(String finalMessage) {
    this.finalMessage = finalMessage;
  }

  public CallerSetupResponse finalMessage(String finalMessage) {
    this.finalMessage = finalMessage;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallerSetupResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    policyLst: ").append(toIndentedString(policyLst)).append("\n");
    sb.append("    finalMessage: ").append(toIndentedString(finalMessage)).append("\n");
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

