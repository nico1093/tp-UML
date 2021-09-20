package poo2.unq.edu.liquidacion;

import poo2.unq.edu.empleado.Empleado;
import poo2.unq.edu.empresa.Empresa;

import java.util.Date;

public class Liquidacion {
    private String nombreEmp;
    private String direccion;
    private Date emision = new Date();
    private Empleado empleado;
    private Empresa emp;

    public Liquidacion(Empleado e, Empresa emp){
        this.nombreEmp = e.getNombre();
        this.direccion = e.getDireccion();
        this.empleado = e;
        this.emp = emp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmision(Date emision) {
        this.emision = emision;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setEmp(Empresa emp) {
        this.emp = emp;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getEmision() {
        return emision;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Empresa getEmp() {
        return emp;
    }

    public float retenciones(){
        return this.getEmpleado().retencionOS() + this.getEmpleado().aporteJubilacion();
    }

    public float sueldoBruto(){
        return this.getEmpleado().sueldoBruto();
    }

    public float sueldoNeto(){
        return this.getEmpleado().sueldoNeto();
    }
}
