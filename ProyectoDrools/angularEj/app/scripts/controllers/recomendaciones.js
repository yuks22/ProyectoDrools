'use strict';

/**
 * @ngdoc function
 * @name angularEjApp.controller:AsignaturasCtrl
 * @description
 * # AsignaturasCtrl
 * Controller of the angularEjApp
 */
angular.module('angularEjApp')
  .controller('RecomendacionesCtrl', ['$http', '$scope',function ($http, $scope, $log) {

   $http.get('http://localhost:8080/api/alumnos/recomendaciones')
        .then(function(response){
          var listado = response.data;
          $scope.ejercicios = listado;
        });


    $scope.insertarAsignaturaAlumno = function(nombre){
      var matricula = $http.get('http://localhost:8080/api/alumnos')
        .then(function(response){
          var res = response.data[0].matricula;
          console.log(response.data[0].matricula);
          //$log.debug("matricula"+res.nombre);
          var ejercicioInsertar = {
        
        "nombreEjercicio": nombre,
        "matricula": res
      }
      console.log(nombre);

      $http.post('http://localhost:8080/api/alumnos/insertaAlumnoEjercicio', ejercicioInsertar)
      .then(function(response){
        var respuesta = response.data;
        $scope.resultadoInsercion =  respuesta;
      });
        });
        //var res = '\"'+matricula+'\"'
      
    }
  }]);
