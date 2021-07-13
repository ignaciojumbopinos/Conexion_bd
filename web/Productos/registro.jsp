<%-- 
    Document   : registro
    Created on : 12 jul. 2021, 17:39:27
    Author     : IDEAPAD 330
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link rel="stylesheet" href="../estilos2.css"/>
    </head>
    <body>
        <form class="formulario" action="PersonaCotroller?accion=insert" method="POST" autocomplete="off">
            <h1>Registro de usuarios</h1>
            <div class="contenedor">
                <div class="contenedor-input">
                    <label>Nombre</label>
                    <input id="nombre" type="text" name="nombre" > <br>
                </div>

                <div class="contenedor-input">
                    <label>Apellido</label>
                    <input id="apellido" type="text" name="apellido" > <br>
                </div>
                <div class="contenedor-input">
                    <label>Teléfono</label>
                    <input id="telefono" type="text" name="telefono" > <br>
                </div>
                <div class="contenedor-input">
                    <label>Usuario</label>
                    <input id="usuario" type="text" name="usuario" > <br>
                </div> 
                <div class="contenedor-input">
                    <label>Contraseña</label>
                    <input id="contraseña" type="text" name="contraseña" > <br>
                </div>

                <div class="contenedor-input">
                    <label>Correo electronico</label>
                    <input id="correoelectronico" type="text" name="correoelectronico" > <br>
                </div>

                

                <input type="submit" value="Registrarse" name="name" >
                <p>Al registrarte, Aceptas nuestras Condiciones de uso y Politica de privacidad</p>

                <p>¿Ya tienes cuenta? <a href="index.html">Iniciar sesión</a></p>
            </div>
        </form>
    </body>
</html>
