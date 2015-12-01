<html lang="pt-br">
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="" type="" rel="stylesheet" media="screen">
    </head>
    <body>
    <center>
        <header><h1>Bem Vindo ao MovieFinder</h1>
        <h1>_______________________________________________________________________________</h1>
        <p1>Faça login para continuar</p1></header>
        <form method="post" action="">
            <p><label for="usuario">Usuário(e-mail) :</label><input name="usuario" id="usuario" type="text" required><a href="cadastro.jsp">Cadastrar novo usuarios</a></p>
            <p><label for="senha">Senha :</label><input name="senha" id="senha" type="text" required><a href="recSenha.jsp">Esqueceu a senha?</a></p>
            <p><input type="submit" value="Login" width=70px height=20px></p>
        </form>
        <h2>Você também pode buscar por filmes sem se cadastrar</h2>
        <p1>Esteja ciente que um usuário não cadastrado não pode adicionar filmes ou reviews</p1>
        <br>
		<button style="height:30px;width:200px" onclick="location.href='buscaFilme.jsp'">BUSCAR POR FILMES</button>
		<br>
		<br>
		<a href="http://www.google.com/">Manual do Usuario - em PDF</a>
    </center>
    </body>
</html>