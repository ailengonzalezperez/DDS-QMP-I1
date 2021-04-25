class Prenda{
  TipoPrenda tipo; 
  Material material; 
  Color colorPrincipal; 
  Color colorSecundario; 
  
  public Prenda(TipoPrenda tipo, Categoria categoria; Material material; Color colorPrincipal){ 
    if (tipo.getCategoria() != categoria){
		throw new PrendaInvalidaException("Categoría inválida");
    else if (tipo == null || categoria == null || material == null || colorPrincipal == null){
      throw new PrendaInvalidaException("Faltan datos de la prenda.");
    }else{
      this.tipo = tipo;
      this.material = material;
      this.colorPrincipal = colorPrincipal;
    } else { 
      throw new TipoCategoriaNoValidoException();
  }
 
  public Prenda(TipoPrenda tipo, Categoria categoria; Material material; Color colorPrincipal; Color colorSecundario){ 
    if (tipo.getCategoria() != categoria){
		throw new PrendaInvalidaException("Categoría inválida");
    else if (tipo == null || categoria == null || material == null || colorPrincipal == null){
      throw new PrendaInvalidaException("Faltan datos de la prenda.");
    
    }else{
      this.tipo = tipo;
      this.material = material;
      this.colorPrincipal = colorPrincipal;
      this.colorSecundario = colorSecundario;
    } 
  }
   
  public Categoria getCategoria(){
	return this.tipo.getCategoria();
}
  
class PrendaInvalidaExcepcion implements RuntimeException{};
  
    
enum Categoria{
  PARTESUPERIOR,
  CALZADO,
  PARTEINFERIOR,
  ACCESORIO
}
  
enum TipoPrenda{  
	
  Categoria categoria;

  TipoPrenda(categoria){
    this.categoria = categoria;
  }
  
  Categoria getCategoria(){
	  return this.categoria;
  }
	
  ZAPATO(Categoria.CALZADO),CAMISAMANGACORTA(Categoria.PARTESUPERIOR),
  PANTALON(Categoria.PARTEINFERIOR)
  
}
    
enum Material{
  JEAN, CUERO, TELA
}

class Color{  //Clase sin comportamiento pero vale la pena por la abstracción
  Int rojo;
  Int verde;
  Int azul;
}
