"use strict";
document.getElementById("getall").onclick = function(){ajaxTest()};
document.getElementById("getone").onclick = function(){ajaxperson()};
document.getElementById("putone").onclick = function(){ajaxput()};

function ajaxTest(){
var httpreq = new XMLHttpRequest();
var url = 'api/people/all';
httpreq.open('GET',url,true);
httpreq.send();
}

function ajaxperson(){
	var personid = new Number( document.getElementById("personid").value);
	 	$.ajax({url:'api/people/person/'+ personid,type:'GET'})
	
	}

function ajaxput(){
	var newperson = {
			Name:'surabhi',
			city:'kolhapur'
	};
	$.ajax({url:'api/people/add',
		type:'POST',
		contentType:'application/json',
		data: JSON.stringify(newperson)
		})
	}
