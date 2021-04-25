class Prenda{
  TipoPrenda tipo; 
  Material material; 
  Color colorPrincipal; 
  Color colorSecundario; 
  Trama trama;
  
  public Prenda(TipoPrenda tipo, Categoria categoria; Material material; Trama trama; Color colorPrincipal){ 
	  
    if (tipo == null || categoria == null || material == null || colorPrincipal == null){
      throw new PrendaInvalidaException("Faltan datos de la prenda.");
    }
    
    if (tipo.getCategoria() != categoria){
	  throw new PrendaInvalidaException("Categoría inválida");
	}
		   
    if (trama != null && material != Material.TELA){
        throw new PrendaInvalidaException("Este material no lleva trama");
    }
    
    if (trama == null && material == Material.TELA){ 
		this.trama = Trama.LISA;
	}
	
	if (trama != null && material == Material.TELA){
		this.trama = trama;
	    
    }
    
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
      
  }
 
  public Prenda(TipoPrenda tipo, Categoria categoria; Material material; Trama trama; Color colorPrincipal; Color colorSecundario){ 
    if (tipo == null || categoria == null || material == null || colorPrincipal == null){
      throw new PrendaInvalidaException("Faltan datos de la prenda.");
    }
    
    if (tipo.getCategoria() != categoria){
	  throw new PrendaInvalidaException("Categoría inválida");
	}
		   
    if (trama != null && material != Material.TELA){
        throw new PrendaInvalidaException("Este material no lleva trama");
    }
    
    if (trama == null && material == Material.TELA){ 
		this.trama = Trama.LISA;
	}
	
	if (trama != null && material == Material.TELA){
		this.trama = trama;
	    
    }
    
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
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
 
class Color{  //Clase sin comportamiento pero vale la pena por la abstracción
  Int rojo;
  Int verde;
  Int azul;
}
    
enum Material{
  JEAN, CUERO, TELA
}

enum Trama{
	LISA, RAYADA, LUNARES, CUADROS, ESTAMPADO
}

class BorradorPrenda{
  TipoPrenda tipo; 
  Material material; 
  Color colorPrincipal; 
  Color colorSecundario; 
  Trama trama = Trama.LISA;
  
  setTipo(TipoPrenda tipo){
    this.tipo = tipo;
  }
  
  setTipo(Material material){
    this.material = material;
  }
  
  setTipo(Color colorPrincipal;){
    this.colorPrincipal = colorPrincipal;
  }
  
  setTipo(Color colorSecundario){
    this.colorSecundario = colorSecundario;
  }
  
  setTipo(Trama trama){
    this.trama = trama;
  }

  Prenda generarPrenda(){
	  return Prenda(...)
}
