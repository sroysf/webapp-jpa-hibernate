<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<HTML>
<HEAD>
<title>Books</title>
</HEAD>
<BODY>

	<h2>List of books</h2>
	
	<table cellspacing="10">
		<c:forEach var="book" items="${requestScope.books}">
			<tr>
			<td><c:out value="${book.title}" /></td>
			<td><c:out value="${book.publicationDate}" /></td>
			<td><c:out value="${book.author.firstName} ${book.author.lastName}" /></td>
			</tr>
		</c:forEach>
	</table>
</BODY>
</HTML>