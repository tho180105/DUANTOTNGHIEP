app1.controller("productTotal", function ($rootScope, $http, $scope) {




  
  
  $http.get("/rest/style/count").then((resp) => {
    $rootScope.styleCount = resp.data;
  });
  $http.get("/rest/cate/count").then((resp) => {
    $rootScope.cateCount = resp.data;
  });
  $http.get("/rest/product/count").then((resp) => {
    $rootScope.productCount = resp.data;
  });
  $http.get("/rest/detailorder").then((resp) => {
    $rootScope.detailOrders = resp.data;
    $scope.getYear()
  });
  $scope.getYear = function () {
    var dateF = new Date();
    var dateT = new Date();
    if (document.getElementById("dateSellForm").value === "") {
      dateF = new Date("1/1/0000");
    } else {
      var dateF = new Date(document.getElementById("dateSellForm").value);
    }
    if (document.getElementById("dateSellTo").value === "") {
      dateT = new Date();
    } else {
      dateT = new Date(document.getElementById("dateSellTo").value);
    }
    $scope.doneFilterDate = [];
    $rootScope.detailOrders.filter((element) => {
      if (
        new Date(element.orders.createdate) >= dateF &&
        new Date(element.orders.createdate) <= dateT
      ) {
        $scope.doneFilterDate.push(element);
      }
    });
    $scope.doneArrage = [];
    for (let i = 0; i < $scope.doneFilterDate.length - 1; i++) {
      let fakeArray = [];
      for (let j = i + 1; j < $scope.doneFilterDate.length; j++) {
        if (
          $scope.doneFilterDate[i].productrepository.product.productid ===  $scope.doneFilterDate[j].productrepository.product.productid   ) {
          fakeArray.push($scope.doneFilterDate[j]);
          $scope.doneFilterDate.splice(j, 1);
          j--;
        }
      }
      if(fakeArray.length==0){
        fakeArray.push($scope.doneFilterDate[i]);
      }
      let totalSold =0
      fakeArray.forEach(x=>{
        totalSold+=x.quantity
      })
      
      var element={};
      element.product=fakeArray[0].productrepository.product
      element.totalSold=totalSold;
      element.leftquantity = fakeArray[0].productrepository.quantity
      $scope.doneArrage.push(element);
    }

  };

/// Lưu Số lượng bao nhieu - Tháng đó là tháng mấy
//Xây dựng query  bên java lấy tổng sp bán được theo tháng
  ctx = document.getElementById("productMainChart").getContext("2d");
  const myChart = new Chart(ctx, {
    data: {
      datasets: [
        {
          type: "line",
          label: "Line Dataset",
          data: [12, 35, 25, 48, 22, 35, 75, 25],
          backgroundColor: "rgb(74, 74, 255)",
        },
        {
          type: "bar",
          backgroundColor: [
            "rgba(255, 99, 132, 0.2)",
            "rgba(255, 159, 64, 0.6)",
            "rgba(255, 205, 86, 0.6)",
            "rgba(75, 192, 192, 0.6)",
          ],
          label: "Bar Dataset",
          data: [10, 20, 30, 40, 25, 75, 68, 25],
        },
      ],
      labels: ["January", "February", "March", "April", "May", "June", "July"],
    },
  });





});
