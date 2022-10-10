/**
 * 
 */

app.controller("account-ctrl", function ($timeout,$rootScope,$scope, $http) {
	

	// $http.get("/rest/account/getone").then(resp => {
	// 	$scope.acc = resp.data;
	// 	console.log($scope.acc);
	// 	$scope.securityPhone($scope.acc.phonenumber);
	// 	console.log($scope.sdt);
	// 	$scope.securityEmail($scope.acc.email);
	// 	console.log($scope.email.length)
	// 	console.log($scope.acc.email.length)
	// }).catch(error => {
	// 	alert("Lỗi!");
	// 	console.log("Error", error);
	// });
	
	// // đổi mật khẩu
	// var count = 0;
	// $scope.changePassword = function () {
	// 	if(count==1){
	// 		document.getElementById("changePassword").setAttribute("data-dismiss","modal");
	// 		document.getElementById("changePassword").click();
	// 		count=0;
	// 		return;
	// 	}
	// 	if($scope.passwordCurrent == $scope.acc.password){
	// 		if($scope.passwordNew == $scope.confirmPassword){
	// 			$scope.acc.password = $scope.passwordNew;
	// 			console.log($scope.acc);
	// 			$scope.checkPassConfirm = "";
	// 			$scope.checkPassCurrent = "";
	// 			$scope.checkPassNew = "";
	// 			var item = $scope.acc;
	// 			console.log(item);
	// 			$http.put("/rest/account",item).then(resp =>{
	// 				count=1;
	// 				alert("thành công")
	// 				document.getElementById("changePassword").click();
					
	// 			}).catch(error=>{
	// 				console.log(error)
	// 			})
	// 		}else{
	// 			$scope.checkPassConfirm = "xác nhận mật khẩu không đúng!";
	// 			$scope.checkPassCurrent = "";
	// 			$scope.checkPassNew = "";
	// 		}
	// 	}else{
	// 		$scope.checkPassCurrent = "Mật khẩu không đúng!";
	// 		$scope.checkPassConfirm = null;
	// 		$scope.checkPassNew = "";
	// 	}
		
	// }

	
	// // đổi sdt
	// $scope.changePhone = function(){
		
	// 	// if(count==1){
	// 	// 	document.getElementById("changePhone").setAttribute("data-dismiss","modal");
	// 	// 	document.getElementById("changePhone").click();
	// 	// 	count=0;
	// 	// 	return;
	// 	// }
		
	// 	if($scope.phonenumberCurrent == $scope.acc.phonenumber){
	// 			console.log(parseInt($scope.phonenumberNew))
	// 			var vnf_regex = /((09|03|07|08|05)+([0-9]{8})\b)/g;
	// 			if(vnf_regex.test($scope.phonenumberNew)==true){
	// 				$scope.acc.phonenumber = $scope.phonenumberNew;
	// 				var item = $scope.acc;
	// 				console.log($scope.acc);
	// 				$scope.checkPhoneNew = "";
	// 				$scope.checkPhoneCurrent = null;
	// 				$http.put("/rest/account",item).then(resp =>{
	// 					alert("thành công");
	// 				}).catch(error=>{
	// 					console.log(error)
	// 				})
	// 			} else  {
	// 				console.log("lỗi");
	// 				$scope.checkPhoneNew = "Số điện thoại không đúng định dạng!";
	// 				$scope.checkPhoneCurrent = null;
	// 			}
				
	// 	}else{
	// 		$scope.checkPhoneCurrent = "Số điện thoại không đúng!";
	// 		$scope.checkPhoneNew = null;
	// 	}
	// }
	
	// //đổi Email
	// $scope.changeEmail = function () {
	// 	if($scope.emailCurrent == $scope.acc.email){
	// 		$scope.acc.email = $scope.emailNew;
	// 		var item = $scope.acc;
	// 		console.log($scope.acc);
	// 		$scope.checkEmailCurrent = "";
	// 		$scope.checkEmailNew = "";
	// 		$http.put("/rest/account",item).then(resp =>{
	// 			alert("thành công");
	// 		}).catch(error=>{
	// 			console.log(error)
	// 		})
	// 	}else{
	// 		$scope.checkEmailCurrent = "Email không đúng!"
	// 	}
	// }

	// // che Số điện thoại
	// $scope.securityPhone = function(sdt){
	// 	var temp = sdt.substring(sdt.length-3,sdt.length);
	// 	$scope.sdt = "";
	// 	for(let i= 0;i<sdt.length-3;i++){
	// 		$scope.sdt+="*";
	// 	}
	// 	$scope.sdt= $scope.sdt+ temp;
	// }

	// // che Email
	// $scope.securityEmail = function(email){
	// 	var temp = email.substring(0,5);
	// 	$scope.email = "";
	// 	for(let i= 0;i<email.length-5;i++){
	// 		$scope.email+="*";
	// 	}
	// 	$scope.email= temp+$scope.email ;
	// }




	///GET CITY
	$http({
		method: "GET",
		url: "http://sandbox.goship.io/api/v2/cities",
		headers: {
		  "Content-Type": "application/json",
		  Accept: "application/json",
		  Authorization:
			"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjllMzQ0MDNlOTZhMzI1NmUwNDFjMGU5ZmE3MzQ0N2ZkMDllN2Y4YTg0NWU5NmE2NTNjODU2YTQ3ZWMwNjQ1MzFjMjNlN2Q0ZGRmMGQ2ODg4In0.eyJhdWQiOiIxMyIsImp0aSI6IjllMzQ0MDNlOTZhMzI1NmUwNDFjMGU5ZmE3MzQ0N2ZkMDllN2Y4YTg0NWU5NmE2NTNjODU2YTQ3ZWMwNjQ1MzFjMjNlN2Q0ZGRmMGQ2ODg4IiwiaWF0IjoxNjYyOTkzMjQxLCJuYmYiOjE2NjI5OTMyNDEsImV4cCI6NDgxODY2Njg0MSwic3ViIjoiMzE4OSIsInNjb3BlcyI6W119.RzxNMS8bWdklm_YXgxtXZ0lSJuecwCmaiWXbuPrhsBkzAS7dLkfEmoPu4bLieDzSWS2v_yeH8XdiqyRim9xbLsOoplo_w0TboQrZXRxWNhw7aFWalp8TfwR04xm79xgWPHhFe1oqMQ6NCcQKarPvsf9alRuupUnBmyi_PueILbeJsT5Ek_MMXALYwAVlmepzHvwF8x_KQ5Ha_TR2S2xNE_htR8MS9eyfss4mvflfUpvTXgF1YUIl5KlQj5duAluGvXadwp-4g_ImFPljFplTxhF0UQ1C7ohW1GkoA_QUFSyLDUfBkMXTaq_slRGd7aUDgHDDy4cgeTAetmlrYtqImJlocL0bzIaHBur6ieXp2UnYKFTlozZN2MUKvmLuwhO5tXJRo4uBfLJAP9nC8BzoPvq4OUDJ43gRYK05uVF8Yq2YqvXftcyixv5bt3KYS3EG82ku0W83drteuVnF0kjxCipykGgFwjZO1Sj8X7vTeqGXk5kfI5zYeu6N11BJgWrVpJxz0lsRlJ7vuxzAFaRUhrp-8v2bhdaPCQl9L2RIDHsX-gG3NNR6dpd6u0JvDfofh4fgp9VWR8BJcHr17_kHp70ZlBdB-anxUYISVi5SI5l0sCLQXzvhqz2guvyZKbj0xieb67dQgpMlipXouQb-xBnIQFN7j0b8j_kACXqxPGU",
		},
	  }).then(
		function successCallback(response) {
		  $rootScope.province = response.data;
		  setTimeout(init, 200);
		},
		function errorCallback(response) {
		  console.log(response);
		}
	  );
	  /// GET DISTRICT
	  $http({
		method: "GET",
		url: "http://sandbox.goship.io/api/v2/districts?page=1&size=1000",
		headers: {
		  "Content-Type": "application/json",
		  Accept: "application/json",
		  Authorization:
			"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjllMzQ0MDNlOTZhMzI1NmUwNDFjMGU5ZmE3MzQ0N2ZkMDllN2Y4YTg0NWU5NmE2NTNjODU2YTQ3ZWMwNjQ1MzFjMjNlN2Q0ZGRmMGQ2ODg4In0.eyJhdWQiOiIxMyIsImp0aSI6IjllMzQ0MDNlOTZhMzI1NmUwNDFjMGU5ZmE3MzQ0N2ZkMDllN2Y4YTg0NWU5NmE2NTNjODU2YTQ3ZWMwNjQ1MzFjMjNlN2Q0ZGRmMGQ2ODg4IiwiaWF0IjoxNjYyOTkzMjQxLCJuYmYiOjE2NjI5OTMyNDEsImV4cCI6NDgxODY2Njg0MSwic3ViIjoiMzE4OSIsInNjb3BlcyI6W119.RzxNMS8bWdklm_YXgxtXZ0lSJuecwCmaiWXbuPrhsBkzAS7dLkfEmoPu4bLieDzSWS2v_yeH8XdiqyRim9xbLsOoplo_w0TboQrZXRxWNhw7aFWalp8TfwR04xm79xgWPHhFe1oqMQ6NCcQKarPvsf9alRuupUnBmyi_PueILbeJsT5Ek_MMXALYwAVlmepzHvwF8x_KQ5Ha_TR2S2xNE_htR8MS9eyfss4mvflfUpvTXgF1YUIl5KlQj5duAluGvXadwp-4g_ImFPljFplTxhF0UQ1C7ohW1GkoA_QUFSyLDUfBkMXTaq_slRGd7aUDgHDDy4cgeTAetmlrYtqImJlocL0bzIaHBur6ieXp2UnYKFTlozZN2MUKvmLuwhO5tXJRo4uBfLJAP9nC8BzoPvq4OUDJ43gRYK05uVF8Yq2YqvXftcyixv5bt3KYS3EG82ku0W83drteuVnF0kjxCipykGgFwjZO1Sj8X7vTeqGXk5kfI5zYeu6N11BJgWrVpJxz0lsRlJ7vuxzAFaRUhrp-8v2bhdaPCQl9L2RIDHsX-gG3NNR6dpd6u0JvDfofh4fgp9VWR8BJcHr17_kHp70ZlBdB-anxUYISVi5SI5l0sCLQXzvhqz2guvyZKbj0xieb67dQgpMlipXouQb-xBnIQFN7j0b8j_kACXqxPGU",
		},
	  }).then(
		function successCallback(response) {
		  $rootScope.district = response.data;
		},
		function errorCallback(response) {
		  console.log(response);
		}
	  );
	
	  $scope.getDistrictAfterSelectProvince = function () {
		$timeout(function () {
		  let provinceSelectedName =
			document.getElementById("province_search").value;
		  let placeholderSearch = document
			.getElementById("province_search")
			.getAttribute("placeholder");
		  if (provinceSelectedName.localeCompare("") == 0) {
			return;
		  }
		  if (provinceSelectedName.localeCompare(placeholderSearch) != 0) {
			document.getElementById("district_search").value = "";
			document
			  .getElementById("district_search")
			  .setAttribute("placeholder", "Select district");
			document.getElementById("ward_search").value = "";
			document
			  .getElementById("ward_search")
			  .setAttribute("placeholder", "Select ward");
		  }
		  $scope.provinceSelectedElement = $rootScope.province.data.filter(
			(element) => element.name == provinceSelectedName
		  );
		  $scope.districts = $rootScope.district.data.filter(
			(element) => element.city_id == $scope.provinceSelectedElement[0].id
		  );
		  setTimeout(setEventAfterClick, 500, "district");
		}, 400);
	  };
	  $scope.getWardAfterSelectDistrict = function () {
		$timeout(function () {
		  let districtSelectedName =
			document.getElementById("district_search").value;
		  let placeholderSearch = document
			.getElementById("district_search")
			.getAttribute("placeholder");
		  if (districtSelectedName.localeCompare("") == 0) {
			return;
		  }
		  if (districtSelectedName.localeCompare(placeholderSearch) != 0) {
			document.getElementById("ward_search").value = "";
			document
			  .getElementById("ward_search")
			  .setAttribute("placeholder", "Select ward");
		  }
		  $scope.districtSelectedElement = $rootScope.district.data.filter(
			(element) => element.name == districtSelectedName
		  );
		  $http({
			method: "GET",
			url:
			  "http://sandbox.goship.io/api/v2/districts/" +
			  $scope.districtSelectedElement[0].id +
			  "/wards",
			headers: {
			  "Content-Type": "application/json",
			  Accept: "application/json",
			  Authorization:
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjllMzQ0MDNlOTZhMzI1NmUwNDFjMGU5ZmE3MzQ0N2ZkMDllN2Y4YTg0NWU5NmE2NTNjODU2YTQ3ZWMwNjQ1MzFjMjNlN2Q0ZGRmMGQ2ODg4In0.eyJhdWQiOiIxMyIsImp0aSI6IjllMzQ0MDNlOTZhMzI1NmUwNDFjMGU5ZmE3MzQ0N2ZkMDllN2Y4YTg0NWU5NmE2NTNjODU2YTQ3ZWMwNjQ1MzFjMjNlN2Q0ZGRmMGQ2ODg4IiwiaWF0IjoxNjYyOTkzMjQxLCJuYmYiOjE2NjI5OTMyNDEsImV4cCI6NDgxODY2Njg0MSwic3ViIjoiMzE4OSIsInNjb3BlcyI6W119.RzxNMS8bWdklm_YXgxtXZ0lSJuecwCmaiWXbuPrhsBkzAS7dLkfEmoPu4bLieDzSWS2v_yeH8XdiqyRim9xbLsOoplo_w0TboQrZXRxWNhw7aFWalp8TfwR04xm79xgWPHhFe1oqMQ6NCcQKarPvsf9alRuupUnBmyi_PueILbeJsT5Ek_MMXALYwAVlmepzHvwF8x_KQ5Ha_TR2S2xNE_htR8MS9eyfss4mvflfUpvTXgF1YUIl5KlQj5duAluGvXadwp-4g_ImFPljFplTxhF0UQ1C7ohW1GkoA_QUFSyLDUfBkMXTaq_slRGd7aUDgHDDy4cgeTAetmlrYtqImJlocL0bzIaHBur6ieXp2UnYKFTlozZN2MUKvmLuwhO5tXJRo4uBfLJAP9nC8BzoPvq4OUDJ43gRYK05uVF8Yq2YqvXftcyixv5bt3KYS3EG82ku0W83drteuVnF0kjxCipykGgFwjZO1Sj8X7vTeqGXk5kfI5zYeu6N11BJgWrVpJxz0lsRlJ7vuxzAFaRUhrp-8v2bhdaPCQl9L2RIDHsX-gG3NNR6dpd6u0JvDfofh4fgp9VWR8BJcHr17_kHp70ZlBdB-anxUYISVi5SI5l0sCLQXzvhqz2guvyZKbj0xieb67dQgpMlipXouQb-xBnIQFN7j0b8j_kACXqxPGU",
			},
		  }).then(
			function successCallback(response) {
			  $rootScope.wards = response.data.data;
			  //   setTimeout(setEventAfterClick, 300, "ward");
			  setTimeout(setEventAfterClickWard, 300, "ward");
			},
			function errorCallback(response) {
			  console.log(response);
			}
		  );
		}, 200);
	  };
	
	  $scope.calculateFeeALL = function () {
		bodyData.shipment.address_to.city = $scope.provinceSelectedElement[0].id;
		bodyData.shipment.address_to.district = $scope.districtSelectedElement;
		$http({
		  method: "POST",
		  url: "http://sandbox.goship.io/api/v2/rates",
		  data: bodyData,
		  headers: {
			"Content-Type": "application/json",
			Accept: "application/json",
			Authorization:
			  "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjllMzQ0MDNlOTZhMzI1NmUwNDFjMGU5ZmE3MzQ0N2ZkMDllN2Y4YTg0NWU5NmE2NTNjODU2YTQ3ZWMwNjQ1MzFjMjNlN2Q0ZGRmMGQ2ODg4In0.eyJhdWQiOiIxMyIsImp0aSI6IjllMzQ0MDNlOTZhMzI1NmUwNDFjMGU5ZmE3MzQ0N2ZkMDllN2Y4YTg0NWU5NmE2NTNjODU2YTQ3ZWMwNjQ1MzFjMjNlN2Q0ZGRmMGQ2ODg4IiwiaWF0IjoxNjYyOTkzMjQxLCJuYmYiOjE2NjI5OTMyNDEsImV4cCI6NDgxODY2Njg0MSwic3ViIjoiMzE4OSIsInNjb3BlcyI6W119.RzxNMS8bWdklm_YXgxtXZ0lSJuecwCmaiWXbuPrhsBkzAS7dLkfEmoPu4bLieDzSWS2v_yeH8XdiqyRim9xbLsOoplo_w0TboQrZXRxWNhw7aFWalp8TfwR04xm79xgWPHhFe1oqMQ6NCcQKarPvsf9alRuupUnBmyi_PueILbeJsT5Ek_MMXALYwAVlmepzHvwF8x_KQ5Ha_TR2S2xNE_htR8MS9eyfss4mvflfUpvTXgF1YUIl5KlQj5duAluGvXadwp-4g_ImFPljFplTxhF0UQ1C7ohW1GkoA_QUFSyLDUfBkMXTaq_slRGd7aUDgHDDy4cgeTAetmlrYtqImJlocL0bzIaHBur6ieXp2UnYKFTlozZN2MUKvmLuwhO5tXJRo4uBfLJAP9nC8BzoPvq4OUDJ43gRYK05uVF8Yq2YqvXftcyixv5bt3KYS3EG82ku0W83drteuVnF0kjxCipykGgFwjZO1Sj8X7vTeqGXk5kfI5zYeu6N11BJgWrVpJxz0lsRlJ7vuxzAFaRUhrp-8v2bhdaPCQl9L2RIDHsX-gG3NNR6dpd6u0JvDfofh4fgp9VWR8BJcHr17_kHp70ZlBdB-anxUYISVi5SI5l0sCLQXzvhqz2guvyZKbj0xieb67dQgpMlipXouQb-xBnIQFN7j0b8j_kACXqxPGU",
		  },
		}).then(
		  function successCallback(response) {
			$rootScope.phigiaohang = response.data;
			// console.log($rootScope.phigiaohang)
			// $rootScope.phigiaohang.data.forEach
		  },
		  function errorCallback(response) {
			console.log(response);
		  }
		);
	  };
	  function showDropDown() {
		this.nextElementSibling.style.display = "block";
	  }
	  function offDropDown() {
		this.parentElement.style.display = "none";
	  }
	  function turnOffDropDownWhenClickOut(container, dropdown, e, address) {
		if (!container.is(e.target) && container.has(e.target).length === 0) {
		  dropdown.hide();
		  ClickOutDropdownPlaceholderChangeToValue(address);
		}
	  }
	  function ClickOutDropdownPlaceholderChangeToValue(address) {
		var divOptions = document
		  .getElementById("dropdown_" + address)
		  .getElementsByTagName("div");
		document.getElementById("dropdown_" + address).style.cursor = "pointer";
		var searchElement = document.getElementById(address + "_search");
		var placeholderSearch = searchElement.getAttribute("placeholder");
		var compareString = "Select " + address;
		//Trường hợp không Not found
		// Nếu place khác mặc định + value rỗng
		if (
		  placeholderSearch.localeCompare(compareString) != 0 &&
		  searchElement.value.localeCompare("") == 0
		) {
		  searchElement.value = placeholderSearch; // đủ điều kiện đề chuyển placeholder thành value
		}
		//Trường hợp  Not found
		for (let x in divOptions) {
		  if (divOptions[x].innerHTML == "Not found") {
			document.getElementById(
			  "dropdown_" + address
			).previousElementSibling.value = "";
			divOptions[x].remove();
			if (placeholderSearch.localeCompare(compareString) != 0) {
			  searchElement.value = searchElement.getAttribute("placeholder");
			}
		  }
		}
		getProperOption(
		  divOptions,
		  searchElement,
		  placeholderSearch,
		  compareString
		);
	  }
	  function getProperOption(
		divOptions,
		searchElement,
		placeholderSearch,
		compareString
	  ) {
		var checkEqualNewValueVsOptions = false;
		for (let index = 0; index < divOptions.length; index++) {
		  const element = divOptions[index];
		  if (searchElement.value.localeCompare(element.innerHTML) == 0) {
			checkEqualNewValueVsOptions = true;
		  }
		}
	
		if (
		  searchElement.value.localeCompare("") != 0 &&
		  searchElement.value.localeCompare(placeholderSearch) != 0 &&
		  !checkEqualNewValueVsOptions
		) {
		  for (let index = 0; index < divOptions.length; index++) {
			const element = divOptions[index];
			if (element.style.display != "none") {
			  searchElement.value = element.innerHTML;
			  break;
			}
		  }
		}
	  }
	  var getProvinceID = function () {
		var attribute = this.innerHTML;
		this.parentElement.previousElementSibling.value = attribute;
	  };
	
	  function valueChangeToPlaceHolder() {
		if (!this.value == "") {
		  this.setAttribute("placeholder", this.value);
		  this.value = "";
		}
	  }
	
	  function filterFunction() {
		var input, filter, ul, li, a, i;
		input = this;
		filter = input.value.toUpperCase();
		div = this.nextElementSibling;
		a = div.getElementsByTagName("div");
		var Available = false;
		for (i = 0; i < a.length; i++) {
		  txtValue = a[i].textContent || a[i].innerText;
		  if (txtValue.toUpperCase().indexOf(filter) > -1) {
			a[i].style.display = "";
			Available = true;
		  } else {
			a[i].style.display = "none";
		  }
		  if (a[i].innerText === "Not found") {
			a[i].remove();
		  }
		}
		if (!Available) {
		  var style = document.createElement("div");
		  style.innerHTML = "Not found";
		  div.appendChild(style);
		  div.style.cursor = "no-drop";
		} else {
		  div.style.cursor = "pointer";
		}
	  }
	  function showAll() {
		var a, div;
		div = this.nextElementSibling;
		a = div.getElementsByTagName("div");
		for (i = 0; i < a.length; i++) {
		  a[i].style.display = "block";
		}
	  }
	  function init() {
		var addressOption = ["province", "district", "ward"];
		for (let i = 0; i < addressOption.length; i++) {
		  setEvent(addressOption[i]);
		}
	  }
	
	  function setEvent(addressOption) {
		document
		  .getElementById(addressOption + "_search")
		  .addEventListener("keyup", filterFunction);
		document
		  .getElementById(addressOption + "_search")
		  .addEventListener("focus", showAll);
		document
		  .getElementById(addressOption + "_search")
		  .addEventListener("focus", showDropDown);
		document
		  .getElementById(addressOption + "_search")
		  .addEventListener("focus", valueChangeToPlaceHolder);
		$(document).mouseup(function (e) {
		  turnOffDropDownWhenClickOut(
			$("#dropdown_" + addressOption + "_border"),
			$("#dropdown_" + addressOption),
			e,
			addressOption
		  );
		});
		let province_option_classes = document.getElementsByClassName(
		  addressOption + "_option"
		);
		Array.from(province_option_classes).forEach(function (element) {
		  element.addEventListener("click", getProvinceID);
		  element.addEventListener("click", offDropDown);
		});
	  }
	  function setEventAfterClick(addressOption) {
		let province_option_classes = document.getElementsByClassName(
		  addressOption + "_option"
		);
		Array.from(province_option_classes).forEach(function (element) {
		  element.addEventListener("click", getProvinceID);
		  element.addEventListener("click", offDropDown);
		});
	  }
	
	  function setEventAfterClickWard(addressOption) {
		let province_option_classes = document.getElementsByClassName(
		  addressOption + "_option"
		);
		Array.from(province_option_classes).forEach(function (element) {
		  element.addEventListener("click", getProvinceID);
		  element.addEventListener("click", offDropDown);
		  element.addEventListener("click", $scope.calculateFeeALL);
		});
	  }

})