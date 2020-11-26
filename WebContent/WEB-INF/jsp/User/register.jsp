<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Bootstrap Sample</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<div class="container">
<form action="./user" method="post">
<dl>
	<dt><label for="userId" class="control-label">ユーザーID：</label></dt>
	<dd><input type="text" class="form-control input-sm" name="userId" value="" placeholder="希望IDを入力" /></dd>
	<dt><label for="userPass" class="control-label">パスワード：</label></dt>
	<dd><input type="password" class="form-control input-sm" name="userPass" value="" /></dd>
	<dt><label for="userName" class="control-label">お名前：</label></dt>
	<dd><input type="text" class="form-control input-sm" name="userName" value="" placeholder="本名を入力" /></dd>
</dl>
<input type="submit" name="register" value="新規登録" class="btn btn-success" />
<input type="reset" name="" value="キャンセル" class="btn btn-danger" />
</form>
</div>
</body>
</html>