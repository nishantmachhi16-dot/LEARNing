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


<?php 

$files ='Student.txt';

$data = "Student name : nishant, Roll no. 90 , Age = 20 , University = MSU ";


$file = fopen($files , 'w');


fwrite($file,$data); 


fclose($file);

echo "file name : Student.txt :- \n" ;


readfile($files);   

?>




</div>

</body>
</html>