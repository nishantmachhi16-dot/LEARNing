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


pre{

width: 100vw; height: 100vh;

display: flex; justify-content: center; align-items: center;

}



    </style>

</head>
<body>
   
<pre>

<?php 

$file_Name = "Exists.txt";


if(file_exists($file_Name)){


echo "The file Already exists.";

}else{

echo "The file does not exists.";

}


?>

</pre>

</body>
</html>