var istatus=document.querySelector("h5")
var likes= document.querySelector('#like')
var check=0
likes.addEventListener("click",function(){
    if(check ==0){
    istatus.innerHTML="Avenger"
    istatus.style.color="blue"
    likes.innerHTML="Dislike"
    check=1
    }else{
        istatus.innerHTML="End Game"
        istatus.style.color="Green"
        likes.innerHTML="Like"
        check=0
    }
})

