<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<body style="background-color:cyan;">
  <h1 style="color: red;text-align: center"> All  ${operation} Info </h1>
<c:choose>
   <c:when test="${listInfo ne null && !empty listInfo   }">
         <table align="center">
          <c:forEach var="country"  items="${listInfo}">
            <tr>
               <td>${country} </td>
             </tr>
            </c:forEach>
         </table>
         <b> Total countries count:: ${countriesCount}</b>
   </c:when>
   <c:otherwise>
          <h1 style="color: red;text-align: center;"> No countries found </h1>
   </c:otherwise>
</c:choose>
 <br>
 <br>
   <a href="welcome">home</a>
</body>