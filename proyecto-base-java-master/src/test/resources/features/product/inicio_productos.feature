# author: JhonLopez
# date: 127/10/2024
# language: es

Característica: Manejo del carrito de compras
  Yo como cliente web de una floristería accedo a la página
  para agregar y eliminar productos del carrito.


  @SeleccionProductosExistoso
  Escenario: Añadir productos al carrito de la categoria amor
    Dado que el usuario esta en la categoria amor de la pagina
    Cuando añade el primer producto al carrito
    Entonces continua comprando
    Y el usuario añade el segund producto al carrito
    Entonces termina el proceso


  @SeleccionEliminarProductosExitoso
  Escenario: Eliminar producto del carrito de la categoría cumpleaños
    Dado que el usuario está en la categoría cumpleaños de la página
    Cuando añade el primer producto de cumpleaños al carrito
    Y el usuario navega al carrito
    Entonces elimina el producto del carrito
    Y el usuario observa el mensaje de carrito vacio
