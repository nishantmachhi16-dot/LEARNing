<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Document</title>

    <style>

body{

    background-color: lightblue;

}

    </style>

</head>
<body>


<pre>

<?php 

if (filter_var("email",FILTER_VALIDATE_EMAIL)) {
    # code... 
    echo "truje";
} else {
    # code...
    echo "Fakse";
}


function prime_or_not($num){

if($num <= 1){

    return false;

}
for($i=2; $i<$num; $i++){

    if($num % $i == 0){

        return false;

    }

}
    return true;

}


$number = 61;

if(prime_or_not($number)){

    echo "is prime";

}
else{

    echo "not prime"; 

}



?>

</pre>


    
</body>
</html>