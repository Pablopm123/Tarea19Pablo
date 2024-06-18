/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.ProyectoInterfaces;

/**
 *
 * @author Usuario
 */
public class Informe_Empleado extends Empleado {
    private int cant_hijos;
    private String hacienda;
    private String rentencion;
    
    public Informe_Empleado(Object ParametroPablo, javax.naming.event.ObjectChangeListener PruebaPablo) {//constructor vacio
        super();
        cant_hijos=0;
        hacienda="";
        rentencion="";
    }
    //constructor
    public Informe_Empleado(int cant_hijos, String hacienda, String retencion,String nombre, String apellido, String dni, String direccion, int edad, String formacionAcademica, int añosExperiencia, int horas_trabajadas, int pagoPorHora) {
        super(nombre,  apellido,  dni, direccion,  edad,  formacionAcademica,  añosExperiencia,  horas_trabajadas,  pagoPorHora);
        this.cant_hijos = cant_hijos;
        this.hacienda = hacienda;
        this.rentencion = retencion;
    }
    
     //Getters y setters para los campos adicionales
    public int getCant_hijos() {
        return cant_hijos;
    }

    public void setCant_hijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }

    public String getHacienda() {
        return hacienda;
    }

    public void setHacienda(String hacienda) {
        this.hacienda = hacienda;
    }

    public String getRetencion() {
        return rentencion;
    }

    public void setRetencion(String retencion) {
        this.rentencion = retencion;
    }

    @Override
    public int cant_horas_extras(){
    int cant_horas_extras =0;
        if (super.getHoras_trabajadas()>40){
         cant_horas_extras = super.getHoras_trabajadas()-40;
      }
     return  cant_horas_extras;
    }

    @Override
    public int horasExtras(){
    int horasEx=0;
     horasEx = (super.getPagoPorHora()*2)*cant_horas_extras();
    return horasEx;
}

    @Override
    public double sueldoBruto(){
     int SueldoB=  super.getHoras_trabajadas()*super.getPagoPorHora();
  return SueldoB;
}

    @Override
    public double sueldoNeto(){
    double SueldoN= sueldoBruto()+horasExtras();
   return SueldoN;
}
    
    
    public double  pension() {//selecciona si tendra retencion o hacienda
        if (rentencion.equals("rentencion 2.5%")) {
            setRetencion("");
            return sueldoBruto()* 0.025;
        } else if (hacienda.equals("hacienda 1.5%")) {
            setHacienda("");
            return sueldoBruto() * 0.015;
        } else {
            return 0;
        }    
    }
    
    
    public double bonoHijos() {//bono por la cantidad de hijos
        if (cant_hijos >= 1 && cant_hijos <= 2) {
            return sueldoBruto() * 0.032; 
        } else if (cant_hijos <= 4) {
            return sueldoBruto() * 0.05; 
        } else if (cant_hijos > 4) {
            return sueldoBruto() * 0.075; 
        } else {
            return 0;
        }
    }
       
    @Override
    public String imprimirReciboPago() {//imprime el recibo 
return "INFORME DEL TRABAJADOR" + "\n" +
"---------------------" + "\n" +
" "+ "\n" +
"Datos del Empleado" + "\n" +
"Nombres: " + super.getNombre()+"\n" +
"Apellidos: " + super.getApellido()+"\n" +
"DNI: " + super.getDni()+ "\n" +
"Edad: " + super.getEdad()+"\n" +
"Dirección: " + super.getDireccion()+"\n" +
"Formación Academica: " + super.getFormacionAcademica()+ "\n" +
"Años de experiencia: " + super.getAñosExperiencia()+ "\n" + " " + "\n" +
"Resumen de Pago" + "\n" + " "+ "\n" +
"Sueldo Bruto: S/ " + sueldoBruto()+ "\n" +
"Horas Extras: " + cant_horas_extras() + "\n" +
"Pago por horas Extras: S/ " + horasExtras() + "\n" +
"Pension: S/ " + pension()+ "\n" +
"Bono por hijos: S/ " + bonoHijos()+ "\n" + "Sueldo Neto: S/ " + sueldoNeto();
}
    
    
}
