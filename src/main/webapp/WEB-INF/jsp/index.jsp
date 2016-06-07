<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Test App</title>
	<style type="text/css">
		#wrapper {
			margin: auto;
			width: 400px;
			border: 1px solid #000;
			padding: 20px;
		}
	</style>
</head>
<body>
	<div id="wrapper">
		<h3>Hello</h3>

		<strong>Get all:</strong></br>
        <a href='http://localhost:8080/product/'>http://localhost:8080/product/</a>
        </br></br>
        <strong>All CRUD operations by id:</strong></br>
        <a href='http://localhost:8080/product/1'>http://localhost:8080/product/1</a>

	</div>
</body>
</html>