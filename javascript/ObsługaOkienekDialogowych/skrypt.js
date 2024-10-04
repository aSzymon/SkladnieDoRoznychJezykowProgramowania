// aSzymon - gtihub

var dane = document.getElementsByTagName("button")[0];

dane.addEventListener("click", function(){

	alert("witam");

});

var dane2 = document.getElementsByTagName("button")[1];

dane2.addEventListener("click", function() {
	
	prompt("podaj imie");

})

var dane3 = document.getElementsByTagName("button")[2];

dane3.addEventListener("click", function() {
	
	if (confirm("Podejmij decyzję!")) {
		
		alert("Dobry wybór");

	} else {
		
		alert("a czemnu nie okej?");

	} 
	
})