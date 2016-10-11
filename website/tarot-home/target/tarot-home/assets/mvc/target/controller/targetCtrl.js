/**
 * Created by Ray.Fu on 2016/10/9.
 */
angular.module('myee', [])
    .controller('targetCtrl', targetCtrl);

targetCtrl.$inject = ['$scope','$resource', 'Constants','cTables','cfromly'];
function targetCtrl($scope, $resource, Constants,cTables,cfromly) {

    $scope.submit = function () {
        var content = $scope.where.content;
        var url = "/target/create";
        var xhr = $resource(url);
        xhr.save({content: content}, "").$promise.then(function (result) {
            console.log(result.dataMap.target.content)
        });
    }

    cTables.initNgMgrCtrl("", $scope);
}
