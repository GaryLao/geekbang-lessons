<head>
<jsp:directive.include file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
	<title>My Home Page</title>
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
</head>
<body>
	<div class="container">
		<form class="form-signin" method="post">
			<h1 class="h3 mb-3 font-weight-normal">注册</h1>

			<label for="username" class="sr-only">用户名</label>
			<input type="text" id="username" name="username" class="form-control" placeholder="请输入用户名" required autofocus>

			<label for="userpassword" class="sr-only">登陆密码</label>
			<input type="password" id="userpassword" name="userpassword" class="form-control" placeholder="请输入登陆密码" required>

			<label for="email" class="sr-only">电子邮件</label>
			<input type="text" id="email" name="email" class="form-control" placeholder="请输入电子邮件" required autofocus>

			<label for="phonenumber" class="sr-only">电话</label>
			<input type="text" id="phonenumber" name="phonenumber" class="form-control" placeholder="请输入电话" required autofocus>
			
			<button class="btn btn-lg btn-primary btn-block" type="submit">提交</button>
			<p class="mt-5 mb-3 text-muted">&copy; 2017-2021</p>
		</form>
	</div>
</body>