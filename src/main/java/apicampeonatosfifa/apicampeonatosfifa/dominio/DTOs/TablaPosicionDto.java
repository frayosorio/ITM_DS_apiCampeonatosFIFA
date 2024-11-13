package apicampeonatosfifa.apicampeonatosfifa.dominio.DTOs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TablaPosicionDto {

    @Id
    private int id;
    private String pais;
    private int pJ;
    private int pG;
    private int pE;
    private int pP;
    private int gF;
    private int gC;
    private int Puntos;
    
    public TablaPosicionDto() {
    }


    public TablaPosicionDto(int id, String pais, int pJ, int pG, int pE, int pP, int gF, int gC, int puntos) {
        this.id = id;
        this.pais = pais;
        this.pJ = pJ;
        this.pG = pG;
        this.pE = pE;
        this.pP = pP;
        this.gF = gF;
        this.gC = gC;
        Puntos = puntos;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getpJ() {
        return pJ;
    }

    public void setpJ(int pJ) {
        this.pJ = pJ;
    }

    public int getpG() {
        return pG;
    }

    public void setpG(int pG) {
        this.pG = pG;
    }

    public int getpE() {
        return pE;
    }

    public void setpE(int pE) {
        this.pE = pE;
    }

    public int getpP() {
        return pP;
    }

    public void setpP(int pP) {
        this.pP = pP;
    }

    public int getgF() {
        return gF;
    }

    public void setgF(int gF) {
        this.gF = gF;
    }

    public int getgC() {
        return gC;
    }

    public void setgC(int gC) {
        this.gC = gC;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int puntos) {
        Puntos = puntos;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    
}
