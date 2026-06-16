<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
<?php 

session_start();

$_SESSION['favcolor'] = "green";
$car = $_SESSION['cr'] = 'merc';

if (isset($_SESSION['favcolor'])) {

echo $_SESSION['favcolor'];
echo "</br>".$car;

}

if (session_unset()) {
    echo "delteed";
}

if (session_destroy()) {
    echo "</br>". "session destroyed";
}

?>


</body>
</html>