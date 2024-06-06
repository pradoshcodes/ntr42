//nom init -y
//package.json
//npm install prompt-sync

//user desfines input

const input = require('prompt-sync')();
let num=parseInt(input("Enter a number"))
if(num%2==0){
    console.log("number is even")
    }else{
        console.log("number is odd")
        }//even or odd check
