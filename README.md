# isros
Proyecto Final de Carrera. Integracion Sistema Real Open Source.

Esta aplicación permite integrar varias aplicaciones Open Source, utilizando un ESB(Enterprise Service Bus). En esta aplicacion integramos las siguientes aplicaciones.

* Aplicación de gestion empresarial (ERP); _DolibarERP_.
* Aplicación tienda virtual e-commerce; _Prestashop_.
* Aplicación de gestión de clientes (CRM); _SugarCRM_.
* Aplicación web comercial; _Wordpress_.

Todas las aplicaciones se han integrado utilizando un software de integración por medio de un bus; el ESB es Mule ESB y en este repositorio se encuentra la aplicación para instalarla en el contenedor de Mule.

Esta aplicación utiliza Maven para ser compilada y desplegada. para compilarla simplemente:

```bash
$ mvn clean install
```

Esta aplicación tiene una licencia Apache 2.0 y puede ser modificada y mejorada dentro de los parámetros de la licencia.
