document.getElementById('przycisk1').addEventListener('click',pobieranieDanychJson1);

document.getElementById('przycisk2').addEventListener('click',pobieranieDanychJson2);

function pobieranieDanychJson1() {

    let xml = new XMLHttpRequest();

    xml.open('GET','users.json',true);

    xml.send();

    xml.onload = function(){

        if(this.status == 200){

            let parsowanie = JSON.parse(this.responseText);

            //console.log(parsowanie);

            renderHTML(parsowanie);

            function renderHTML(parsowanie){

                let napis = '';

                for(i = 0; i < parsowanie.length; i++){

                    napis += parsowanie[i].id + ". Imie i nazwisko : " + parsowanie[i].imie + " " + parsowanie[i].nazwisko + ". Lat : " + parsowanie[i].wiek + ". Numer telefonu : +48 " + parsowanie[i].telefon + "<br>";

                }

                document.getElementById('pole1').innerHTML = napis;

            }

        }

    }
}

function pobieranieDanychJson2() {

    let xml = new XMLHttpRequest();

    xml.open('GET','users.json',true);

    xml.send();

    xml.onload = function(){

        if(this.status == 200){

            let parsowanie = JSON.parse(this.responseText);

            //console.log(parsowanie);

            renderHTML(parsowanie);

            function renderHTML(parsowanie){

                let napis = '';

                napis += parsowanie[1].id + ". Imie i nazwisko : " + parsowanie[1].imie + " " + parsowanie[1].nazwisko + ". Lat : " + parsowanie[1].wiek + ". Numer telefonu : +48 " + parsowanie[1].telefon;

                document.getElementById('pole2').innerHTML = napis;

            }

        }

    }

}