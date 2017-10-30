<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link href="lib/bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet" media="screen"></link>
	<script type="text/javascript" src="lib/angular.min.js"></script>
	<script type="text/javascript" src="lib/angular-route.min.js"></script>
	<script type="text/javascript" src="js/controller/app.js"></script>
	<script type="text/javascript" src="js/controller/index/indexCtrl.js"></script>
	<script type="text/javascript" src="js/config/routeConfig.js"></script>	
	
	<script type="text/javascript" src="js/controller/home/homeCtrl.js"></script>
	<script type="text/javascript" src="js/controller/cadastro/cadastroCtrl.js"></script>
	<script type="text/javascript" src="js/controller/servico/servicoCtrl.js"></script>	
	
<title></title>
</head>
<body ng-app="testeUmApp">

<div ng-controller="indexCtrol" ng-init="init()">

</br>

nome do controller ---> {{msgIndexCtrol}}

</br></br>

msg do java -------------> {{msgJava}}

</br>
</br>

      <ul class="nav nav-tabs">
         <li ng-class="{active: activetab == '/'}"><a href="#/home">Home</a></li>
         <li ng-class="{active: activetab == '/'}"><a href="#/cadastro">Cadastro</a></li>
         <li ng-class="{active: activetab == '/'}"><a href="#/servico">Serviço</a></li>
      </ul>
 
      <div ng-view></div>

</div>
<hr/>



<hr/>

<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
</body>
</html>