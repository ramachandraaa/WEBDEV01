<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>MY First HTML Page-ToDos</title>
</head>

<body>
<div>Welcome ${name }</div>
<hr>

<table>
<thead>
<th>id</th>
<th>Discription</th>
<th>Target date</th>
<th>Is done?</th>

 </thead>
 <tbody>
<c:forEach items="${todos}" var="todo">
<tr>
<td>${todo.id} </td>
<td>${todo.discription} </td>
<td>${todo.localdate} </td>
<td>${todo.done} </td>
</c:forEach>
</tr>
</tbody>
</table>
</body>
</html>