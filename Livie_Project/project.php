<?php
session_start();
?>


<!DOCTYPE html>
<html>
<head>
<title>Web Page</title>
<link rel="stylesheet" href="a.css">
</head>
<body>
<div>
<h4>Welcome <?php echo $_SESSION['Utxt'];?></div>
<a href="index.php"><p>Click the link to go back to home page</a></p>
</body>
</html>