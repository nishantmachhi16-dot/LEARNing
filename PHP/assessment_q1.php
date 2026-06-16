<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Document</title>

    <style>

body{

background-color:azure;

font-family: 'Courier New', Courier, monospace;

height: 100vh; width: 100vw;

overflow: hidden;

display: flex; justify-content: center; align-items: center;


}

.ore{

background-color: cadetblue;

height: 70vh; width: 80vw;

border: 1px solid black;

display: flex; justify-content: center; align-items: center;

}


input[type=number] , [type=submit]{

height: 4vh; width: 30vw;

text-align: center;

margin-bottom: 1vh;

}

    </style>

</head>
<body>

<div class="ore">

<form action=" <?php htmlspecialchars($_SERVER['PHP_SELF']) ?>" method="post">


<input type="number" placeholder="Enter number for multiplication table : " name="num1" required> <br>

<input type="number" placeholder="Enter the number : " name="num2" required><br>

<input type="number" placeholder="Enter the number : " name="num3" required><br>

<input type="submit" name="submit" value="submit">



</form>


<?php 

if($_SERVER['REQUEST_METHOD'] == 'POST'){

$mul = htmlspecialchars(trim($_POST['num1']));

$num1 = htmlspecialchars(trim($_POST['num2']));

$num2 = htmlspecialchars(trim($_POST['num3']));

if(isset('submit')){






}

}


?>

</div>


</body>
</html>