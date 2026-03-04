/*!
=========================================================
* Steller Landing page
=========================================================

* Copyright: 2019 DevCRUD (https://devcrud.com)
* Licensed: (https://devcrud.com/licenses)
* Coded by www.devcrud.com

=========================================================

* The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
*/

// smooth scroll
$(document).ready(function(){
	$(".nav-link").on('click', function(event) {

    	if (this.hash !== "") {

			event.preventDefault();

			var hash = this.hash;

			$('html, body').animate({
				scrollTop: $(hash).offset().top
			}, 700, function(){
				window.location.hash = hash;
			});
      	} 
    });
});

const btn_ra = document.getElementById("btn-ra");
const btn_filo= document.getElementById("btn-filo");
const btn_experiencia = document.getElementById("btn-experiencia");
const btn_rplm = document.getElementById("btn-rplm");


btn_ra.addEventListener("click", function(){
	 window.location.href = "ra.html";
})

btn_filo.addEventListener("click", function(){
	window.location.href = "filosofia.html";
})

btn_experiencia.addEventListener("click", function(){
	window.location.href = "experiencia.html";
})

btn_rplm.addEventListener("click", function(){
	window.location.href = "rplm.html";
})