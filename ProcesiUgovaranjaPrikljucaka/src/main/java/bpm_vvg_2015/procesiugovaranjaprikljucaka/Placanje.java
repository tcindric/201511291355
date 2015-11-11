package bpm_vvg_2015.procesiugovaranjaprikljucaka;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Placanje implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("placanje id")
   private java.lang.Integer placanjeId;
   @org.kie.api.definition.type.Label("iznos placanja")
   private java.lang.String iznosPlacanja;
   @org.kie.api.definition.type.Label("datum placanja")
   private java.util.Date datumPlacanja;

   @org.kie.api.definition.type.Label(value = "Datum potpisa")
   private java.util.Date datumPotpisa;

   public Placanje()
   {
   }

   public java.lang.Integer getPlacanjeId()
   {
      return this.placanjeId;
   }

   public void setPlacanjeId(java.lang.Integer placanjeId)
   {
      this.placanjeId = placanjeId;
   }

   public java.lang.String getIznosPlacanja()
   {
      return this.iznosPlacanja;
   }

   public void setIznosPlacanja(java.lang.String iznosPlacanja)
   {
      this.iznosPlacanja = iznosPlacanja;
   }

   public java.util.Date getDatumPlacanja()
   {
      return this.datumPlacanja;
   }

   public void setDatumPlacanja(java.util.Date datumPlacanja)
   {
      this.datumPlacanja = datumPlacanja;
   }

   public java.util.Date getDatumPotpisa()
   {
      return this.datumPotpisa;
   }

   public void setDatumPotpisa(java.util.Date datumPotpisa)
   {
      this.datumPotpisa = datumPotpisa;
   }

   public Placanje(java.lang.Integer placanjeId, java.lang.String iznosPlacanja,
         java.util.Date datumPlacanja, java.util.Date datumPotpisa)
   {
      this.placanjeId = placanjeId;
      this.iznosPlacanja = iznosPlacanja;
      this.datumPlacanja = datumPlacanja;
      this.datumPotpisa = datumPotpisa;
   }

}