package com.radial.fraudmanagement;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CountryName implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String code;
   private java.lang.String name;

   public CountryName()
   {
   }

   public java.lang.String getCode()
   {
      return this.code;
   }

   public void setCode(java.lang.String code)
   {
      this.code = code;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public CountryName(java.lang.String code, java.lang.String name)
   {
      this.code = code;
      this.name = name;
   }

}