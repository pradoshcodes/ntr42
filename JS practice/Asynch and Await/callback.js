let createEmployeee=( callback)=>{
    setTimeout(()=>{
        callback();
  console.log("Good night");
  
    },4000)
}
let getEmployee=()=>{
  setTimeout(()=>{
   console.log("good morning");
  },2000)
}

createEmployeee(getEmployee)
