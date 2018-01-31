<?php
namespace ISROS;
require_once('nusoap/lib/nusoap.php');

class SoapClient{
    private $soap = null;

    function __construct(){
        $soap = new nusoap_client('http://localhost:8081/isros?wsdl','wsdl');
        $err = $soap->getError();
        if ($err) {	echo 'Error en Constructor' . $err ; }
    }

    public function listClients(){
        $param=[];
        $result = $soap->call('listClients',$param);
    }

    public function listProduct(){
        $param= [];
        $result = $soap->call('listProducts',$param);
    }
}

?>