$(function() {
	var name = sessionStorage.getItem("userName");
	$(".username").text(name);
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
})

$(".search-product").on("click", function() {
	$(".search-product").addClass("font-aqua");
	$(".search-service").removeClass("font-aqua");
})
$(".search-service").on("click", function() {
	$(".search-service").addClass("font-aqua");
	$(".search-product").removeClass("font-aqua");
})

$(".banner a").on("click", function(event) {
	$(".banner a").removeClass("border-b");
	$(event.target).addClass("border-b");
})

$(".content-nav li").on("click", function(event) {
	$(".content-nav a").removeClass("nav-active");
	$(event.target).addClass("nav-active");
})

$(".search-btn").on("click", function(event) {
	var id = $(".search input").val();
	location.href = "./e_shoppingcar?id=" + id;
})
$(document)
		.ready(
				function() {
					var pcount = $('#count').val();
					var psize = $('#pageSize').val();
					var pstart = $('#pageStart').val();
					var id = $('#id').val();
					var nowpage = Math.floor(pstart / psize) + 1;
					var cpage = Math.ceil(pcount / psize);
					var strhtml = "";

					if (cpage <= 10) {
						for (var i = 1; i <= cpage; i++) {
							if (i == nowpage) {
								strhtml += '<a href=./e_shoppingcar?pageStart='
										+ psize
										* (i - 1)
										+ '&id='
										+ id
										+ ' style="background-color:#aaaaaa;font-weight:700">'
										+ i + '</a>';
							} else {
								strhtml += '<span> <a href=./e_shoppingcar?pageStart='
										+ psize
										* (i - 1)
										+ '&id='
										+ id
										+ '>'
										+ i + '</a></span>';
							}
						}
					} else if (cpage > 10) {

						if (1 <= nowpage && nowpage <= 6) {

							for (var i = 1; i <= 10; i++) {

								if (i == nowpage) {
									strhtml += '<a href=./e_shoppingcar?pageStart='
											+ psize
											* (i - 1)
											+ '&id='
											+ id
											+ ' style="background-color:#aaaaaa;font-weight:700">'
											+ i + '</a>';
								} else {
									strhtml += '<span> <a href=./e_shoppingcar?pageStart='
											+ psize
											* (i - 1)
											+ '&id='
											+ id
											+ '>' + i + '</a></span>';
								}
							}
						} else if (nowpage <= cpage - 4) {

							for (var i = nowpage - 5; i <= nowpage + 4; i++) {

								if (i == nowpage) {
									strhtml += '<a href=./e_shoppingcar?pageStart='
											+ psize
											* (i - 1)
											+ '&id='
											+ id
											+ ' style="background-color:#aaaaaa;font-weight:700">'
											+ i + '</a>';
								} else {
									strhtml += '<span> <a href=./e_shoppingcar?pageStart='
											+ psize
											* (i - 1)
											+ '&id='
											+ id
											+ '>' + i + '</a></span>';
								}

							}
						} else if (cpage - 4 < nowpage && nowpage <= cpage) {

							for (var i = cpage - 9; i <= cpage; i++) {

								if (i == nowpage) {
									strhtml += '<a href=./e_shoppingcar?pageStart='
											+ psize
											* (i - 1)
											+ '&id='
											+ id
											+ ' style="background-color:#aaaaaa;font-weight:700">'
											+ i + '</a>';
								} else {
									strhtml += '<span> <a href=./e_shoppingcar?pageStart='
											+ psize
											* (i - 1)
											+ '&id='
											+ id
											+ '>' + i + '</a></span>';
								}
							}
						} else {
							console.error(00000000);
						}
					} else {
						console.error(00000000);
					}
					$("#mydiv").html(strhtml);

				});

function deletes(id) {
	console.log("----", id);
	$.ajax({
		// 请求类型
		type : "post",
		// 请求路径
		url : "e_delete",
		// 请求参数
		data : {
			id : id,
		},
		// 返回数据类型
		// 请求成功后调用函数
		success : function(data) {
			console.log("成功后返回数据", data);
			if (data.code == "success") {
				location.href = "./e_shoppingcar"
			} else if (data.code == "false") {
				alert("删除失败!");
			}

		},
		error : function(data) {
			console.log("失败后返回数据", data);
		}
	})
}

// 对商品进行累加操作

// 对商品进行累减操作
$(".min").click(function() {
	var t = $(this).parent().find('input[class*=text_box]');
	if (t.val() == "" || undefined || null) {
		t.val(0);
	}
	t.val(parseInt(t.val()) - 1)
	if (parseInt(t.val()) < 0) {
		t.val(0);
	}
})
$(".text_box").keyup(function() {
	var t = $(this).parent().find('input[class*=text_box]');
	if (parseInt(t.val()) == "" || undefined || null || isNaN(t.val())) {
		t.val(0);
	}
})

function addnum(id) {
	var e = window.event;

	var num = +$(e.target).prev().val() + 1;
	$(e.target).prev().val(num);
	console.log("取回的数值为", num);
	$.ajax({
		// 请求类型
		type : "post",
		// 请求路径
		url : "shoppingcaradd",
		// 请求参数
		data : {
			num : num,
			id : id,
		},
		// 返回数据类型
		dataType : "json",
		// 请求成功后调用函数
		success : function(data) {

			if ($(e.target).next().val() <= 1) {
				alert("数量不能小于1");
			} else {

				$(e.target).prev().val(num);
				location.href = "./e_shoppingcar"

			}
		},
		error : function(data) {
			console.log("失败后返回的数据", data);
		}
	})

}

function reducenum(id) {
	var e = window.event;
	var num = $(e.target).next().val() - 1;
	console.log("取回的数值为", num);
	$.ajax({
		// 请求类型
		type : "post",
		// 请求路径
		url : "shoppingcarre",
		// 请求参数
		data : {
			num : num,
			id : id,
		},
		// 返回数据类型
		dataType : "json",
		// 请求成功后调用函数
		success : function(data) {

			if ($(e.target).next().val() < 1) {
				alert("数量不能小于1");
				$(e.target).next().val(1);
			} else {
				$(e.target).next().val(num);
				location.href = "./e_shoppingcar"
			}
		},
		error : function(data) {
			console.log("失败后返回的数据", data);
		}
	})
}

function changenum(id) {
	console.log("失焦触发");
	var e = window.event;
	console.log("=====", id);
	var num = $(e.target).val();
	$.ajax({
		// 请求类型
		type : "post",
		// 请求路径
		url : "shopcount",
		// 请求参数
		data : {
			num : num,
			id : id,
		},
		// 返回数据类型
		dataType : "json",
		// 请求成功后调用函数
		success : function(data) {
			if ($(e.target).val() < 1) {
				alert("数量不能小于1");
				$(e.target).val(1);
			} else if (data.code == 1) {
				location.href = "./e_shoppingcar"
			} else {
				alert("修改失败");
			}

		},
		error : function(data) {
			console.log("失败后返回的数据", data);
		}
	})

	console.log($(e.target).val());
}