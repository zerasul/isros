<?php
require_once('isros.php');
use ISROS\Isros;


function listClients(){
   
    return $isros->listClients();
}

function listProducts(){
    $isros = new Isros();
    return $isros->listProducts();
}
?>