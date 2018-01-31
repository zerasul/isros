<?php
    /*
Template Name: Cart-Template
*/
get_header(); ?>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Prod.</th>
                    <th scope="col">Precio</th>
                    <th scope="col">Cantidad</th>
                    <th scope="col">Total</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td >Producto 1</td>
                    <td>140.0</td>
                    <td>1</td>
                    <td>140.0</td>
                </tr>
                <tr>
                        <th scope="row">2</th>
                        <td >Producto 2</td>
                        <td>230.0</td>
                        <td>1</td>
                        <td>230.0</td>
                </tr>
                <tr>
                    <th scope="row" colspan="4">TOTAL</th>
                    <td><strong>370</strong></td>
                </tr>
            </tbody>
            

        </table>
        <div clas="row">
            <h3>Cliente</h3>
        </div>
        <form method="POST" action="<? echo get_bloginfo( 'wpurl' ); ?>/compra-finalizada/" >
            <div class="form-group">
            <label for="name">Nombre (Razón Social)</label>
            <input  class="form-control" type="text" name="name" id="name" />
            </div>
            <div class="form-group">
                <label for="cif">CIF</label>
                <input class="form-control" type="text" name="cif" id="cif" />
            </div>
            <div class="form-group">
            <label for="address">Dirección</label>
            <textarea class="form-control" type="text" name="address" id="address" >
            </textarea>
            </div>
            <div class="form-group">
            <label for="telefono">Teléfono</label>
            <input class="form-control" type="tel" name="telefono" id="telefono" />
             </div>
            <div class="form-group">
                <input type="submit" class="btn btn-primary"/>
            </div>
        </form>
        <h3></h3>
<?php get_footer(); ?>
    	