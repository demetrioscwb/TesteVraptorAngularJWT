testeUmApp.controller("indexCtrol",function($scope,$http,$rootScope){	
	
	$scope.msgIndexCtrol = "indexCtrol!!!";
	
	$scope.MyController = function () { 

		$http.get('/TesteVraptorAngularJWT/users').success(function(data){
			
				$scope.msgIndexCtrol = "indexCtrol com java loco!!!";
			
			}).error(function(data, status, headers, config) {
				
				$scope.msgIndexCtrol = "indexCtrol deu merda loco!!!";
			
			}
		);	
		
		$http.get('/TesteVraptorAngularJWT/usersMsg').success(function(data){

				$scope.msgJava = data;
				
				$scope.postIndex(data);
			
			}).error(function(data, status, headers, config) {
			
				$scope.msgJava = "Merda ....!!!";
			
			}
		);	
		
	};
	
	$scope.postIndex = function (indexAux) {
				   	    	
    	$http.post('/TesteVraptorAngularJWT/usersPost',indexAux).success(function(data){
    		
    		$scope.msgIndexCtrol = "Post sucesso loco!!!";

    	}).error(function(data, status, headers, config) {
			
			$scope.msgIndexCtrol = "Post deu merda loco!!!";
		
		});
    	
    };
	
	$scope.MyController();
	
});