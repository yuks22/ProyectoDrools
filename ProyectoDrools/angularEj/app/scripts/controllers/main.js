'use strict';

/**
 * @ngdoc function
 * @name angularEjApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the angularEjApp
 */
angular.module('angularEjApp')
  .controller('MainCtrl', function ($scope, $http, $window) {


    $scope.listado = function(){
      $http.get('http://localhost:8080/api/alumnos')
        .then(function(response){
          var listado = response.data;
          $scope.alumnos = listado;
        });
    }

  	$scope.insertarAlumno = function(){
  		var alumnoInsertar = {
  			"nombre": $scope.nombre,
  			"matricula": $scope.matricula
  		}
  		$http.post('http://localhost:8080/api/alumnos/inserta', alumnoInsertar)
  		.then(function(response){
  			var respuesta = response.data;
  			$scope.resultadoInsercion =  respuesta;
  		});
  	}

  });
