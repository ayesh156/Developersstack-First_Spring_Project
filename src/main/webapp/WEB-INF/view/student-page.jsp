
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Page</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<form action="/create-student" method="post">
    <div class="container p-4">
        <div class="row">
            <div class="col-3">
                <div class="form-group">
                    <label for="id">Id</label>
                    <input type="text" id="id" class="form-control" name="id">
                </div>
            </div>
            <div class="col-3">
                <div class="form-group">
                    <label for="name">Name</label>
                    <input type="text" id="name" class="form-control" name="name">
                </div>
            </div>
            <div class="col-3">
                <div class="form-group">
                    <label for="address">Address</label>
                    <input type="text" id="address" class="form-control" name="address">
                </div>
            </div>
            <div class="col-3">
                <div class="form-group">
                    <label for="salary">Salary</label>
                    <input type="text" id="salary" class="form-control" name="salary">
                </div>
            </div>
            <div class="col-12 mt-4">
                <button class="btn btn-primary col-12" type="submit">Save Student</button>
            </div>
        </div>
    </div>
</form>
</body>
</html>
