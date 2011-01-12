$(document)
		.ready(function() {

			// 注册时验证用户名
				$("#userName")
						.blur(function() {
							var reg = /^[a-zA-Z0-9]{1}[a-zA-Z0-9_]{3,15}$/;
							var uname = $(this).val();
							// alert(reg);
								var view = $("#userNameInfo");
								if (uname == "") {
									view
											.html("\u8bf7\u8f93\u5165\u7528\u6237\u540d");// 请输入用户名
									return false;
								} else {
									if (reg.test(uname) == 0) {
										view.html("");
										view
												.html("\u7528\u6237\u540d\u683c\u5f0f\u9519\u8bef"); // 用户名格式错误
										return false;
									} else {
										$.post("userTable_checkUser.action", {
											uname : uname
										}, function(response) {
											// document.getElementById("nameisOkOrNo").innerHTML="dd";
												$("#nameisOkOrNo").html(
														response);
												alert("a");
											});
									}
									view.html("");
								}
							});

				// 注册验证密码
				$("#password")
						.blur(function() {
							var reg = /^\w{6,20}$/;
							var obj = $(this).val();
							var view = $("#passwordInfo");
							if (obj == "") {
								view.html("\u8bf7\u8f93\u5165\u5bc6\u7801"); // 请输入密码
								return false;
							}
							if (reg.test(obj) == 0) {
								view
										.html("\u8bf7\u8f93\u51656~20\u4f4d\u7684\u5bc6\u7801"); // 请输入6~20位的密码
								return false;
							}
							view.html("");
							return true;
						});

				// 注册验证重复密码
				$("#repeatPassword")
						.blur(
								function() {
									var obj = $("#password").val();
									var obj1 = $(this).val();
									var view = $("#repeatPasswordInfo");
									if (obj != obj1) {
										view
												.html("\u4e24\u6b21\u5bc6\u7801\u4e0d\u540c\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165"); // 两次密码不同，请重新输入
										return false;
									}
									view.html("");
									return true;
								});

				// 注册验证Email
				$("#email").blur(function() {
					var reg = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
					var obj = $("#email").val();
					var view = $("#emailInfo");
					if (obj == "") {
						view.html("Email\u4e0d\u80fd\u4e3a\u7a7a!"); // Email不能为空!
						return false;
					}
					if (reg.test(obj) == 0) {
						view.html("Emial\u683c\u5f0f\u9519\u8bef\uff01"); // Emial格式错误！
						return false;
					}
					view.html("");
					return true;
				});
			});
