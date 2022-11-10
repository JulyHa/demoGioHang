<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
    <h2>Contextual Classes</h2>
    <p>Contextual classes can be used to color the table, table rows or table cells. The classes that can be used are: .table-primary, .table-success, .table-info, .table-warning, .table-danger, .table-active, .table-secondary, .table-light and .table-dark:</p>
    <a href="Product/CreateProduct.jsp" type="button">Create</a>
        <table class="table">
            <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>price</th>
                <th>SL</th>
                <th>Delete</th>
                <th>Edit</th>
            </tr>
            </thead>
            <tbody>
            <div
                    class="bg-image"
                    style="
        background-image:url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpWRC9XcEUNkqszWbYp4Y9kNdqo7ZhFLuQNQ&usqp=CAU');
     background-size: cover;

 "
            >
                <c:forEach items = "${product}" var="pd">
                <tr class="table-white">
                    <form action="/GioHang" method="post">
                        <td><input type="text" readonly value="${pd.id}" name="id"></td>
                        <td>${pd.name}</td>
                        <td>${pd.price}</td>
                        <td>${pd.soLuong}</td>
                        <td>
                            <button type="submit" class="btn btn-danger">Add to Cart</button>
                        </td>
                    </form>

                </tr>
                </c:forEach>

            </tbody>
        </table>


</div>