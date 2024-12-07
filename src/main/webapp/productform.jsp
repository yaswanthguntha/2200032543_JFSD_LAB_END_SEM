<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Product Form</title>
</head>
<body>
    <h3>Product Form</h3>
    <div>
        <form method="post" action="">
            <table>
                <tr>
                    <td><label for="id">Enter Product ID</label></td>
                    <td><input type="number" id="id" name="id" required/></td>
                </tr>
                <tr>
                    <td><label for="ename">Enter Product Name</label></td>
                    <td><input type="text" id="ename" name="ename" required/></td>
                </tr>
                <tr>
                    <td><label for="price">Price</label></td>
                    <td><input type="number" id="price" name="price" required/></td>
                </tr>
                <tr>
                	<td><label for="desc">Description</label></td>
                    <td><input type="text" id="desc" name="desc" required/></td>
                </tr>
                <tr>
                    <td colspan="2" class="button-container">
                        <input type="submit" value="Add"/>
                        <input type="reset" value="Clear"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>