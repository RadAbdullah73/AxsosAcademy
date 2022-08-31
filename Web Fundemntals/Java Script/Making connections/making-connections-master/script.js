var element= document.querySelector("#jan")
function fun1(){
    element.innerText = "Rana";

}

var rm=document.querySelector(".card-list-item1");
var re=document.querySelector(".badge")
var counter = 2 ; 
function fun2(){
    rm.remove() ;
    counter -- ; 
    re.innerText=counter; 
}

var ro=document.querySelector(".card-list-item2");
var rt=document.querySelector(".badge")
var counter = 2 ; 
function fun3(){
    ro.remove() ;
    counter -- ; 
    re.innerText=counter ; 

}
var mi = document.querySelector(".badgee")
var counter = 2 ;
var counter1=400 ; 
function fun4() {
    rm.remove () ;
    counter-- ; 
    counter1 ++ ;
    re.innerText=counter ;
    mi.innerText= counter1 ;

   
}
var mi = document.querySelector(".badgee")
var counter= 2;
var counter1=400;
function fun5() {
    ro.remove();
    counter --; 
    counter1 ++ ;
    re.innerText=counter ; 
    mi.innerText=counter1 ; 

}
