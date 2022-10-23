var app = angular.module("AnhApp", ["ngRoute"]);
app.config(function($routeProvider) {
	$routeProvider
		.when("/main", {
			templateUrl: "/Admin/main.html"
		})

		.when("/ThongKeDoanhThu", {
			templateUrl: "/Admin/ThongKeDoanhThu.html"
		})

		.when("/ThongKeSanPham", {
			templateUrl: "/Admin/ThongKeSanPham.html"
		})

		.when("/ThongKeDonHang", {
			templateUrl: "/Admin/ThongKeDonHang.html"
		})

		.when("/QuanLyDoanhMuc", {
			templateUrl: "./index1.html"
		})

		.when("/QuanLySanPham", {
			templateUrl: "./index1.html"
		})

		.when("/QuanLyVoucher", {
			templateUrl: "/Admin/QuanLyVoucher.html",
		})

		.when("/QuanLySize", {
			templateUrl: "./index2.html"
		})

		.when("/QuanLyDiscount", {
			templateUrl: "/Admin/QuanLyDiscount.html",
			controller: "discount-ctrl"
		})
		
		.when("/QuanLyBanner", {
			templateUrl: "/Admin/QuanLyBanner.html",
			controller: "banner-ctrl"
		})

		.when("/MyProfile", {
			templateUrl: "./index2.html"
		})

		
		.when("/cart", {
			templateUrl: "./cart/view.html"
		})

		.when("/cart/order", {
			templateUrl: "./cart/order.html"
		})
		.otherwise({
			redirectTo: "/main"
		})
})