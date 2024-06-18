/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.ProyectoInterfaces;

/**
 *
 * @author Usuario
 */
public class LoginPablo {
    
public String logging_usuario_pablo(String usuario, String password)//metodo implementa contraseñas y usuarios
{
String mensaje;
if (usuario.equals("Admin")&& password.equals("1234"))
mensaje = "Bienvenido Admin!";
else if ((usuario.equals("Pablo")&& password.equals("1234")))
mensaje = "Bienvenido Pablo!";
else
mensaje = "El usuario no existe";
return mensaje;
}
}

    
    

