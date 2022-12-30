<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get agent application</name>
   <tag></tag>
   <elementGuidId>aebed7a1-9d43-409b-98f6-45d61f73dc1c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot; {\n     \&quot;dataSource\&quot;: \&quot;ClusterSIT\&quot;,\n     \&quot;database\&quot;: \&quot;trrappdb\&quot;,\n     \&quot;collection\&quot;: \&quot;agentdrafts\&quot;,\n     \&quot;pipeline\&quot;:[\n{\n    \&quot;$match\&quot;:{\&quot;email\&quot;:\&quot;testernext6@outlook.com\&quot;}\n\n\n\n\n}\n  \n      ]\n\n     \n }\n\n      \n      &quot;,
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
      <webElementGuid>a6233d91-1d95-4fe7-b031-c66b67748079</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>api-key</name>
      <type>Main</type>
      <value>AKAFnW5WgyyOq3F3S2lVPcRhZr12qxZTTPjz0Llu1myg9jUSNjaVaGih51BZ8n60</value>
      <webElementGuid>deb7c0db-140e-414f-9f92-9cf570d8ec13</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://data.mongodb-api.com/app/data-nnnyp/endpoint/data/beta/action/aggregate</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.agentApplicationName</defaultValue>
      <description></description>
      <id>39f12ee3-7c05-43e2-81d1-33a0b86e8763</id>
      <masked>false</masked>
      <name>name</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.agentApplicationRenId</defaultValue>
      <description></description>
      <id>9060e25f-189d-49e6-8060-8df63db82896</id>
      <masked>false</masked>
      <name>renId</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.agentApplicationMobile</defaultValue>
      <description></description>
      <id>ac52337d-d739-433b-989e-7dfe59f27d49</id>
      <masked>false</masked>
      <name>mobile</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.agentApplicationEmail</defaultValue>
      <description></description>
      <id>b8484f2b-7d7a-497e-9311-47e123b5bbc2</id>
      <masked>false</masked>
      <name>email</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.agentApplicationPackage</defaultValue>
      <description></description>
      <id>44d56ae6-eddf-4766-a729-f90e3522846f</id>
      <masked>false</masked>
      <name>package</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.agentApplicationAppliedOn</defaultValue>
      <description></description>
      <id>54c033a2-7ab5-4d1b-876e-865415b3d78d</id>
      <masked>false</masked>
      <name>appliedOn</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.agentApplicationStatus</defaultValue>
      <description></description>
      <id>38bfbb33-5650-42e3-af36-0ee46d310b10</id>
      <masked>false</masked>
      <name>status</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.agentApplicationProcessedBy</defaultValue>
      <description></description>
      <id>f8f635a4-6c49-4173-b6f4-6e6c15db5f2c</id>
      <masked>false</masked>
      <name>processedBy</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.agentApplicationProcessedOn</defaultValue>
      <description></description>
      <id>12313c58-db63-4caa-82a4-51ddca608a3d</id>
      <masked>false</masked>
      <name>processedOn</name>
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
