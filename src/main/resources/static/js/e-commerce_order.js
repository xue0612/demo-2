$(function(){
	var name = sessionStorage.getItem("userName");
	$(".username").text(name);
})

$(function() {
	$.ajax({
		// 请求类型
		type : "get",
		// 请求路径
		url : "e_numshow",
		// 请求参数
		// 返回数据类型
		// 请求成功后调用函数
		success : function(data) {
			$(".shopnum").text(data.num);
		},
		error : function(data) {
			console.log("失败后返回数据", data);
		}
	})
	
	$("div[name='ts']").each(function(){
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

Date.prototype.Format = function(fmt) {
	console.log("------"+fmt+"----"+this);
      var o = {   
        "M+" : this.getMonth()+1,                 //月份   
        "d+" : this.getDate(),                    //日   
        "h+" : this.getHours(),                   //小时   
        "m+" : this.getMinutes(),                 //分   
        "s+" : this.getSeconds(),                 //秒   
        "q+" : Math.floor((this.getMonth()+3)/3), //季度   
        "S"  : this.getMilliseconds()             //毫秒   
      };  
      console.log("0000",fmt,o["M+"],o["+"]);
      if(/(y+)/.test(fmt)){    	  
    	  fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));  
    	  console.log("1111",fmt)
      }
      for(var k in o){
    	  console.log("kkkk==	",k)
    	  if(new RegExp("("+ k +")").test(fmt)){
    		  fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));     		  
    		  console.log("2222",fmt)	
    	  } 
      }
      return fmt;   
    }

$(".search-product").on("click", function(){
    $(".search-product").addClass("font-aqua");
    $(".search-service").removeClass("font-aqua");
})
$(".search-service").on("click", function(){
    $(".search-service").addClass("font-aqua");
    $(".search-product").removeClass("font-aqua");
})

$(".banner a").on("click", function(event){
    $(".banner a").removeClass("border-b");
    $(event.target).addClass("border-b");
})

$(".user-action a").on("click", function(event){
    $(".user-action a").removeClass("bg-gray");
    $(event.target).addClass("bg-gray");
})
function pay(){
    location.href="e-commerce_settlement.html";
}

$(".search-btn").on("click", function(event){
    var id=$(".bxx").val();
    console.log(id);
    location.href="./e_order?id="+id;
})
//$(function(){
//	var id = sessionStorage.getItem("id");
//	console.log(id)
//　　  $.ajax({
//		// 请求类型
//		type:"get",
//		// 请求路径
//		url:"/buyuser/getorderlist",
//		// 请求参数
//		
//		   data:{ name:name, },
//		 
//		// 返回数据类型
//		dataType:"json",
//		// 请求成功后调用函数
//		success:function(data){
//			console.log("成功后返回的数据",data);
//			var orderList =data.orderList
//		console.log(orderList)
//			var txt="";
//			for(var i=0;i<orderList.length;i++){
//			
//				txt +=`
//				
//				  <div class="orders">
//                    <div class="order-num">订单号：${orderList[i].id} 下单时间：${orderList[i].ts}</div>
//                    <ul class="order-details">
//                        <li>
//                            <img src="./images/user-lg.png" alt="图片">
//                            <ul>
//                                <li>${orderList[i].orderContent}</li>
//                               
//                            </ul>
//                            <p>${orderList[i].orderPrice}</p>
//                            <p>1</p>
//                        </li>
//                        <li class="font-aqua">${orderList[i].orderPrice}</li>
//                      
//                    </ul>
//                </div>
//				`;
//				
//			}
//			var txt1="";
//			var txt2="";
//			for(var i=0;i<orderList.length;i++){
//				if(+orderList[i].state == 0){
//					txt1 +=`
//				<li class="font-aqua">未付款</li>
//                <li>
//                    <p><a href="re?page=e-commerce_settlement.html">付款</p>
//                    <span class="delete" >删除订单</span>
//                </li>`;
//                }else{
//                	txt2 +=`
//                	<li class="font-aqua">已付款</li>
//                	<li>
//                	<span class="delete" >删除订单</span>
//                	</li>`;
//                }
//			}
//			console.log(txt);
//			$(".content-right").append(txt); 
//			$(".order-details").append(txt1);
//			$(".order-details").append(txt2);
//			
//		},
//		// 请求成功后调用函数
//		error:function(data){
//			console.log("失败后返回的数据",data);
//		}
//	})
//
//　　});





function deleteOrder(id){
	console.log("----",id);
	$.ajax({
		//请求类型
		type:"post",
		//请求路径
		url:"order_delete",
		//请求参数
		data:{
			id:id,
		},
		//返回数据类型
		//请求成功后调用函数
		success: function(data){
			console.log("成功后返回数据",data);
			if(data.code == "success"){
				location.href = "./e_order"
			}
			else if(data.code == "false"){
				alert("删除失败!");	
			}
			
		},
		error: function(data){
			console.log("失败后返回数据",data);
		}
	})
}
