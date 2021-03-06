package com.radial.fraudmanagement;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FraudRequest implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String id;

   private com.radial.fraudmanagement.Order order;

   private com.radial.fraudmanagement.IPAddress ipAddress;

   public FraudRequest()
   {
   }

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public com.radial.fraudmanagement.Order getOrder()
   {
       if(null == this.order) {
           this.order = new Order();
       }
      return this.order;
   }

   public void setOrder(com.radial.fraudmanagement.Order order)
   {
      this.order = order;
   }

   public com.radial.fraudmanagement.IPAddress getIpAddress()
   {
       if(null == this.ipAddress) {
           this.ipAddress = new IPAddress();
       }
      return this.ipAddress;
   }

   public void setIpAddress(com.radial.fraudmanagement.IPAddress ipAddress)
   {
      this.ipAddress = ipAddress;
   }

   public FraudRequest(java.lang.String id,
         com.radial.fraudmanagement.Order order,
         com.radial.fraudmanagement.IPAddress ipAddress)
   {
      this.id = id;
      this.order = order;
      this.ipAddress = ipAddress;
   }

}