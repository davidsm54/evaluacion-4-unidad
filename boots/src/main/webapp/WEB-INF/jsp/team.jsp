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
<title>Index Team</title>
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/style.css">
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Menu</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="team">Team</a></li>
					<li><a href="new-team">New Team</a></li>
					<li><a href="all-team">All Teams</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='HOME_TEAM'}">
			<div class="container">
				<div class="jumbotron text-center" id="homeDiv">
					<h1>Welcome to Team Manager</h1>
				</div>
			</div>
		</c:when>
		
		<c:when test="${mode=='MODE_TEAM'}">
			<div class="container text-center" id="teamDiv">
				<h3>My Teams</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>country</th>
								<th>ligue</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="team" items="${teams}">
								<tr>
									<td>${team.id}</td>
									<td>${team.name}</td>
									<td>${team.country}</td>
									<td>${team.ligue}</td>
									
									<td><a href="update-team?id=${team.id}"> <span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-team?id=${team.id}"> <span
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
				<form class="form-horizontal" method="POST" action="save-team">
					<input type="hidden" name="id" value="${team.id}" />
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Name:</label>
							<input type="text" class="form-control" name="name"
								value="${team.name}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Country:</label>
							<input type="text" class="form-control" name="country"
								value="${team.country}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Ligue:</label>
							<input type="text" class="form-control" name="ligue"
								value="${team.ligue}" />
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