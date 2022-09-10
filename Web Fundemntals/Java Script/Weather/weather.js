var co = document.querySelector(".footer")

//THIS FUNCARION will do  .....
function fun1() { 
    co.remove() ; 
}
function fun2 () { 
    alert("Loading Weather Report ...") ; 
}
var q = document.querySelectorAll(".f") ; //  <<<<<<< using query selector All >> 
var w = document.querySelectorAll(".s") ; 
function fun3(z) {
    if (z.value == 'f'){
    for ( var i=0 ; i<q.length ; i++ ) {
        q[i].innerText = Math.round((q[i].innerText*1.8) +32  )  ;
        }
        for (var j=0 ; j<w.length ; j++ ) {
            w[j].innerText = Math.round((w[j].innerText*1.8)+32)  ;
    }
}
if (z.value == 'c') {
    for ( var i=0 ; i<q.length ; i++ ) {
        q[i].innerText = Math.round(((q[i].innerText)-32) /1.8 )  ;
        }
        for (var j=0 ; j<w.length ; j++ ) {
            w[j].innerText = Math.round(((w[j].innerText)-32) / 1.8 )  ;
}
}
}





// var x=document.querySelectorAll("h4").innerText; 
// var y= document.querySelectorAll("h5").innerText ;
// var y= [(x[0]*1.8) + 32 , (x[1]*1.8) + 32 , (x[2]*1.8) + 32 , (x[3]*1.8) + 32] ; //Converting from C to F . 
// var z= [(y[0]*1.8) + 32 ,  (y[1]*1.8) + 32 , (y[2]*1.8) + 32 , (y[3]*1.8) + 32] ; 
// console.log(y) ;
// var f = document.querySelectorAll("h4") ;
// var f1 = document.querySelectorAll("h5") ;
// function fun3() {
    // for (var i=0 ; i<f.length ; i++) {
    // f[i].innerText = Math.round(y) ; 
// }
// for( var m=0 ; m<f1.length ; m++){
    // f1[m].innerText = Math.round(z) ;
// } 
// }
// var z= (x1-32) / 1.8 c to f
// var x = document.querySelector("h4").innerText ; 
// var z = document.querySelector("h5").innerText ; 
// y= (x*1.8) + 32 ;
// v=(z*1.8) + 32 ; 
// var q=document.querySelector("h4") ;  
// var t=document.querySelector("h5") ; 
// function fun3() {
    // q.innerText =  Math.round(y) ;  
    // t.innerText = Math.round(v) ; 
// }
// --------------------------------------------
// coppied solution : 
// var TempRate = 1.8
// var f=[document.querySelector(".f1").innerText,document.querySelector(".f2").innerText,document.querySelector(".f3").innerText,document.querySelector(".f4").innerText]
// var s=[document.querySelector(".s1").innerText,document.querySelector(".s2").innerText,document.querySelector(".s3").innerText,document.querySelector(".s4").innerText]
// var f1=[parseInt(f[0],10),parseInt(f[1],10),parseInt(f[2],10),parseInt(f[3],10)]
// var s1=[parseInt(s[0],10),parseInt(s[1],10),parseInt(s[2],10),parseInt(s[3],10)]
// var f2=[(f1[0]*(TempRate)+32),(f1[1]*(9/5)+32),(f1[2]*(9/5)+32),(f1[3]*(9/5)+32)]
// var s2=[(s1[0]*(TempRate)+32),(s1[1]*(9/5)+32),(s1[2]*(9/5)+32),(s1[3]*(9/5)+32)]


// function fun3(e) {
//      for(var i=0;i<4;i++){
//         if(e.value=='f'){
//             document.querySelector(".f"+(i+1)).innerText=Math.floor(f1[i]*(9/5)+32)
//             document.querySelector(".s"+(i+1)).innerText=Math.floor(s1[i]*(9/5)+32)
//       }
//         if(e.value=='c'){
//              document.querySelector(".f"+(i+1)).innerText=Math.floor((f2[i]-32)*(5/9))
//              document.querySelector(".s"+(i+1)).innerText=Math.floor((s2[i]-32)*(5/9))
//          }
//      }
 //}


