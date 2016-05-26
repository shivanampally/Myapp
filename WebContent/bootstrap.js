/**
 * Created by shalmal90 on 12/30/2014.
 */
"use strict";
function butt(a){

    if (a == "but1"){

        var act = document.getElementById("but1");
        act.className = "active";
        var act = document.getElementById("but2");
        act.className = "";
        var act = document.getElementById("but3");
        act.className = "";
        document.getElementById("one").style.display = "block";
        document.getElementById("two").style.display = "none";
        document.getElementById("three").style.display = "none";

    }

   else if (a == "but2"|| a=="lon-but")
    {
        var act = document.getElementById("but2");
        act.className = "active";
        var act = document.getElementById("but1");
        act.className = "";
        var act = document.getElementById("but3");
        act.className = "";
        document.getElementById("one").style.display = "none";
        document.getElementById("two").style.display = "block";
        document.getElementById("three").style.display = "none";
    }
else if(a=="but3"|| a=="home"){
        var act = document.getElementById("but2");
        act.className = "";
        var act = document.getElementById("but1");
        act.className = "";
        var act = document.getElementById("but3");
        act.className = "active";
        document.getElementById("one").style.display = "none";
        document.getElementById("two").style.display = "none";
        document.getElementById("three").style.display = "block";
    }


}
function warn(){
    alert("This Function part is under development , But you can view or change reservations");
}
function res(a){
         if (a == "but2"||a=="test")
        {
            var act = document.getElementById("but2");
            act.className = "active";
            var act = document.getElementById("but3");
            act.className = "";
            document.getElementById("two").style.display = "block";
            document.getElementById("three").style.display = "none";
        }
        else if(a=="but3"){
            var act = document.getElementById("but2");
            act.className = "";
            var act = document.getElementById("but3");
            act.className = "active";

            document.getElementById("two").style.display = "none";
            document.getElementById("three").style.display = "block";
        }


}

function book(id) {
if(id=="active-res"){


    document.getElementById(id).style.backgroundColor = "red";
    document.getElementById(id).style. width="50%";
    document.getElementById(id).style.cursor="pointer";
    document.getElementById(id).innerHTML = "<p>Reservation</p><p>Cancelled</p>";
    document.getElementById(id).id = "";
}
    else{

    document.getElementById(id).style.backgroundColor = "green";
    document.getElementById(id).innerHTML = "<p>Reserved</p><p>cancel Reservation?</p>";
    document.getElementById(id).id = "active-res";}
}
function cancel(){
    alert("Reservation Cancelled");
}