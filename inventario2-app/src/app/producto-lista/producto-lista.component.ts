import { Component } from '@angular/core';
import { Producto } from '../producto';
import { ProductoService } from '../producto.service';

@Component({
  selector: 'app-producto-lista',
  templateUrl: './producto-lista.component.html',
  styleUrl: './producto-lista.component.css'
})
export class ProductoListaComponent {

productos: Producto[];

constructor(private productoServicio:ProductoService){}

ngOnInit(){
  this.obtenerProductos();
}
private obtenerProductos(){

  this.productoServicio.obtenerProductosLista().subscribe(
datos => {
  this.productos = datos;
});

}

}
