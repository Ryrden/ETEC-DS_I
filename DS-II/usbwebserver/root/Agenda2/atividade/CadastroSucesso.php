<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Brincos e Companhia</title>
</head>

<body>
    
    <div class="w3-container  w3-teal w3-center">
    <h1>Cadastro Confirmado com Sucesso!</h1>
    </div>

    <div class="w3-panel w3-border w3-border-blue">
        <?php
            $nome = $_POST['txtNome'];
            echo "Nome: ".$nome."<br>";
        ?>
    </div>

    <div class="w3-panel w3-border w3-border-blue">
        <?php
            $sobrenome = $_POST['txtSobrenome'];
            echo "Sobrenome: ".$sobrenome."<br>";
        ?>
    </div>

    <div class="w3-panel w3-border w3-border-blue">
        <?php
            $email = $_POST['txtEmail'];
            echo "Email: ".$email."<br>";
        ?>
    </div>

    <div class="w3-panel w3-border w3-border-blue">
        <?php
            $formacao = $_POST['txtFormacao'];
            echo "Formação: ".$formacao."<br>";
        ?>
    </div>

    <div class="w3-panel w3-border w3-border-blue">
        <?php
            $descricao = $_POST['txtEmprego'];
            echo "Descrição Último Emprego: ".$descricao."<br>";
        ?>
    </div>
    
</div>

</body>