var detailOrder1;
app.controller("ListOrder-ctrl", function ($rootScope, $scope, $http) {

	$http.get("/rest/ListOrder/order").then(resp => {
		$rootScope.order = resp.data;
	})
	$http.get("/rest/ListOrder/detail").then(resp => {
		$scope.listDetailOrder = resp.data;
		$scope.checkOrder()
		console.log($rootScope.order)
	})


	$scope.checkOrder = function () {
		for (let i = 0; i < $rootScope.order.length; i++) {
			var item = [];
			var totalPrice = 0;
			for (let j = 0; j < $scope.listDetailOrder.length; j++) {
				if ($rootScope.order[i].orderid == $scope.listDetailOrder[j].orders.orderid) {
					item.push($scope.listDetailOrder[j]);
					totalPrice += $scope.listDetailOrder[j].productprice * $scope.listDetailOrder[j].quantity;
				}
			}
			$rootScope.order[i].totalmoneyFormat = new Intl.NumberFormat('de-DE').format($rootScope.order[i].totalmoney);
			$rootScope.order[i].detailorder = item;
			$rootScope.order[i].totalPrice = totalPrice;
		}
	}

	$scope.link = function (item) {
		$rootScope.detailOrder1 = item;
		detailOrder1 = item;
		location.href = "/detailorder/" + item.orderid;
		console.log(detailOrder1);
	}

})

app.controller("DetailOrder-ctrl", function ($rootScope, $scope, $http) {
	var id = location.href.substring(location.href.lastIndexOf("/"), location.href.length);
	console.log(id);
	$http.get("/rest/ListOrder/detailOrder" + id).then(resp => {
		$scope.detailOrder = resp.data;
		// xử lý ngày tháng năm
		$scope.detailOrder[0].orders.createdate = new Date($scope.detailOrder[0].orders.createdate);
		let day = $scope.detailOrder[0].orders.createdate.getDate();
		console.log(day); // 23
		let month = $scope.detailOrder[0].orders.createdate.getMonth();
		console.log(month); // 8
		let year = $scope.detailOrder[0].orders.createdate.getFullYear();
		$scope.detailOrder[0].orders.createdate = day + "/" + (month+1) + "/" + year;
		// format tiền (10.000,00)
		$scope.detailOrder[0].orders.totalNoneDiscount = new Intl.NumberFormat('de-DE').format($scope.detailOrder[0].orders.shipfee + $scope.detailOrder[0].orders.productmoney);
		$scope.detailOrder[0].orders.productmoney = new Intl.NumberFormat('de-DE').format($scope.detailOrder[0].orders.productmoney);
		$scope.detailOrder[0].orders.totalmoneyFormat = new Intl.NumberFormat('de-DE').format($scope.detailOrder[0].orders.totalmoney);
		$scope.detailOrder[0].orders.shipfee = new Intl.NumberFormat('de-DE').format($scope.detailOrder[0].orders.shipfee);
		//
		for (let i = 0; i < $scope.detailOrder.length; i++) {
			$scope.detailOrder[i].totalprice = new Intl.NumberFormat('de-DE').format($scope.detailOrder[i].productprice * $scope.detailOrder[i].quantity);
			$scope.detailOrder[i].productprice = new Intl.NumberFormat('de-DE').format($scope.detailOrder[i].productprice);
		}
		console.log($scope.detailOrder);
	}).catch(error => {
		console.log(error);
	})
})
