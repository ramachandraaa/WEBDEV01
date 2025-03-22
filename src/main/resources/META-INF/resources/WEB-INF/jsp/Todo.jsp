<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css
" rel="stylesheet">
<title>ToDos</title>
</head>

<body>
<div class ="container">
<h2 >Enter Todo details </h2>


<table class="table">
<thead>
<th>id</th>
<th>Discription</th>
<th>Target date</th>
<th>Is done?</th>

 </thead>
 <tbody>
<c:forEach items="${todoss}" var="todo">
<tr>
<td>${todo.id} </td>
<td>${todo.discription} </td>
<td>${todo.localdate} </td>
<td>${todo.done} </td>
</c:forEach>
</tr>
</tbody>
</table>
<a href="Add-todo" class="btn btn-success"> Add Todo</a>
</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
</html>