<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>


<?php 

echo "hello";

$username = "username";
$user_val = "Nishant";

setcookie($username, $user_val, time()+(3600*60));

if (isset($_COOKIE[$username])) {
    echo "The cookie is set :". $username;
    echo "Thw value : ". $_COOKIE[$username];
}else{

echo "error occured";

}


setcookie($username, $user_val, time()-(3600*60));


if (isset($_COOKIE[$username])) {
    echo "The cookie is set :". $username;
    echo "Thw value : ". $_COOKIE[$username];
}else{

echo "cookie is deleted";

}




$username = "username";
$user_val = "RIya";

setcookie($username, $user_val, time()+(3600*60));

if (isset($_COOKIE[$username])) {
    echo "The cookie is set :". $username;
    echo "Thw value : ". $_COOKIE[$username];
}else{

echo "error occured";

}



?>


</body>
</html>