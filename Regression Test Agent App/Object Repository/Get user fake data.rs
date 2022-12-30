<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get user fake data</name>
   <tag></tag>
   <elementGuidId>2e6986b4-d5bb-4009-b015-1de7ed43a15e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\&quot;city\&quot;:\&quot;Malaysia\&quot;,\&quot;path\&quot;:\&quot;/my-address\&quot;,\&quot;method\&quot;:\&quot;refresh\&quot;}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/plain</value>
      <webElementGuid>7a44cb4c-328d-4964-9613-faa76237f27e</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://www.meiguodizhi.com/api/v1/dz</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.fakename</defaultValue>
      <description></description>
      <id>6ca299e9-0133-4e14-a916-d2f3d921c893</id>
      <masked>false</masked>
      <name>fakename</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.fakephone</defaultValue>
      <description></description>
      <id>f92c05dd-7047-49d4-a49f-cb0404df8f6f</id>
      <masked>false</masked>
      <name>fakephone</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.fakeemail</defaultValue>
      <description></description>
      <id>49d7bd83-479b-4ae1-8679-01b5f1f74b5d</id>
      <masked>false</masked>
      <name>fakeemail</name>
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

WS.verifyElementPropertyValue(response, 'address.Full_Name', &quot;Olive King&quot;)
WS.verifyElementPropertyValue(response, 'address.Telephone', &quot;+60 11 1748 442&quot;)
WS.verifyElementPropertyValue(response, 'address.Temporary_mail',&quot;iundduwtgg@iubridge.com&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
