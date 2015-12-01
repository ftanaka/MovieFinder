<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html">
    <link rel="stylesheet" href="" type="" media="screen">
</head>
<body>
<script>
    function TestaSenhas() {
        if (document.getElementById("senha").value !== document.getElementById("confsenha").value) {
            alert("Senhas incompativeis. Favor re-escrever");
        }
    }
</script>
      <header><h1>Bem Vindo ao MovieFinder</h1></header>
<h1>_______________________________________________________________________________</h1>
      <p class="cadastro">Fazer Cadastro (Campos Obrigatorios: *)</p>
      <form method="post" action="/cadastra">
          <p><label for="name">*Nome :</label><input type="text" name="usuario.name" id="name" required></p>
          <p><label for="pais">*Pais de Origem :</label><input type="text" name="usuario.pais" id="pais" required></p>
          <p><label for="email">*Email :</label><input type="email" name="usuario.email" id="email" required></p>
          <p><label for="senha">*Senha :</label><input type="password" name="usuario.senha" id="senha" required></p>
          <p><label for="confsenha">*Confirme a senha :</label><input type="password" name="confsenha" id="confsenha" required></p>
          <p><label for="datanasc">*Ano de nascimento :</label><input type="date" name="usuario.datanasc" id="datanasc" required></p>
          <p><label></label><input type="submit" value="Cadastrar" onclick="TestaSenhas();"></p>
    </form>
</body>
