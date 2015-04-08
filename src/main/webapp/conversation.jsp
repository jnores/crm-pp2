<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Historial de conversaciones</title>
  <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
</head>

<body>
  <form action="ConversationController">
	<div><label>Búsqueda:</label><input type="text" name="Cliente"></div>
  </form>
  <br>
  <table>
    <thead>	
      <tr>
        <th>Tipo de Contacto</th>
        <th>Descripción</th>
        <th>Fecha y Hora</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${conversations}" var="conversacion">
        <tr>
          <td>${conversacion.tipoContacto}</td>
          <td>${conversacion.descripcion}</td>
          <td>${conversacion.fecha_Hora}</td> 
        </tr>    
      </c:forEach>
    </tbody>
  </table>	

	
	 
	
</body>
</html>