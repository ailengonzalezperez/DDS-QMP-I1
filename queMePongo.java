public class Prenda{
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
  
public class PrendaInvalidaExcepcion implements RuntimeException{};
  
    
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
	
  ZAPATO(Categoria.CALZADO),CAMISA(Categoria.PARTESUPERIOR),
  PANTALON(Categoria.PARTEINFERIOR), CHOMBA(Categoria.PARTESUPERIOR), ZAPATILLAS(Categoria.CALZADO)
  
}
 
class Color{  //Clase sin comportamiento pero vale la pena por la abstracción
  Int rojo;
  Int verde;
  Int azul;
}
    
enum Material{
  JEAN, CUERO, TELA, PIQUE, ACETATO
}

enum Trama{
	LISA, RAYADA, LUNARES, CUADROS, ESTAMPADO
}

public class BorradorPrenda{
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

public class Uniforme{
  Prenda parteSuperior;
  Prenda parteInferior;
  Prenda calzado;
  
  Uniforme generarUniforme(Institucion institucion){
	  return new Uniforme(institucion.parteSuperior(), institucion.parteInferior(), institucion.calzado()}
  }
 
 }
 
 public Interface Institucion{
	 abstract Prenda parteSuperior();
	 abstract Prenda parteInferior();
	 abstract Prenda calzado();
}



public class SanJuan implements Institucion{
	public Prenda parteSuperior(){
	  return new Prenda(TipoPrenda.CHOMBA,Categoria.PARTESUPERIOR,Material.PIQUE,null,new Color(0,0,255))
	}
	
	public Prenda parteInferiorr(){
	  return new Prenda(TipoPrenda.PANTALON, Categoria.PARTEINFERIOR, Material.ACETATO,null,new Color(155,155,155)
	}
	
	public Prenda calzado(){
	  return new Prenda(TipoPrenda.ZAPATILLAS,Categoria.CALZADO,Material.CUERO,new Color(255,255,255))
	}
}

public class Johnson implements Institucion{
	public Prenda parteSuperior(){
	  return new Prenda(TipoPrenda.CAMISA,Categoria.PARTESUPERIOR,Material.TELA,Trama.LISA,new Color(255,255,255))
	}
	
	public Prenda parteInferiorr(){
	  return new Prenda(TipoPrenda.PANTALON, Categoria.PARTEINFERIOR, Material.TELA,Trama.LISA,new Color(0,0,0)
	}
	
	public Prenda calzado(){
	  return new Prenda(TipoPrenda.ZAPATO,Categoria.CALZADO,Material.CUERO,new Color(0,0,0))
	}
}
