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

$file_Name = "Append.text";

$txt = "Appending data in the file";

$append_File = fopen($file_Name , "w") or die("Unexpected error caused."); 


if($append_File){

fwrite($append_File , $txt);
fclose($append_File);

echo "the data from the file is successfully appended.";

}else{

echo "the data is failed to appended.";

}


?>

</pre>

</body>
</html>