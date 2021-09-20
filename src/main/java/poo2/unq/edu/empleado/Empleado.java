package poo2.unq.edu.empleado;

import poo2.unq.edu.empresa.Empresa;

import java.util.Date;

public abstract class Empleado {
    private String empleado;
    private String direccion;
    private Date nacimiento;
    private String estadoCivil;
    private float sueldoBasico;
    private Empresa empresa;

    public Empleado(String empleado, String dir, Date nac, String estC, float sueldo, Empresa emp){
        this.empleado = empleado;
        this.direccion = dir;
        this.nacimiento = nac;
        this.estadoCivil = estC;
        this.sueldoBasico = sueldo;
        this.empresa = emp;
        emp.addEmpleados(this);
    }
    public String getNombre() {
        return empleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public abstract float aporteJubilacion();
    public abstract float retencionOS();
    public abstract float sueldoNeto();
    public abstract float sueldoBruto();

    public void setNombre(String empleado) {
        this.empleado = empleado;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
