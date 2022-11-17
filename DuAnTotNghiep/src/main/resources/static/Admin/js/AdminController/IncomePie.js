
        app1.controller("IncomeTotal", function () {
          ctx = document.getElementById('productMainChart').getContext('2d');
         



// setup 
const data = {
  labels: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'],
  datasets: [{
    label: 'Weekly Sales',
    data: [18, 12, 6, 9, 12, 3, 9],
    backgroundColor: [
      'rgba(255, 26, 104, 0.2)',
      'rgba(54, 162, 235, 0.2)',
      'rgba(255, 206, 86, 0.2)',
      'rgba(75, 192, 192, 0.2)',
      'rgba(153, 102, 255, 0.2)',
      'rgba(255, 159, 64, 0.2)',
      'rgba(0, 0, 0, 0.2)'
    ],
    borderColor: [
      'rgba(255, 26, 104, 1)',
      'rgba(54, 162, 235, 1)',
      'rgba(255, 206, 86, 1)',
      'rgba(75, 192, 192, 1)',
      'rgba(153, 102, 255, 1)',
      'rgba(255, 159, 64, 1)',
      'rgba(0, 0, 0, 1)'
    ],
    borderWidth: 1
  }]
};

// config 
const config = {
  type: 'pie',
  data,
  options: {
    scales: {
      y: {
        beginAtZero: true
      }
    },
    plugins:{
      tooltip:{
        enable:false
      },
      datalabels:{
        formatter:(value,context)=>{
          const datapoints = context.chart.data.datasets[0].data;
          function totalSum(total,datapoint){
            return total +datapoint;
          }
          const totalvalue =datapoints.reduce(totalSum,0)
          const percentageValue =(value/totalvalue *100).toFixed(1)
          // const display =[value,percentageValue]
          const display =[value,percentageValue]
          return value+" - "+percentageValue+"%"
        }
      }
    }
  },
  plugins:[ChartDataLabels]
};

// render init block
const myChart = new Chart(
  ctx,
  config
);











          // const myChart = new Chart(ctx, {
          //   type: 'doughnut',
          //   plugin:[ChartDataLabels],
          //   options:{
          //   cutout: '40',// pie > doughnot
          // },
          //   data: {
          //     labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
          //     datasets: [{//Dữ liệu 
          //       label: 'Table name',
          //       fill: {
          //         target: 'origin',
          //         above: '#333',
          //         below: '#000'
          //       },
          //       data: [12, 19, 3, 5, 2, 3],
          //       backgroundColor: [
          //         'rgba(255, 99, 132, 0.8)',
          //         'rgba(54, 162, 235, 0.8)',
          //         'rgba(255, 206, 86, 0.8)',
          //         'rgba(75, 192, 192, 0.8)',
          //         'rgba(153, 102, 255, 0.8)',
          //         'rgba(255, 159, 64, 0.8)'
          //       ],
          //       borderColor: [
          //         'rgba(255, 99, 132, 1)',
          //         'rgba(54, 162, 235, 1)',
          //         'rgba(255, 206, 86, 1)',
          //         'rgba(75, 192, 192, 1)',
          //         'rgba(153, 102, 255, 1)',
          //         'rgba(255, 159, 64, 1)'
          //       ],
          //       borderWidth: 1,
          //       hoverBorderWidth: 3,
          //       hoverBorderColor: '#FFF',
          //     }]
          //   },
           
          // });
        })
  
  