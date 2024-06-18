/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.ProyectoInterfaces;

/**
 *
 * @author Usuario
 */
public class Empleado_Recibo  extends Empleado{
    
private String Recibo;

public Empleado_Recibo( ){//constructor vacio
        super();
        this.Recibo = "";
    }

//constructor
public Empleado_Recibo(String recibo,String nombre, String apellido, String dni, String direccion, int edad, String formacionAcademica, int añosExperiencia, int horas_trabajadas, int pagoPorHora) {
        super(nombre,  apellido,  dni, direccion,  edad,  formacionAcademica,  añosExperiencia,  horas_trabajadas,  pagoPorHora);
        this.Recibo = recibo;
    }

//Getters y Setters Recibo
 public String getRecibo() {
        return Recibo;
    }
 

    public void setRecibo(String recibo) {
        this.Recibo = recibo;
    }

@Override
public int cant_horas_extras(){//calcula la cantidad de horas extra
    int cant_horas_extras =0;
        if (super.getHoras_trabajadas()>40){
         cant_horas_extras = super.getHoras_trabajadas()-40;
      }
     return  cant_horas_extras;
    }

@Override
public int horasExtras(){//calcula el pago por horas extra
    int horasEx=0;
     horasEx = (super.getPagoPorHora()*2)*cant_horas_extras();
    return horasEx;
}

@Override
public double sueldoBruto(){//calcula el sueldo bruto
     int SueldoB=  super.getHoras_trabajadas()*super.getPagoPorHora();
  return SueldoB;
}

@Override
public double sueldoNeto(){//calcula el sueldo neto
    double SueldoN= sueldoBruto()+horasExtras();
   return SueldoN;
}


@Override
public String imprimirReciboPago() {//imprime los datos
return "RECIBO DEL TRABAJADOR" + "\n"
+ "----------------------" + "\n"
+ " " + "\n"
+ "Datos del Empleado" + "\n"
+ "Nombres: " + super.getNombre() + "\n"
+ "Apellidos: " + super.getApellido() + "\n"
+ "DNI: " + super.getDni() + "\n"
+ "Edad: " + super.getEdad() + "\n"
+ "Dirección: " + super.getDireccion() + "\n"
+ "Formación Academica: " + super.getFormacionAcademica() + "\n"
+ "Años de experiencia: " + super.getAñosExperiencia() + "\n"
+ " " + "\n"
+ "Resumen de Pago " +this.Recibo+ "\n"
+ "Sueldo Bruto: S/ " + sueldoBruto() + "\n"
+ "Horas Extras: " + cant_horas_extras() + "\n"
+ "Pago por horas Extras: S/ " + horasExtras() + "\n"
+ "Sueldo Neto: S/ " + sueldoNeto();
}

}


