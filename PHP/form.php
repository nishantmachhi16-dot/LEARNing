<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=
    
    , initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    

<div class="subbody">
    <form action="<?php htmlspecialchars($_SERVER['PHP_SELF']) ?>" method="post">

<input type="text" name="name" placeholder="enter name">

<input type="text" name="lname" placeholder="enter last name">

<input type="submit">

    </form>
</div>


<?php 

if($_SERVER['REQUEST_METHOD'] == "POST"){

$name = htmlspecialchars(trim($_REQUEST['name']));
$lname = htmlspecialchars(trim($_REQUEST['lname']));

if(
setcookie('username',$name,time()+3600)
){

echo "Cookie is set";

}


if(setcookie('username',$name,time()-3600)){

echo "Cookie is deleted";

}



session_start();

$_SESSION['bestname'] = $name;

echo $_SERVER['bestname'];

if(session_destroy()){

echo "session destroyed";

}else{

echo "not destroyed";


}


}




?>

</body>
</html>