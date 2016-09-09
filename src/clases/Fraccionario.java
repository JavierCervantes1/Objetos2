/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author rmorales1
 */
public class Fraccionario {
   private int numerador;
   private int denominador;
   private int parte_entera;
   
   public Fraccionario(int numerador, int denominador, int parte_entera) throws DenominadorCeroException{
       this.numerador=numerador;
       this.denominador=denominador;
       this.parte_entera=parte_entera;
       if(denominador == 0){
           throw new DenominadorCeroException();
       }
   }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getParte_entera() {
        return parte_entera;
    }

    public void setParte_entera(int parte_entera) {
        this.parte_entera = parte_entera;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public Fraccionario suma(Fraccionario f2) throws DenominadorCeroException{       
        int num, den;
        Fraccionario f;
        int numf,denf,pe,connum1,conden1,connum2,conden2;
        connum1 = (this.parte_entera * this.denominador) + this.numerador;
        conden1 = this.denominador;
        connum2 = (f2.parte_entera * f2.denominador) + f2.numerador;
        conden2 = f2.denominador;
        numf    = (connum1 * conden2)+(conden1 * connum2);
        denf    = conden1 * conden2;
        pe      = numf / denf;
        num     = numf % denf;
        den     = denf;
        f       = new Fraccionario(pe, num, den);
        return f;
     }
    
     public Fraccionario resta(Fraccionario f2) throws DenominadorCeroException{
        int num, den;
        Fraccionario f;
        int numf,denf,pe,connum1,conden1,connum2,conden2;
        connum1 = (this.parte_entera * this.denominador) + this.numerador;
        conden1 = this.denominador;
        connum2 = (f2.parte_entera * f2.denominador) + f2.numerador;
        conden2 = f2.denominador;
        numf    = (connum1 * conden2) - (conden1 * connum2);
        denf    = conden1 * conden2;
        pe      = numf / denf;
        num     = numf % denf;
        den     = denf;
        f       = new Fraccionario(pe, num, den);
        return f;
     }
     
     public Fraccionario multiplicacion(Fraccionario f2) throws DenominadorCeroException{
        int num, den;
        Fraccionario f;
        int numf,denf,pe,connum1,conden1,connum2,conden2;
        connum1 = (this.parte_entera * this.denominador) + this.numerador;
        conden1 = this.denominador;
        connum2 = (f2.parte_entera * f2.denominador) + f2.numerador;
        conden2 = f2.denominador;
        numf    = (connum1 * connum2);
        denf    = conden1 * conden2;
        pe      = numf / denf;
        num     = numf % denf;
        den     = denf;
        f       = new Fraccionario(pe, num, den);
        return f;
     }
     public Fraccionario division(Fraccionario f2) throws DenominadorCeroException{
        int num, den;
        Fraccionario f;
        int numf,denf,pe,connum1,conden1,connum2,conden2;
        connum1 = (this.parte_entera * this.denominador) + this.numerador;
        conden1 = this.denominador;
        connum2 = (f2.parte_entera * f2.denominador) + f2.numerador;
        conden2 = f2.denominador;
        numf    = (connum1 * conden2);
        denf    = conden1 * connum2;
        pe      = numf / denf;
        num     = numf % denf;
        den     = denf;
        f       = new Fraccionario(pe, num, den);
        return f;
     }
}
