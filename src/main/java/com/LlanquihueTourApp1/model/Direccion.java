package com.LlanquihueTourApp1.model;

public class Direccion {
        private String calle;
    private int numero;
    private String comuna; 
    private String ciudad; 
    private String region;

    /**
     * Se crea el Constructor de la clase Direccion.
     * 
     * @param calle Es el nombre de la calle 
     * @param numero Se refiere al numero de casa 
     * @param comuna Es la comuna en la que se ubica la calle 
     * @param ciudad Hace referencia a la ciudad donde se ubica
     * @param region Es la región a la que pertenece
     */
    
    public Direccion(String calle, int numero, String comuna, String ciudad, String region) {
        this.calle = calle;
        this.numero = numero;
        this.comuna = comuna;
        this.ciudad = ciudad;
        this.region = region;
    }
    /**
     * Muestra la dirección completa de una persona
     * @return Dirección formateada como texto, de esta forma se hace visible.
     */
    
    @Override
    public String toString(){
        String info = calle + "# " + numero + ", " + comuna +", " + ciudad + ", Region: " + region;
        return info;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
}

