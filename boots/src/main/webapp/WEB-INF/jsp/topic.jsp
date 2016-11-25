<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE-edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<title>Index Topic</title>
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/style.css">
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Menu</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="topic">Topic</a></li>
					<li><a href="new-topic">New Topic</a></li>
					<li><a href="all-topics">All Topics</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='HOME_TOPIC'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Topic Manager</h1>
				</div>
			</div>
		</c:when>
		
		<c:when test="${mode=='MODE_TOPIC'}">
			<div class="container text-center" id="topicDiv">
				<h3>My Topics</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Asigned Group</th>
								<th>Name Teacher</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="topic" items="${topics}">
								<tr>
									<td>${topic.id}</td>
									<td>${topic.name}</td>
									<td>${topic.asignedGroup}</td>
									<td>${topic.nameTeacher}</td>
									
									<td><a href="update-topic?id=${topic.id}"> <span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-topic?id=${topic.id}"> <span
											class="glyphicon glyphicon-trash"></span>
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_NEW' || mode=='MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage Team</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-topic">
					<input type="hidden" name="id" value="${topic.id}" />
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Name:</label>
							<input type="text" class="form-control" name="name"
								value="${topic.name}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Asigned Group:</label>
							<input type="text" class="form-control" name="asignedGroup"
								value="${topic.asignedGroup}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Name Teacher:</label>
							<input type="text" class="form-control" name="nameTeacher"
								value="${topic.nameTeacher}" />
						</div>
					</div>
					
					
					<div class="form-group">
						<input type="submit" class="btn btn-prymary" value="Save"/>
					</div>
				</form>
			</div>
		</c:when>

	</c:choose>
	<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="static/js/bootstrap.min.js"></script>
</body>
</html>