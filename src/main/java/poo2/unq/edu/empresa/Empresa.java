package poo2.unq.edu.empresa;

import poo2.unq.edu.empleado.Empleado;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private int cuit;
    private List<Empleado> empleados = new ArrayList<Empleado>();

    public Empresa(String nombre, int cuit, List<Empleado> empleados){
        this.nombre = nombre;
        this.cuit = cuit;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCuit() {
        return cuit;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void addEmpleados(Empleado empleado) {
        this.getEmpleados().add(empleado);
    }

    public float montoBrutos(){
        float result = 0;
        for (Empleado e : empleados){
            result += e.sueldoBruto();
        }
        return result;
    }

    public float montoNetos(){
        float result = 0;
        for (Empleado e : empleados){
            result += e.sueldoNeto();
        }
        return result;
    }

    public float montoAportes(){
        float result = 0;
        for (Empleado e : empleados){
            result += e.aporteJubilacion() + e.retencionOS();
        }
        return result;
    }

}
