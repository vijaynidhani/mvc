
         var scotchApp = angular.module('scotchApp', ['ngRoute']);

    // create the controller and inject Angular's $scope
     scotchApp.config(function($routeProvider) { 
     	
     $routeProvider

         // route for the home page
         .when('/', {
             templateUrl : 'mainpage.html',
             controller  : 'mainController'
         })

         // route for the about page
         .when('/about', {
             templateUrl : 'about.html',
             controller  : 'aboutController'
         })

         // route for the contact page
         .when('/contact', {
             templateUrl : 'contactus.html',
             controller  : 'contactController'
         });
 });
    
 // create the controller and inject Angular's $scope
 scotchApp.controller('mainController', function($scope) {
     // create a message to display in our view
     $scope.message = 'Everyone come and see how good I look!';
 });

 scotchApp.controller('aboutController', function($scope) {
     $scope.message = 'Look! I am an about page.';
 });

 scotchApp.controller('contactController', function($scope) {
     $scope.message = 'Contact us! JK. This is just a demo.';
 });