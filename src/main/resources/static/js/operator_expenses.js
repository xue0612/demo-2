$(function(){
	var name = sessionStorage.getItem("name");
	$(".name").text(name);
})
$(".user-arrow-down").on("click", function () {
    if ($(".dropdown").is(":hidden")) {
        $(".dropdown").show();
    } else {
        $(".dropdown").hide();
    }
})
$(".business-order").on("click", function () {
    $(".main-content").show();
    $("table").show();
    $(".main-pagination").show();
    $(".main-sercive").hide();
    $(".business-order").addClass("border-red");
    $(".service-order").removeClass("border-red");
    $(".main-top li").eq(3).text("支付中心");
})
$(".service-order").on("click", function () {
    $(".main-content").hide();
    $("table").hide();
    $(".main-pagination").hide();
    $(".main-sercive").show();
    $(".service-order").addClass("border-red");
    $(".business-order").removeClass("border-red");
    $(".main-top li").eq(3).text("结算中心");
})
$(".search li").eq(0).on("click", function () {
    $(".search li").removeClass("font-red");
    $(this).addClass("font-red");
    var b = new Date();
	var a =  new Date();
	var startdate = new Date(a.getTime() + 24*60*60*1000);
	var enddate = new Date(b.getTime());
	startdate = dateFormatDay(startdate);
	enddate = dateFormatDay(enddate);
	$.ajax({
		url:"query",
		type:"get",
		data:{
			startdate: startdate,
			enddate: enddate,
		},
		success: function(data){
			$("tbody").remove();
			for(var i=0; i<data.xdOrderList.length; i++){
				var strDate = data.xdOrderList[i].ts;
			    
			    var ts = new Date(strDate).Format("yyyy-M-d");
				var txt = `<tbody>
				<tr>
                    <td>${data.xdOrderList[i].boughtUser}</td>
                    <td>${ts}</td>
                    <td>${data.xdOrderList[i].orderNumber}</td>
                    <td>${data.xdOrderList[i].orderPrice}</td>
                    <td>${data.xdOrderList[i].pay}</td>
                    <td>${data.xdOrderList[i].orderInfo}</td>
                    </tr>
                    </tbody>
                    `;
					$("thead").after(txt);
					
			}

		},
		error: function(){
			console.log("失败")
		}
	})
})
$(".search li").eq(1).on("click", function () {
    $(".search li").removeClass("font-red");
    $(this).addClass("font-red");
    var a =  new Date();
	var startdate = new Date(a.getTime() + 24*60*60*1000);
	startdate = dateFormatDay(startdate);
	var enddate = getSevenFormatDate();
	$.ajax({
		url:"query",
		type:"get",
		data:{
			startdate: startdate,
			enddate: enddate,
		},
		success: function(data){
			$("tbody").remove();
			for(var i=0; i<data.xdOrderList.length; i++){
				var strDate = data.xdOrderList[i].ts;
			    
			    var ts = new Date(strDate).Format("yyyy-M-d");
				var txt = `<tbody>
				<tr>
                    <td>${data.xdOrderList[i].boughtUser}</td>
                    <td>${ts}</td>
                    <td>${data.xdOrderList[i].orderNumber}</td>
                    <td>${data.xdOrderList[i].orderPrice}</td>
                    <td>${data.xdOrderList[i].pay}</td>
                    <td>${data.xdOrderList[i].orderInfo}</td>
                    </tr>
                    </tbody>
                    `;
					$("thead").after(txt);
					
			}

		},
		error: function(){
			console.log("失败")
		}
	})
})
$(".search li").eq(2).on("click", function () {
    $(".search li").removeClass("font-red");
    $(this).addClass("font-red");
    var a =  new Date();
	var startdate = new Date(a.getTime() + 24*60*60*1000);
	startdate = dateFormatDay(startdate);
	var enddate = getmonthFormatDate();
	$.ajax({
		url:"query",
		type:"get",
		data:{
			startdate: startdate,
			enddate: enddate,
		},
		success: function(data){
			$("tbody").remove();
			for(var i=0; i<data.xdOrderList.length; i++){
				var strDate = data.xdOrderList[i].ts;
			    
			    var ts = new Date(strDate).Format("yyyy-M-d");
				var txt = `<tbody>
				<tr>
                    <td>${data.xdOrderList[i].boughtUser}</td>
                    <td>${ts}</td>
                    <td>${data.xdOrderList[i].orderNumber}</td>
                    <td>${data.xdOrderList[i].orderPrice}</td>
                    <td>${data.xdOrderList[i].pay}</td>
                    <td>${data.xdOrderList[i].orderInfo}</td>
                    </tr>
                    </tbody>
                    `;
					$("thead").after(txt);
					
			}

		},
		error: function(){
			console.log("失败")
		}
	})
})
$(".search li").eq(3).on("click", function () {
    $(".search li").removeClass("font-red");
    $(this).addClass("font-red");
	$.ajax({
		url:"queryall",
		type:"get",
		success: function(data){
			$("tbody").remove();
			for(var i=0; i<data.xdOrderList.length; i++){
				var strDate = data.xdOrderList[i].ts;
			    
			    var ts = new Date(strDate).Format("yyyy-M-d");
				var txt = `<tbody>
				<tr>
                    <td>${data.xdOrderList[i].boughtUser}</td>
                    <td>${ts}</td>
                    <td>${data.xdOrderList[i].orderNumber}</td>
                    <td>${data.xdOrderList[i].orderPrice}</td>
                    <td>${data.xdOrderList[i].pay}</td>
                    <td>${data.xdOrderList[i].orderInfo}</td>
                    </tr>
                    </tbody>
                    `;
					$("thead").after(txt);
					
			}

		},
		error: function(){
			console.log("失败")
		}
	})
})

$(function(){
	$.ajax({
		// 请求类型
		type : "get",
		// 请求路径
		url : "ope_saveimg",
		// 请求参数
		// 返回数据类型
		// 请求成功后调用函数
		success : function(data) {
			console.log("成功后返回数据", data);
			var id = sessionStorage.getItem("id");
			var imgPath = "./ope_headImg?id="+id;
			$("#abc").val(id);
			$("#aaa").attr("src",imgPath);
		},
		// 请求失败后调用函数
		error : function(data) {
			console.log("失败后返回数据", data);
		}
	})
	
	$("td[name='ts']").each(function(){
		var strDate = $(this).text();//获取td标签里面的内容 如果获取不到改成 .html()
		
		if(null==strDate || ""==strDate){
			strDate = "";
	    }
	    var dateStr=strDate.trim().split(" ");
	    var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";
	    var date = new Date(Date.parse(strGMT));
	    var y = date.getFullYear();
	    var m = date.getMonth() + 1;  
	    m = m < 10 ? ('0' + m) : m;
	    var d = date.getDate();  
	    d = d < 10 ? ('0' + d) : d;
	    var h = date.getHours();
	    var minute = date.getMinutes();  
	    minute = minute < 10 ? ('0' + minute) : minute;
	    var second = date.getSeconds();
	    second = second < 10 ? ('0' + second) : second;
	    strDate = y+"-"+m+"-"+d+" "+h+":"+minute+":"+second;
		
		$(this).text(new Date(strDate).Format("yyyy-M-d"));
	});
})

Date.prototype.Format = function(fmt)   
    {
      var o = {   
        "M+" : this.getMonth()+1,                 //月份   
        "d+" : this.getDate(),                    //日   
        "h+" : this.getHours(),                   //小时   
        "m+" : this.getMinutes(),                 //分   
        "s+" : this.getSeconds(),                 //秒   
        "q+" : Math.floor((this.getMonth()+3)/3), //季度   
        "S"  : this.getMilliseconds()             //毫秒   
      };   
      if(/(y+)/.test(fmt))   
        fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));   
      for(var k in o)   
        if(new RegExp("("+ k +")").test(fmt))   
      fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));   
      return fmt;   
    }

function dateFormatDay(date){  //时间戳为10位需*1000，时间戳为13位的话不需乘1000
    var Y = date.getFullYear() + '-';
    var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
    var D = (date.getDate() < 10 ? '0'+date.getDate() : date.getDate()) + ' ';
    return Y + M + D ;
}

function getNowFormatDate() {
         var date = new Date();
         var seperator1 = "-";
         var year = date.getFullYear();
         var month = date.getMonth() + 1;
         var strDate = date.getDate();
         if (month >= 1 && month <= 9) {
             month = "0" + month;
         }
         if (strDate >= 0 && strDate <= 9) {
             strDate = "0" + strDate;
         }
         var currentdate = year + seperator1 + month + seperator1 + strDate;
         return currentdate;
     }

function getSevenFormatDate() {
	var startTime = new Date();
	console.log(startTime);
	var SevenDayAgo = new Date(startTime.getTime() - 168*60*60*1000);
	console.log(SevenDayAgo);
	SevenDayAgo = dateFormatDay(SevenDayAgo);
    return SevenDayAgo;
}

function getmonthFormatDate() {
	var startTime = new Date();
	var SevenDayAgo = new Date(startTime.getTime() - 720*60*60*1000);
	SevenDayAgo = dateFormatDay(SevenDayAgo);
    return SevenDayAgo;
}
