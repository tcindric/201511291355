package bpm_vvg_2015.procesiugovaranjaprikljucaka;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Zahtjev implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "zahtjev id")
   private java.lang.Integer zahtjevId;
   @org.kie.api.definition.type.Label(value = "datum predaje zahtjeva")
   private java.util.Date datumPredajeZahtjeva;
   @org.kie.api.definition.type.Label(value = "korisnik")
   private bpm_vvg_2015.procesiugovaranjaprikljucaka.Korisnik korisnik;
   @org.kie.api.definition.type.Label(value = "prikljucak")
   private bpm_vvg_2015.procesiugovaranjaprikljucaka.Prikljucak prikljucak;
   @org.kie.api.definition.type.Label(value = "troskovnik")
   private bpm_vvg_2015.procesiugovaranjaprikljucaka.Troskovnik troskovnik;
   @org.kie.api.definition.type.Label(value = "status zahtjeva")
   private bpm_vvg_2015.procesiugovaranjaprikljucaka.StatusZahtjeva statusZahtjeva;
   @org.kie.api.definition.type.Label(value = "dokumentacija")
   private bpm_vvg_2015.procesiugovaranjaprikljucaka.Dokumentacija dokumentacija;

   public Zahtjev()
   {
   }

   public java.lang.Integer getZahtjevId()
   {
      return this.zahtjevId;
   }

   public void setZahtjevId(java.lang.Integer zahtjevId)
   {
      this.zahtjevId = zahtjevId;
   }

   public java.util.Date getDatumPredajeZahtjeva()
   {
      return this.datumPredajeZahtjeva;
   }

   public void setDatumPredajeZahtjeva(java.util.Date datumPredajeZahtjeva)
   {
      this.datumPredajeZahtjeva = datumPredajeZahtjeva;
   }

   public bpm_vvg_2015.procesiugovaranjaprikljucaka.Korisnik getKorisnik()
   {
      return this.korisnik;
   }

   public void setKorisnik(
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Korisnik korisnik)
   {
      this.korisnik = korisnik;
   }

   public bpm_vvg_2015.procesiugovaranjaprikljucaka.Prikljucak getPrikljucak()
   {
      return this.prikljucak;
   }

   public void setPrikljucak(
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Prikljucak prikljucak)
   {
      this.prikljucak = prikljucak;
   }

   public bpm_vvg_2015.procesiugovaranjaprikljucaka.Troskovnik getTroskovnik()
   {
      return this.troskovnik;
   }

   public void setTroskovnik(
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Troskovnik troskovnik)
   {
      this.troskovnik = troskovnik;
   }

   public bpm_vvg_2015.procesiugovaranjaprikljucaka.StatusZahtjeva getStatusZahtjeva()
   {
      return this.statusZahtjeva;
   }

   public void setStatusZahtjeva(
         bpm_vvg_2015.procesiugovaranjaprikljucaka.StatusZahtjeva statusZahtjeva)
   {
      this.statusZahtjeva = statusZahtjeva;
   }

   public bpm_vvg_2015.procesiugovaranjaprikljucaka.Dokumentacija getDokumentacija()
   {
      return this.dokumentacija;
   }

   public void setDokumentacija(
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Dokumentacija dokumentacija)
   {
      this.dokumentacija = dokumentacija;
   }

   public Zahtjev(
         java.lang.Integer zahtjevId,
         java.util.Date datumPredajeZahtjeva,
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Korisnik korisnik,
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Prikljucak prikljucak,
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Troskovnik troskovnik,
         bpm_vvg_2015.procesiugovaranjaprikljucaka.StatusZahtjeva statusZahtjeva,
         bpm_vvg_2015.procesiugovaranjaprikljucaka.Dokumentacija dokumentacija)
   {
      this.zahtjevId = zahtjevId;
      this.datumPredajeZahtjeva = datumPredajeZahtjeva;
      this.korisnik = korisnik;
      this.prikljucak = prikljucak;
      this.troskovnik = troskovnik;
      this.statusZahtjeva = statusZahtjeva;
      this.dokumentacija = dokumentacija;
   }

}