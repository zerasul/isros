<?php get_header(); ?>
    <div class="row justify-content-end">
        <div class="col-2">
		<div class="dropdown show">
  				<a class="btn btn-secondary dropdown-toggle" href="#" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    				Carrito
  				</a>

  			<div class="dropdown-menu"  >
				<form action="carrito/" method="POST" >
				<span id="carro">
					
				</span>
				<input type=submit value="Finalizar" class="dropdown-item" />
				</form>
   				
  			</div>
</div>
        </div>
    </div>
    <hr/>
	<div class="container-fluid">
		<div class="row">
		<?php 
			$products = listProducts();
			foreach($products as $prod){?>
			<div class="card product" style="width: 18rem;">
				<img class="card-img-top" src="<?php echo  $prod->imgurl; ?>" alt="Card image cap">
				<div class="card-body">
                    <h5 class="card-title"><?php echo $prod->name; ?></h5>
                    <h6>Precio: <?php echo $prod->prize; ?></h6>
					<p class="card-text">
						<?php echo $prod->description; ?>
					</p>
					<a href="#" class="btn btn-primary" onclick="addItem('<?echo $prod->ref?>','<?echo $prod->name;?>',1)">comprar</a>
				</div>
			</div>
			<?php }?>
            
		</div>
	</div>
	<?php get_footer(); ?>