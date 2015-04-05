<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Historial de conversaciones</title>

</head>

<form action="ConversationController">
	<div>Búsqueda:<input type="text" style="width: 50%" name="busquedaCliente"></div>
	<br>
	
	<TABLE BORDER="1">
	
	<TR>
                <TH>Tipo de Contacto</TH>
                <TH>Descripción</TH>
                <TH>Fecha y Hora</TH>

            </TR>
	
	<c:forEach items="${conversaciones}" var="conversacion">
        <tr>
            <td>${conversacion.tipoContacto}</td>
            <td>${conversacion.descripcion}</td>
            <td>${conversacion.fecha_Hora}</td>
        </tr>
        
    </c:forEach>
	</TABLE>	
<body>	
	
	

</form>
	
	 
	
</body>
</html>