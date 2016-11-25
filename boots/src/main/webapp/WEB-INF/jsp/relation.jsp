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
<title>Boot sample | Home</title>
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/style.css">
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Menu</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="relation">Relation Properties</a></li>
					<li><a href="new-relation">New Relation Properties</a></li>
					<li><a href="all-relation">All Relation Properties</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='HOME_RELATION'}">
			<div class="container">
				<div class="jumbotron text-center" id="relationHome">
					<h1>Welcome to Relation Properties Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_RELATION'}">
			<div class="container text-center" id="relationDiv">
				<h3>Relation Properties</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Relation ship Type Id</th>
								<th>Is transitive</th>
								<th>Is Symmetric</th>
								<th>Is Anti Symmetric</th>
								<th>Is Cyclic</th>
								<th>Is Reflexive</th>
								<th>Is Metadata Tag</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="relation" items="${relations}">
								<tr>
									<td>${relation.id}</td>
									<td>${relation.isTransitive}</td>
									<td>${relation.isSymmetric}</td>
									<td>${relation.isAntiSymmetric}</td>
									<td>${relation.isCyclic}</td>
									<td>${relation.isReflexive}</td>
									<td>${relation.isMetadataTag}</td>
									
									
									<td><a href="update-relation?id=${relation.id}"> <span
											class="glyphicon glyphicon-pencil"></span>
									</a></td>
									<td><a href="delete-relation?id=${relation.id}"> <span
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
				<h3>Manage Relation Properties</h3>
				<hr />
				<form class="form-horizontal" method="POST" action="save-relation">
					<input type="hidden" name="id" value="${relation.id}" />
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Is Transitive:</label>
							<input type="text" class="form-control" name="isTransitive"
								value="${relation.isTransitive}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Is Symmetric:</label>
							<input type="text" class="form-control" name="isSymmetric"
								value="${relation.isSymmetric}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Is Anti Symmetric:</label>
							<input type="text" class="form-control" name="isAntiSymmetric"
								value="${relation.isAntiSymmetric}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Is Cyclic:</label>
							<input type="text" class="form-control" name="isCyclic"
								value="${relation.isCyclic}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Is Reflexive:</label>
							<input type="text" class="form-control" name="isReflexive"
								value="${relation.isReflexive}" />
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-7">
							<label class="control-label col-sm-3">Is Metadata Tag:</label>
							<input type="text" class="form-control" name="isMetadataTag"
								value="${relation.isMetadataTag}" />
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