<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Public agent dashboard</name>
   <tag></tag>
   <elementGuidId>95ce2c7c-605b-476f-8193-175bc83aae79</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n     \&quot;agentId\&quot;:\&quot;60e7d2b10b0ccb002e4a11a1\&quot;\n}&quot;,
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
      <webElementGuid>9fe454c4-22b9-4c59-a4f6-bdd8dcdafac7</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://sit-apps.nextsix.com/agents/dashboard</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.packageName</defaultValue>
      <description></description>
      <id>1e15d4cb-ae34-4353-b3d4-515e7c4aaefb</id>
      <masked>false</masked>
      <name>packageName</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.packageActiveListing</defaultValue>
      <description></description>
      <id>ecc78e1e-f600-44ad-8a7c-f601c94f50dd</id>
      <masked>false</masked>
      <name>activeListingAllowed</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.packageImageAllowed</defaultValue>
      <description></description>
      <id>b440df7f-9889-4cad-b43e-8fff554ce136</id>
      <masked>false</masked>
      <name>propertyImageAllowed</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.totalActiveProperty</defaultValue>
      <description></description>
      <id>220256d6-fd1c-4388-a353-4efed73ef96f</id>
      <masked>false</masked>
      <name>totalActiveProperty</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.totalInactiveProperty</defaultValue>
      <description></description>
      <id>da5cb603-6557-4a70-83a8-da7591613aaf</id>
      <masked>false</masked>
      <name>totalInactiveProperty</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.plottedAddress</defaultValue>
      <description></description>
      <id>d1d74b3d-ecaa-408b-9d85-f08b50f429ee</id>
      <masked>false</masked>
      <name>plottedAddress</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.totalMessage</defaultValue>
      <description></description>
      <id>16c1e0ce-90f0-4439-a75d-e32de0357e29</id>
      <masked>false</masked>
      <name>totalMessage</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.totalAppointment</defaultValue>
      <description></description>
      <id>a36d797e-647a-465b-9f90-afa8907793cb</id>
      <masked>false</masked>
      <name>totalAppointment</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.totalGuidance</defaultValue>
      <description></description>
      <id>50b84ad6-0cf7-4cc9-bc9f-2256961f77cf</id>
      <masked>false</masked>
      <name>totalGuidance</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
