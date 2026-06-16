const form = document.getElementById("form");

const guessNum = document.getElementById("guessNum");
const showError = document.getElementById("showError");

const submit = document.getElementById("submitBtn");

const showResult = document.getElementById("showResult");
const showScore = document.getElementById("showScore");




//generating a random number between 1 to 100;

const max = 100;
const min = 1;
let randNumber = Math.floor(Math.random() * (max-min)) + min;

console.log( typeof randNumber ,randNumber);   




//scores set    
let maxScore = 100;
let started = false;




//rules & Functionalities for the user for guessing the number.

submit.addEventListener('click' , function(event){


    event.preventDefault();

    //type Caste

    const NumberGuessNum = Number(guessNum.value);
    console.log(typeof NumberGuessNum, NumberGuessNum);


    
//rules

//Error msg for Null Value   
if ( NumberGuessNum === "" || NumberGuessNum === 0) {
    
    showError.textContent = "Value is Required*";
    showError.style.display= "block";    
    return;
    
}

//setting the highest and lowest value limit
else if ( NumberGuessNum >= 100) {

    form.reset();
    
    showError.textContent = "Value must be lower than 100*";
    showError.style.display= "block";    
    return;

}


else if ( NumberGuessNum < 0) {
    
    form.reset();

    showError.textContent = "Value must be greater than 0*";
    showError.style.display= "block";    
    return;
}

else{

    showError.textContent = "";
    showError.style.display= "none";

}


//Functionalities..


if (  NumberGuessNum < randNumber  ) {

    form.reset();

    showResult.textContent = "Try Higher Value" + String.fromCodePoint(128314);
    showResult.style.display= "block";

}else if(  NumberGuessNum > randNumber  ){

    form.reset();

    showResult.textContent = "Try Lower Value" +String.fromCodePoint(128315);
    
    showResult.style.display= "block";    

}else if(NumberGuessNum === randNumber){

    const celebrationEmoji = String.fromCodePoint(127881);
    const clappingEmoji = String.fromCodePoint(128079);

    showResult.textContent = "Congratulations!!" + clappingEmoji + "You won" + celebrationEmoji  ;
    showResult.style.display= "block";    
    
    randNumber = Math.floor(Math.random() * (max-min)) + min;


}else{
    
    showError.textContent = "";
    showError.style.display= "none";


}


//score functionalities


    if(!started){
        started = true;
        showScore.textContent = `Game started! Score: ${maxScore}`;
        return;
    }

    //Reduce score only after valid input
    maxScore -= 10;

    if(maxScore <= 0){
        showScore.textContent = "Game Over! Restarting...";
        
        setTimeout(() => {
            maxScore = 100;
            started = false;
            showScore.textContent = "";
            showResult.textContent=""; // reset UI to empty
        }, 2000);

    } else {
        showScore.textContent = `Your score is: ${maxScore}`;
    }

    


});


