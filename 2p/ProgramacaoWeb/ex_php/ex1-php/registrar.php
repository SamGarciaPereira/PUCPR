<?php
    if($_SERVER["REQUEST_METHOD"] == "POST"){
        $n1 = (float)($_POST["n1"]);
        $n2 = (float)($_POST["n2"]);
        $resultado = $n1 + $n2;
        echo json_encode([
            'n1' => $n1,
            'n2' => $n2,
            'soma' => $resultado
        ]);
        exit;
    }
?>