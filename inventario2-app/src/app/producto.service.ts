import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Producto } from './producto';

@Injectable({
  providedIn: 'root'
})
export class ProductoService {

private urlBase = "http://localhost:8080/inventario-app/productos";


  constructor(private clienteHttp: HttpClient) { }

obtenerProductosLista(): Observable<Producto[]>{
  return this.clienteHttp.get<Producto[]>(this.urlBase);
}


}
