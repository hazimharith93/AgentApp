<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>AdminURL</name>
   <tag></tag>
   <elementGuidId>4a49b797-a1d3-4ed1-a385-1d15bc5d0998</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;_id\&quot;:\&quot;636215f7a6d109004a5d88d7\&quot;,\n    \&quot;active\&quot;:true,\n    \&quot;banner\&quot;:\&quot;https://iprofstore.blob.core.windows.net/iklan/636215f7a6d109004a5d88d7/iklan.png\&quot;,\n    \&quot;campaignURL\&quot;:\&quot;${CURL}\&quot;,\n    \&quot;category\&quot;:\&quot;Mobile Banner\&quot;,\n    \&quot;created\&quot;:\&quot;2022-11-02T07:02:15.245Z\&quot;,\n    \&quot;type\&quot;:\&quot;Campaign\&quot;,\n    \&quot;sequence\&quot;:1\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>a52b2ac1-1180-4615-aff1-7e6f2a5fe43d</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://sit-host.nextsix.com/iklan/update</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.URL</defaultValue>
      <description></description>
      <id>1ec05dfb-5a50-4ba2-be33-209d16cd07d5</id>
      <masked>false</masked>
      <name>CURL</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
WS.verifyElementPropertyValue(response, 'campaignURL', &quot;&quot;)


</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
