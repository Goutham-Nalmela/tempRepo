package com.radial.fraudmanagement;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Persons implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String id;
   private com.radial.fraudmanagement.Person person;

   private com.radial.fraudmanagement.AuditTrail auditTrail;

   public Persons()
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

   public com.radial.fraudmanagement.Person getPerson()
   {
      return this.person;
   }

   public void setPerson(com.radial.fraudmanagement.Person person)
   {
      this.person = person;
   }

   public com.radial.fraudmanagement.AuditTrail getAuditTrail()
   {
       if(null == this.auditTrail) {
           this.auditTrail = new com.radial.fraudmanagement.AuditTrail();
       }
      return this.auditTrail;
   }

   public void setAuditTrail(com.radial.fraudmanagement.AuditTrail auditTrail)
   {
      this.auditTrail = auditTrail;
   }

   public Persons(java.lang.String id, com.radial.fraudmanagement.Person person,
         com.radial.fraudmanagement.AuditTrail auditTrail)
   {
      this.id = id;
      this.person = person;
      this.auditTrail = auditTrail;
   }

}