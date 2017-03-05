welcome to Spring initializer
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${list ne null}">
	${list}
	<table>
		<tr>
			<th>colors</th>
		</tr>
		<c:forEach items="${list}" var="color">
			<tr>

				<td>${color}</td>
			</tr>
		</c:forEach>

	</table>

</c:if>

${msg}