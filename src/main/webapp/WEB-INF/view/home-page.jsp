<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-12">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>#Id</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Salary</th>
                    <th>Option</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${students}" var="student">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.address}</td>
                    <td>${student.salary}</td>
                    <td>
                        <a class="btn btn-success" href="edit-student/${student.id}">Update</a> |
                        <a class="btn btn-danger" href="delete-student/${student.id}">Delete</a>
                    </td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>