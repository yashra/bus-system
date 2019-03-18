<?php
session_start();
$db=mysqli_connect("localhost","root","","testing");
if(isset($_POST['sbut']))
{
$nm=mysql_real_escape_string($_POST['Utxt']);
$ps=mysql_real_escape_string($_POST['Ptxt']);
$cp=mysql_real_escape_string($_POST['CPtxt']);
$em=mysql_real_escape_string($_POST['Etxt']);
$fnm=mysql_real_escape_string($_POST['Ftxt']);
$lnm=mysql_real_escape_string($_POST['Ltxt']);
$gn=mysql_real_escape_string($_POST['Gender']);
if($ps==$cp)
{
	$ps=md5($ps);
	$sql="INSERT INTO test values('$nm','$ps','$em','$fnm','$lnm','$gn')";
	mysqli_query($db,$sql);
	$_SESSION['message']="You are now logged in";
	$_SESSION['Utxt']=$nm;
	header("location:project.php");
}else
{
	$_SESSION['message'] = "The two password do not match";
}
	
}
?>

<!DOCTYPE html>
<html>
<head>
<title>Web Page</title>
<link rel="stylesheet" href="a.css">
</head>
<body>
<h1>Web Form</h1>
<hr />
<br />
<div>
<form name="myform" action="index.php" method="post">
<pre><input type="text" value="" name="Utxt" placeholder="Username"class="xyz"/></pre>
<pre><input type="password"  name="Ptxt" placeholder="Choose your password"/></pre>
<pre><input type="password"  name="CPtxt" placeholder="Confirm password "/></pre>
<pre><input type="Email" value="" name="Etxt" placeholder="Email"/></pre> <br />
<input type="text" value="" name="Ftxt" placeholder="First Name" class="abc"/> &nbsp; 
<input type="text" value="" name="Ltxt" placeholder="Last Name" class="abc" /> <br/>
<pre><select name="Gender">
<option value="" disabled selected hidden>Gender</option>
<option value="Male">Male</option>
<option value="Female">Female</option>
</select></pre>
<center> 
<input type="submit" value="Sign up" name="sbut" onclick="abc();" /> &nbsp; &nbsp;
<input type="button" value="Reset" name="reset" /> &nbsp; &nbsp;
<input type="submit" value="Cancel" name="cancel"/></center>
</form>
</div>
</body>
</html>