package poo2.unq.edu.empleado;

import poo2.unq.edu.empresa.Empresa;

import java.util.Date;

public class Permanente extends Empleado{
    private int cantHijos;
    private int antiguedad;


    public Permanente(String empleado, String dir, Date nac, String estC, float sueldo, Empresa emp, int cantH, int ant) {
        super(empleado, dir, nac, estC, sueldo, emp);
        this.cantHijos = cantH;
        this.antiguedad = ant;
    }

    @Override
    public float sueldoNeto() {
        return this.sueldoBruto() - this.aporteJubilacion() - this.retencionOS();
    }

    @Override
    public float sueldoBruto() {
        return super.getSueldoBasico() + this.asignacionHijo() + this.asignacionConyu() + this.antiguedad();
    }


    public int getCantHijos() {
        return cantHijos;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public float asignacionConyu(){
        return 100;
    }

    public float asignacionHijo(){
        return 150 * this.getCantHijos();
    }

    public float antiguedad(){
        return 50 * this.getAntiguedad();
    }

    @Override
    public float retencionOS(){
        return (float) (this.sueldoBruto() * 0.9) - (20 * this.getCantHijos());
    }

    @Override
    public float aporteJubilacion(){
        return (float) (this.sueldoBruto() * 0.85);
    }
}
