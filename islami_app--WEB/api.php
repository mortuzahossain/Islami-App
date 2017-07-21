<?php
	require_once 'connection.php';
	mysqli_set_charset($conn,'utf8');
	$query = "SELECT * FROM ayahs ORDER BY rand() LIMIT 1";
	$result = mysqli_query($conn,$query);
	$result_array[] = mysqli_fetch_array($result);
	print(json_encode($result_array,JSON_UNESCAPED_UNICODE));
?>

<!DOCTYPE html>
<html>
<head>
	<title></title>
	<meta charset="utf-8">
</head>
<body>

</body>
</html>