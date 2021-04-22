class Prenda{
  TipoPrenda tipo; //quiero especificar qué tipo de prenda estoy cargando (zapatos, camisa de mangas cortas, pantalón, etc).
  Categoria categoria; //quiero identificar a qué categoría pertenece una prenda (parte superior, calzado, parte inferior, accesorios).
  Material material; //quiero poder indicar de qué tela o material está hecha una prenda
  Color colorPrincipal; //quiero poder indicar un color principal para mis prendas
  Color colorSecundario; //
  
  public Prenda(TipoPrenda tipo, Categoria categoria; Material material; Color colorPrincipal){ //Quiero evitar que haya prendas sin tipo, tela, categoría o color primario
    if (tipo.perteneceCategoria(categoria)){
      this.tipo = tipo;
      this.categoria = categoria;
      this.material = material;
      this.colorPrincipal = colorPrincipal;
    } else { //Está bien pensarlo con if y else?? el catch estaría más arriba?
      throw new TipoCategoriaNoValidoException();
  }
    
class TipoCategoriaNoValidoException implements RuntimeExcepcion{}; //
  
    
enum Categoria{
  PARTESUPERIOR,
  CALZADO,
  PARTEINFERIOR,
  ACCESORIO
}
  
enum TipoPrenda{  //Tiene sentido listar todos los posibles valores?
  ZAPATOS,
  CAMISAMANGACORTA,
  PANTALON
  //Acá cada uno tendría su pertence a categoría?
}
    
//Ver el tema del material
