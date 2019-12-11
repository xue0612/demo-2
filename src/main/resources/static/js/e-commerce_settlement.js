$(".payment li").eq(1).on("click", function(){
    location.href="./e_order";
})
$(function(){
	var name = sessionStorage.getItem("userName");
	$(".username").text(name);
})

$(document)
		.ready(
				function() {
					var pcount = $('#count').val();
					var psize = $('#pageSize').val();
					var pstart = $('#pageStart').val();
					var prodcutName = $('#prodcutName').val();
					var nowpage = Math.floor(pstart / psize) + 1;
					var cpage = Math.ceil(pcount / psize);
					var strhtml = "";

					if (cpage <= 10) {
						for (var i = 1; i <= cpage; i++) {
							if (i == nowpage) {
								strhtml += '<a href=./e_product?pageStart='
										+ psize
										* (i - 1)
										+ '&prodcutName='
										+ prodcutName
										+ ' style="background-color:#aaaaaa;font-weight:700">'
										+ i + '</a>';
							} else {
								strhtml += '<span> <a href=./e_product?pageStart='
										+ psize
										* (i - 1)
										+ '&prodcutName='
										+ prodcutName
										+ '>'
										+ i + '</a></span>';
							}
						}
					} else if (cpage > 10) {

						if (1 <= nowpage && nowpage <= 6) {

							for (var i = 1; i <= 10; i++) {

								if (i == nowpage) {
									strhtml += '<a href=./e_product?pageStart='
											+ psize
											* (i - 1)
											+ '&prodcutName='
											+ prodcutName
											+ ' style="background-color:#aaaaaa;font-weight:700">'
											+ i + '</a>';
								} else {
									strhtml += '<span> <a href=./e_product?pageStart='
											+ psize
											* (i - 1)
											+ '&prodcutName='
											+ prodcutName
											+ '>' + i + '</a></span>';
								}
							}
						} else if (nowpage <= cpage - 4) {

							for (var i = nowpage - 5; i <= nowpage + 4; i++) {

								if (i == nowpage) {
									strhtml += '<a href=./e_product?pageStart='
											+ psize
											* (i - 1)
											+ '&prodcutName='
											+ prodcutName
											+ ' style="background-color:#aaaaaa;font-weight:700">'
											+ i + '</a>';
								} else {
									strhtml += '<span> <a href=./e_product?pageStart='
											+ psize
											* (i - 1)
											+ '&prodcutName='
											+ prodcutName
											+ '>' + i + '</a></span>';
								}

							}
						} else if (cpage - 4 < nowpage && nowpage <= cpage) {

							for (var i = cpage - 9; i <= cpage; i++) {

								if (i == nowpage) {
									strhtml += '<a href=./e_product?pageStart='
											+ psize
											* (i - 1)
											+ '&prodcutName='
											+ prodcutName
											+ ' style="background-color:#aaaaaa;font-weight:700">'
											+ i + '</a>';
								} else {
									strhtml += '<span> <a href=./e_product?pageStart='
											+ psize
											* (i - 1)
											+ '&prodcutName='
											+ prodcutName
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