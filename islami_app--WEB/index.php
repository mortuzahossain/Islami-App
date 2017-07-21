<!DOCTYPE html>
<html>
<head>
	<title>Islami App</title>
	<meta charset="utf-8">
	<meta http-equiv="refresh" content="30" >
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="style.css">
	<link href="https://fonts.googleapis.com/css?family=Changa:700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Galada" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">
</head>
<body>
<?php
	require_once 'connection.php';
	mysqli_set_charset($conn,'utf8');
	$query = "SELECT * FROM ayahs ORDER BY rand() LIMIT 1";
	$result = mysqli_query($conn,$query)->fetch_assoc();
?>


<div class="fullscreen background">
    <div class="content-a">
        <div class="content-b">
        	<div class="container">
        		<div class="row">
			        <div class="col-md-12">
			        	<h1><?php echo $result['ayah']; ?></h1>
						<h2><?php echo $result['translate']; ?></h2>
						<p><?php echo $result['location']; ?></p>
			        </div>	
        		</div>
        	</div>
        </div>
    </div>
</div>

</body>
</html>