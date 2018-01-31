<?php get_header(); ?>
    <div class="row justify-content-end">
        <div class="col-2">
            <a href="carrito/" class="btn btn-primary">Finalizar</a>
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
					<a href="#" class="btn btn-primary">Comprar</a>
				</div>
			</div>
			<?php }?>
            
		</div>
	</div>
	<?php get_footer(); ?>