<?
namespace ISROS;
//require_once('soap.php');

class Isros{

    public $soapclient= null;
    function __construct(){

    }
    public function listProducts(){
        $products=[];
        $prod1 = new Product();
        $prod1->ref="1";
        $prod1->name="Producto 1";
        $prod1->prize=140;
        $prod1->description="Smartphone de gama alta";
        $prod1->imgurl="http://images.samsung.com/is/image/samsung/p5/mx/smartphones/pcd_smartphones_primary_galaxyJ5.png?";
        $products[]=$prod1;
        $prod2= new Product();
        $prod2->ref="2";
        $prod2->name="Producto 2";
        $prod2->prize=230.00;
        $prod2->description="Televisor led";
        $prod2->imgurl="https://static.carrefour.es/hd_320x_/crs/cdn_static/catalog/hd/868655_00_1.jpg";
        $products[]=$prod2;
        $prod3 = new Product();
        $prod3->ref="3";
        $prod3->name="Producto 3";
        $prod3->prize=436;
        $prod3->description="Portatil Intel i7 con Vulnerabilidad";
        $prod3->imgurl="https://static.carrefour.es/hd_160x_/crs/cdn_static/catalog/hd/149104_00_1.jpg";
        $products[]=$prod3;
        $prod4= new Product();
        $prod4->ref="4";
        $prod4->name="Producto 4";
        $prod4->prize=211;
        $prod4->description="Camara de fotos Reflex";
        $prod4->imgurl="http://quecamarareflex.com/wp-content/uploads/2015/01/nikon_d5300_reflex_camara.jpg";
        $products[]= $prod4;
        return $products;
    }

    public function listClients(){

    }
}

class Product{
    public $ref;
    public $name;
    public $prize;
    public $description;
    public $imgurl;

}

class Client{
    public $ref;
    public $cif;
    public $name;
    public $address;
    public $phone;
}
?>