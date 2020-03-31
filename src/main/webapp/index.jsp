<%@page import="java.time.LocalDateTime" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<p><%= LocalDateTime.now().toString() %></p>
<% for(int i = 0; i < 10; i++){ %>
<h2>Hello World!</h2>
<% } %>
</body>
</html>
