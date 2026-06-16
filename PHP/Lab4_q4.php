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

<form action="<?php echo htmlspecialchars($_SERVER['PHP_SELF']) ?>" method="post" enctype="multipart/form-data">

<label for="FileNeeded"> Upload a file : </label> 
<input name="FileNeeded" type="file" >

<input name="submit" type="submit" value="Upload a file">

</form>

</div>

<?php 

if($_SERVER['REQUEST_METHOD'] == 'POST'){

$fileName = $_FILES['FileNeeded']['name'];
$fileSize = $_FILES['FileNeeded']['size'];
$fileType = $_FILES['FileNeeded']['type'];
$fileTmp = $_FILES['FileNeeded']['tmp_name'];

$file_Dir = 'uploads/';


if($fileSize > 50000000){

echo "Please upload file of less than 5MB size";
}

if($fileType != 'jpg' && $fileType != 'png' && $fileType != 'jpeg' && $fileType == 'pdf'){

echo "please upload valid file type : jpg,png,jpeg.";

}



if(file_exists($fileName)){

echo "File already exists";

}

if(!file_exists($fileName)){


move_uploaded_file($fileTmp , $file_Dir.$fileName);

echo "file successfully upoaded";



}


}else{

echo "some Unknown error caused";

}


?>


</body>
</html>