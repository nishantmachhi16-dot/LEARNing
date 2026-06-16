
let a = 100;
let b = 10;

if (a>b) {
    
    console.log(`${a} is greater than ${b}`);

}else{

    console.log(`${a} is not greatewr than ${b}`);

}

for (let i = 0; i < 5; i++){
 
console.log(`${b} is not the one`);
    
}

//  window.prompt("enter the name");


console.log(Boolean(a>b));

let username ;

document.getElementById("submit").onclick = function(){

     username = document.getElementById("name").value;
     
     password = document.getElementById("password").value;

    document.getElementById("h1").textContent= `the username : ${username}`;
    document.getElementById("h2").textContent= `Password: ${password}`;

}

let name = "NIApoliton";
let num = 100;
let bool = "true";

let newName = String(name);

let newNum = Number(num);

let newbool = Boolean(bool);

console.log(newName , typeof newName)

console.log(newNum , typeof newNum)

console.log(newbool , typeof newbool)


let radius;
const PI = 3.14;
let cir ;

document.getElementById("mysubmit").onclick = function(){

    radius = document.getElementById("radius").value;
    radius = Number(radius);
    cir = 2 * PI * radius;
    document.getElementById("a1").textContent = cir;
    console.log(cir);

}


const countlabel = document.getElementById("num");
const decreasebtn = document.getElementById("decreasebtn");
const increasebtn = document.getElementById("increasebtn");
const resetbutton = document.getElementById("resetbtn");
let count = 0;


decreasebtn.onclick = function(){

    count--
    countlabel.textContent = count;

}


increasebtn.onclick = function(){

    count++
    countlabel.textContent = count;

}


resetbutton.onclick = function(){

    count =0;
    countlabel.textContent = count;

}

let num22 = 20.435;

console.log(Math.floor(num22));

console.log(Math.abs(num22));


//random num

const randNumGenBtn = document.getElementById("randNumGen");
const randNumShow = document.getElementById("randNum");

const min = 0;
const max =100;

let randNum;

randNumGenBtn.onclick = function(){

    randNum = Math.floor(Math.random() * (max-min)) + min;
    randNumShow.textContent = "The random number : " + randNum;

}


// checking the age

    const ageBtn = document.getElementById("ageBtn");
    const ageValue = document.getElementById("enterAge");
    const showAge = document.getElementById("showAge");
    const showLicense = document.getElementById("showLicensee");
    
    let numAge;

    const license = false;

    ageBtn.onclick = function(){

        numAge = ageValue.value;
        numAge = Number(numAge);

        if(numAge > 18){

            showAge.textContent = `you are above 18, you can enter tha site`;

            if (license) {
                
             showLicense.textContent = `you do have your License!`;

            } else {

             showLicense.textContent = `you do not have license yet!`;

                
            }


        }else if(numAge == 0 ) {
        
            showAge.textContent = `YOur are just BORN, Go and freaking study MF!`;


        }else{

            showAge.textContent = `you are NOT above 18, you can not enter tha site`;

        }


    }


    //checked  or not

    const studentCheck = document.getElementById("studentCheckBox");
    const divAStud = document.getElementById("divAStud");
    const divBStud = document.getElementById("divBStud");

    const showStudent = document.getElementById("showStudent");

    const teacherCheck = document.getElementById("teacherCheckBox");
    const divATeach= document.getElementById("divATeach");
    const divBTeach = document.getElementById("divBTeach");

    const showTeacher = document.getElementById("showTeacher");

    const submitInfo = document.getElementById("submitInfo");


    submitInfo.onclick = function(){

        if (studentCheck.checked) {
            
            let divAstudcheck = divAStud.checked ?
            `You are a student from Div A` : 
             `You are a student from Div B`

            showStudent.textContent = divAstudcheck;

        }else{

                showStudent.textContent = `You are Neither a student and nor from Div B or Div A`;
         
        }

        
        if (teacherCheck.checked) {
            
            let divATeachcheck = divATeach.checked ?
            `You are a Teacher from Div A`: 
            `You are a Teacher from Div B`

            showTeacher.textContent = divATeachcheck;

        }else{

         showTeacher.textContent = `You are Neither a Teacher and nor from Div B or Div A`;

        }

    }

    //grade finder 

    const gradeMarks = document.getElementById("gradeMarks");
    const gradeMarksShow = document.getElementById("gradeMarksShow");
    const gradeBtn = document.getElementById("gradeBtn");

    let numGradeMarks ;
    let boolGradeMarks;

    gradeBtn.onclick = function(){

        numGradeMarks = gradeMarks.value;
        numGradeMarks = Number(numGradeMarks);
        boolGradeMarks = Boolean(numGradeMarks);

        switch(boolGradeMarks){

            case numGradeMarks < 20 :
                gradeMarksShow.textContent = `Congratulation for ${numGradeMarks} \n you Got D grade`;
                break;
            
            case numGradeMarks < 40 :
                gradeMarksShow.textContent = `Congratulation for ${numGradeMarks} \n you Got C grade`;
                break;
            
            case numGradeMarks < 60 :
                gradeMarksShow.textContent = `Congratulation for ${numGradeMarks} \n you Got B grade`;
                break;
                
            case numGradeMarks < 80 :
                gradeMarksShow.textContent = `Congratulation for ${numGradeMarks} \n you Got A grade`;
                break;
                
            case numGradeMarks < 100 :
                gradeMarksShow.textContent = `Congratulation for ${numGradeMarks} \n you Got O+ grade`;
                break;


            default :
                gradeMarksShow.textContent = `Marks Is not entered yet!`;
                break;
        }


    }
        

    // strings

    let fullName = " Nishant Machhi ";
    
    console.log(fullName);

    console.log(fullName.charAt(2));
    console.log(fullName.indexOf("a"));
    console.log(fullName.length);
    console.log(fullName.lastIndexOf("h"));
    console.log(fullName.replaceAll(" " , "+"));
    console.log(fullName.toLowerCase());
    console.log(fullName.toUpperCase());
    
    if (console.log(fullName.includes(" "))) {
     
        console.log("Yes it contains String!");
        
    }else{

        console.log("No it doesn't contains String!");

    }

    console.log(fullName.padStart(20, "-"));

    console.log(fullName.padEnd(20, "-"));

    console.log(fullName.repeat(2));
    console.log(fullName.trim());


    //slicing String

    let Lname = "Nishant Machhi";

    console.log(Lname.slice(0,7));
    console.log(Lname.slice(8));

    console.log(Lname.slice(0,Lname.indexOf(" ")));
    console.log(Lname.slice(Lname.indexOf(" ") + 1));

// chain method

let msg = "hello its me/!!!"
let methodChaining = msg.trim().toUpperCase().padStart(20,"-").padEnd(20,"-");
console.log(methodChaining);

//logical operator 

let randnum = 99;

if (randnum < 0 && randNum <100) {
    
    console.log("you number is between 100");

}else if(randnum < 0 || randnum < 100){

    console.log("your number is actually in between 1 and 100");

}else{

    console.log("Go fluck your self");

}





