<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>	
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"></script>
	<script src="<? echo get_bloginfo('template_directory');?>/js/isroscart.js"></script>
	<script type="text/javascript">
	
     function addItem(prodid,name,quantity){
		 cart.addItem(prodid,name,quantity,function(){
			refreshItems();
		 });
	 }
	 function removeItem(prodid){
		 cart.removeItem(prodid,function(){
			refreshItems();
		 });
	 }
	 
	 function refreshItems(){
		htmlitems="<input type='hidden' name='cartjson' value='"+JSON.stringify(cart.items)+"' />";
		cart.items.forEach(function(element){
			htmlitems+="<a href='#'>"+element.name+"  X"+element.quantity+"</a><br/>";
		});
		$('#carro').html(htmlitems);
	 }
</script>
<script type="text/javascript">
    jQuery(function() {
        
    });
</script>
	<?php wp_footer(); ?>
</body>
</html>