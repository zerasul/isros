var cart=new Object();

cart.items=new Array();

cart.addItem=function(prodid,name,quantity,onaddItem){
    nitems=cart.items[prodid];
    if(nitems == undefined){
        var item={'ref': prodid,'name':name,'quantity':quantity};
        cart.items[prodid]=item;
    }
    else
        cart.items[prodid]['quantity']+=quantity;

    onaddItem();
}

cart.removeItem=function(prodid,onRemoveItem){
    cart.items[prodid]=undefined;
    onRemoveItem();
}

