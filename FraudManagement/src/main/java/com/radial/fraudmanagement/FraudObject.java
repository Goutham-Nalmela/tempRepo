package com.radial.fraudmanagement;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FraudObject implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String billingCountry;
   private java.lang.String ipCountry;
   private java.lang.Float dollarAmount;
   private java.lang.String billingName;
   public Fraud fraud;

   public FraudObject()
   {
   }
   
   public FraudObject(Fraud fraud)
   {
       this.fraud=fraud;
   }

   public java.lang.String getBillingCountry()
   {
       System.out.println("In getBillingCountry:::");
       System.out.println("In getBillingCountry:::" + fraud);
       if(null != fraud && null != fraud.getFraudRequest() && null != fraud.getFraudRequest().getOrder() &&
       null != fraud.getFraudRequest().getOrder().getTotalCost() && null != fraud.getFraudRequest().getOrder().getTotalCost().getAddress() &&
       null != fraud.getFraudRequest().getOrder().getTotalCost().getAddress().getCountryName()) {
           this.billingCountry=fraud.getFraudRequest().getOrder().getTotalCost().getAddress().getCountryName().getCode();
       }
      return this.billingCountry;
   }

   public void setBillingCountry(java.lang.String billingCountry)
   {
      this.billingCountry = billingCountry;
   }

   public java.lang.String getIpCountry()
   {
       if(null != fraud && null != fraud.getFraudRequest() && null != fraud.getFraudRequest().getIpAddress() &&
       null != fraud.getFraudRequest().getIpAddress().getCountryName() && null != fraud.getFraudRequest().getIpAddress().getCountryName().getCode()) {
          this.ipCountry = fraud.getFraudRequest().getIpAddress().getCountryName().getCode();
       }
      return this.ipCountry;
   }

   public void setIpCountry(java.lang.String ipCountry)
   {
      this.ipCountry = ipCountry;
   }

   public java.lang.Float getDollarAmount()
   {
       if(null != fraud && null != fraud.getFraudRequest() && null != fraud.getFraudRequest().getOrder() &&
       null != fraud.getFraudRequest().getOrder().getTotalCost() &&null != fraud.getFraudRequest().getOrder().getTotalCost().getCostTotals() ) {
           this.dollarAmount = fraud.getFraudRequest().getOrder().getTotalCost().getCostTotals().getAmountAfterTax();
       }
      return this.dollarAmount;
   }

   public void setDollarAmount(java.lang.Float dollarAmount)
   {
      this.dollarAmount = dollarAmount;
   }

   public java.lang.String getBillingName()
   {
       if(null != fraud && null != fraud.getFraudRequest() && null != fraud.getFraudRequest().getOrder() &&
       null != fraud.getFraudRequest().getOrder().getTotalCost().getPersonName().getGivenName() && 
       null != fraud.getFraudRequest().getOrder().getTotalCost().getPersonName().getSurname()) {
           this.billingName = fraud.getFraudRequest().getOrder().getTotalCost().getPersonName().getGivenName() + fraud.getFraudRequest().getOrder().getTotalCost().getPersonName().getSurname();
       }
      return this.billingName;
   }

   public void setBillingName(java.lang.String billingName)
   {
      this.billingName = billingName;
   }

   public FraudObject(java.lang.String billingCountry,
         java.lang.String ipCountry, java.lang.Float dollarAmount,
         java.lang.String billingName)
   {
      this.billingCountry = billingCountry;
      this.ipCountry = ipCountry;
      this.dollarAmount = dollarAmount;
      this.billingName = billingName;
   }

}