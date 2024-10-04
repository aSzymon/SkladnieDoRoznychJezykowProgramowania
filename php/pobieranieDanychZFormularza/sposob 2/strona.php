<!-- aSzymon - gtihub -->

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Pobieranie danych z formularza</title>
</head>
<body>

<center>

	<br><br>

		<h1>Formularz do wypisywania danych i wypisania ich</h1>
		<h2>Sposób II</h2>
		<p>Wszystko dzieje się w jednym pliku</p>

	<br><br>

	<form action="strona.php" method="POST">
		
		nazwa : <input type="text" name="tekst"><br><br>
		haslo : <input type="password" name="haslo"><br><br>

		<input type="submit" name="przycisk">

	</form>

</center>

</body>
</html>


<?php 

	@$nick = $_POST['tekst'];
	@$haslo = $_POST['haslo'];

	echo "Twoj nick to : ".$nick."<br>";
	echo "Twoje haslo to : ".$haslo;

	// @ służy do krycia błędów w kodzie np. tak jak to
	// puki bym nie wpisała czegoś w formularz to by
	// non stop wyskakiwał błąd a jak widac dzięki @
	// nic nie widać a kod działa :p

?>
