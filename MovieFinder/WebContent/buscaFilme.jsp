<html lang="pt-br">
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
        <link href="" type="" rel="stylesheet">
    </head>
    <body>
        <script>
            function ChecaAno() {
                if (isNaN(document.getElementById("ano").value)) {
                    alert("Ano inválido");
                    document.getElementById("ano").value = "";
                }
            }
        </script>
        <header><h1>Bem Vindo ao Movie Finder</h1></header>
        <h1>_______________________________________________________________________________</h1>
        <form method="post" action="">
        	<h3>Pesquisa Simples:</h3>
            <p><label for="search">Pesquisa por Nome :</label><input type="search" name="serchnamesimples" id="searchnamesimples"><input type="submit" value="Pesquisa simples"></p>
        </form>
        <p>___________________________________________________________________________________________</p>
        <br>
        <form method="post" action="">
            <h3>Pesquisa Avancada:</h3>
            <p><label for="genero">Genero :</label>
                <select name="genero">
                    <option selected="true" disabled="true">Selecione um opçao</option>
                    <option value="gen1">Genero 1</option>
                    <option value="gen2">Genero 2</option>
                    <option value="gen3">Genero 3</option>
                    <option value="gen4">Genero 4</option>
                </select></p>
                <p><label for="searchname">Nome do filme :</label><input type="text" name="searchname" id="searchname">
                <p><label for="diretor">Diretor :</label><input type="text" name="diretor" id="diretor"></p>
                <p><label for="ator">Ator :</label><input type="text" name="ator" id="ator"></p>
                <p><label for="nacionalidade">Nacionalidade :</label><input type="text" name="nacionalidade" id="nacionalidade"></p> 
                <p><label for="ano">Ano :</label><input type="text" name="ano" id="ano"  oninput="ChecaAno();"></p> 
                <p><label></label><input type="submit" value="Pesquisa Avançada"></p>
        </form>
    	<br>
		<br>
		<a href="http://www.google.com/">Manual do Usuario - em PDF</a>
    </body>
</html>
