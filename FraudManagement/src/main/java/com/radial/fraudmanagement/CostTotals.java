package com.radial.fraudmanagement;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CostTotals implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String currencyCode;
   private float amountAfterTax;

   public CostTotals()
   {
   }

   public java.lang.String getCurrencyCode()
   {
      return this.currencyCode;
   }

   public void setCurrencyCode(java.lang.String currencyCode)
   {
      this.currencyCode = currencyCode;
   }

   public float getAmountAfterTax()
   {
      return this.amountAfterTax;
   }

   public void setAmountAfterTax(float amountAfterTax)
   {
      this.amountAfterTax = amountAfterTax;
   }

   public CostTotals(java.lang.String currencyCode, float amountAfterTax)
   {
      this.currencyCode = currencyCode;
      this.amountAfterTax = amountAfterTax;
   }

}