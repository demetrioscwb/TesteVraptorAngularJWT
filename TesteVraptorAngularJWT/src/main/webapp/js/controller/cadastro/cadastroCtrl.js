testeUmApp.controller("cadastroController",function($scope,$http,$location){
	
	$scope.msgCadastroController = 'cadastroController';	
	
	$scope.verificarAcesso = function () { 

		$http.get('/TesteVraptorAngularJWT/cadastro/possuiAcesso').success(function(data){
						

			
			}).error(function(data, status, headers, config) {
				
				$location.path("/errorLogin");
				
			}
		);	
		
	};
	
	$scope.verificarAcesso();
	
});