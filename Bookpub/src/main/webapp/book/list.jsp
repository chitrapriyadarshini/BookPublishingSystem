<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Books</title>
</head>
<style>
body {background-color: Moccasin; text-align: center}
h2{color: MidnightBlue; text-align: center}
th{color: MidnightBlue; text-align: center}
</style>
<body>
	<h2>Welcome to book Management - List of Books Available</h2>
	<form action="../orderItems/addToCart" method="post">
					<input type="hidden" name="book_id" value="${SELECTED_BOOK.id}" />
					<table class="table table-bordered" border="1">
		<tr>
		    <th>ISBN</th>
			<th>Title</th>
			<th>Author</th>
			<th>PublishDate</th>
			<th>Content</th>
			<th>Price</th>
			<th>Status</th>
			<th>View</th>
		</tr>
		<c:forEach items="${SELECTED_BOOK}" var="book">
		<tr>

							<td>${SELECTED_BOOK.isbn}</td>

							<td>Rs. ${SELECTED_BOOK.price}</td>
							<td><input type="number" name="qty" min="1" value="1"
								required /></td>

							<c:if test="${!empty LOGGED_IN_USER}">
								<td><button type="submit" class="btn btn-primary">Add
										To Cart</button></td>
							</c:if>
							<c:if test="${empty LOGGED_IN_USER}">
								<td><button type="submit" class="btn btn-primary" disabled>Add
										To Cart</button></td>
							</c:if>

						</tr>
		</c:forEach>
	</table>	
</form>
</body>
</html>