//Strict Login

const username = document.getElementById("userValue");
const password = document.getElementById("passValue");

const loginBtn = document.getElementById("loginBtn");

const resultShow = document.getElementById("resultShow");
const userNameShow = document.getElementById("userNameShow");
const PassShow = document.getElementById("PassShow");

let Login = false;


loginBtn.onclick = function(){

    
while(!Login){

const usernameVal = username.value;
const passwordVal = password.value;


if( usernameVal === "Nishant" && passwordVal === "Nia"){

    document.getElementById("resultShow").textContent = "Your are now Logged In!!";
    document.getElementById("userNameShow").textContent =  `your username : ${usernameVal}`;
    document.getElementById("PassShow").textContent = `your Password : ${passwordVal}`;

    Login = true;


}else{

    document.getElementById("resultShow").textContent = "Invalid Credentials! please log in again!!";

    document.getElementById("userNameShow").textContent = "";
    document.getElementById("PassShow").textContent = "";

    break;

}

}

}


//Multiplication table

const mulTableVal = document.getElementById("mulTableVal");
const mulTableVal2 = document.getElementById("mulTableVal2");
const SubmitValueBtn = document.getElementById("SubmitValueBtn");

const ShowTable1 = document.getElementById("ShowTable1");

SubmitValueBtn.onclick = function(){

    const mulTableValNum =mulTableVal.value;
    const mulTableVal2Num = mulTableVal2.value;
    

    ShowTable1.textContent = "Multiplication value : " + (mulTableValNum * mulTableVal2Num) ;

}




