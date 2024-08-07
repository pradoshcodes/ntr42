let goto=(success,failure)=>{
   let balance=5000;
   if(balance>15000){
    success("Go and enjoy")
   }else{
    failure("Sorry, you can't go")
   }
}
goto((msg)=>{console.log(msg)},(hello)=>{console.log(hello)})