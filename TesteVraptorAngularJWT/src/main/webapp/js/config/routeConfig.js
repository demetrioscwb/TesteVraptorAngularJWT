testeUmApp.config(function($routeProvider){
	
	// remove o # da url
	  // $locationProvider.html5Mode(true);
	
		$routeProvider.when('/home', {
	      templateUrl : 'view/home/home.jsp',
	      controller: 'homeController'
		})
		$routeProvider.when('/cadastro', {
	      templateUrl : 'view/cadastro/cadastro.jsp',
	      controller: 'cadastroController'
		})	
		$routeProvider.when('/servico', {
	      templateUrl : 'view/servico/servico.jsp',
	      controller: 'servicoController'
		})	
	 	$routeProvider.when('/errorLogin', {
	      templateUrl : 'view/login/errorLogin.jsp'
		})	
	   // caso não seja nenhum desses, redirecione para a rota '/'
	   .otherwise ({ redirectTo: '/' });
	
	
});