package poo2.unq.edu.empleado;

import poo2.unq.edu.empresa.Empresa;

import java.util.Date;

public class Temporal extends Empleado{
    private int horasExtras;
    private Date fechaDesignacion;

    public Temporal(String empleado, String dir, Date nac, String estC, float sueldo, Empresa emp, Date d, int hs) {
        super(empleado, dir, nac, estC, sueldo, emp);
        this.fechaDesignacion = d;
        this.horasExtras = hs;
    }

    @Override
    public float sueldoNeto() {
        return 0;
    }

    @Override
    public float sueldoBruto() {
        return 0;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void setFechaDesignacion(Date fechaDesignacion) {
        this.fechaDesignacion = fechaDesignacion;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public Date getFechaDesignacion() {
        return fechaDesignacion;
    }

    public float reintegroHorasExtras(){
        return this.getHorasExtras() * 40;
    }

    @Override
    public float aporteJubilacion(){
        return (float) ((this.sueldoBruto() * 0.9) + (this.getHorasExtras() * 5));
    }

    @Override
    public float retencionOS() {
        Date actual = new Date();
        return actual.getYear() - this.getFechaDesignacion().getYear()>50 ?
                (float) (this.sueldoBruto() * 0.9) + 25 :
                (float) (this.sueldoBruto() * 0.9);
    }
}
