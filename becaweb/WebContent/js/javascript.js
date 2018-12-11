$("a").click(function (event){
    event.preventDefault();
    if ($(this).data('seleccion') != null){
        console.log($(this).data('seleccion'));
        if ($(this).data('seleccion') === "Admin"){
            window.location.href = "Admin.jsp";
        } else {
            $("#contenedor2").load('paginas/'+$(this).data('seleccion')+'.jsp');
        }
    }
});

