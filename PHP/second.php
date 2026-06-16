<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>

body{

    background-color: white;

}        


.subbody{

width: 100vw; height: 100vh;

display: flex; justify-content: center; align-items: center;

}



    </style>

</head>
<body>
   
<div class="subbody">


<?php error_reporting( E_ERROR ); 
function handleError($errno, $errstr,$error_file,$error_line) { 
echo "<b>Error:</b> [$errno] $errstr - $error_file:$error_line"; 
echo "<br />"; 
echo "Terminating PHP Script"; 
die(); }
?>


<?php

$file = fopen("B1","w") or die("could not open");

fwrite($file, "hello bunch of idiot");

fclose($file);



$file = fopen("B1","r");

echo fread($file, filesize("B1"));

fclose($file);






?>






</div>

</body>
</html>